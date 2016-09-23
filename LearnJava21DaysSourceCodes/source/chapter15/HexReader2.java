/* Solution to Chapter 15, Exercise 1 in Teach Yourself Java in 21 Days (Covering Java 8
   and Android by Rogers Cadenhead. */

package com.java21days;

import java.io.*;

class HexReader2 {

    public HexReader2() {
        FileReader file;
        try {
            file = new FileReader("hexfile.txt");
            BufferedReader buff = new BufferedReader(file);

            boolean eof = false;
            while (!eof) {
                String line = buff.readLine();
                if (line == null) {
                    eof = true;
                } else {
                    readLine(line);
                }
            }
            buff.close();
        } catch (IOException ex) {
            System.out.println("IO error " + ex.getMessage());
        }
    }

    private void readLine(String code) {
        try {
            for (int j = 0; j + 1 < code.length(); j += 2) {
                String sub = code.substring(j, j+2);
                int num = Integer.parseInt(sub, 16);
                if (num == 255) {
                    return;
                }
                System.out.print(num + " ");
            }
        } finally {
            System.out.println("**");
        }
    }
    
    public static void main(String[] arguments) {
        new HexReader2();
    }
}
