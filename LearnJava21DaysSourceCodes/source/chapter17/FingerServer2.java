/* Solution to Chapter 17, Exercise 2 in Teach Yourself Java in 21 Days (Covering Java 8
   and Android by Rogers Cadenhead. */

package com.java21days;

import java.io.*;
import java.net.*;
import java.nio.channels.*;
import java.util.*;

public class FingerServer2 {

    public FingerServer2() {
        try (ServerSocketChannel sock = ServerSocketChannel.open();
            ServerSocket socket = sock.socket()) {
            
            sock.configureBlocking(false);

            // Set the host and port to monitor
            InetSocketAddress server = new InetSocketAddress(
                "localhost", 79);
            socket.bind(server);

            // Create the selector and register it on the channel
            Selector selector = Selector.open();
            sock.register(selector, SelectionKey.OP_ACCEPT);

            // Loop forever, looking for client connections
            while (true) {
                // Wait for a connection
                selector.select();

                // Get list of selection keys with pending events
                Set keys = selector.selectedKeys();
                Iterator it = keys.iterator();

                // Handle each key
                while (it.hasNext()) {

                    // Get the key and remove it from the iteration
                    SelectionKey sKey = (SelectionKey) it.next();

                    it.remove();
                    if (sKey.isAcceptable()) {

                        // Create a socket connection with client
                        ServerSocketChannel selChannel =
                            (ServerSocketChannel) sKey.channel();
                        ServerSocket sSock = selChannel.socket();
                        
                        try (Socket connection = sSock.accept()) {
                            // Handle the finger request
                            handleRequest(connection);
                        }
                    }
                }
             }
         } catch (IOException ioe) {
             System.out.println(ioe.getMessage());
         }
     }

    private void handleRequest(Socket connection)
        throws IOException {

        // Set up input and output
        InputStreamReader isr = new InputStreamReader (
            connection.getInputStream());
        BufferedReader is = new BufferedReader(isr);
        PrintWriter pw = new PrintWriter(new
            BufferedOutputStream(connection.getOutputStream()),
            false);

        // Output server greeting
        pw.println("Nio Finger Server");
        pw.flush();

        // Handle user input
        String outLine = null;
        String inLine = is.readLine();

        if (inLine.length() > 0) {
            outLine = inLine;
        }
        readPlan(outLine, pw);

        // Clean up
        pw.flush();
        pw.close();
        is.close();
    }

    private void readPlan(String userName, PrintWriter pw) {
        try (FileReader file = new FileReader(userName + ".plan");
            BufferedReader buff = new BufferedReader(file)) {
            boolean eof = false;

            pw.println("\nUser name: " + userName + "\n");

            while (!eof) {
                String line = buff.readLine();

                if (line == null) {
                    eof = true;
                } else {
                   pw.println(line);
                }
            }

            buff.close();
        } catch (IOException e) {
            pw.println("User " + userName + " not found.");
        }
    }

    public static void main(String[] arguments) {
        new FingerServer2();
    }
}
