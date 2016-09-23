/* Solution to Chapter 10, Exercise 2 in Teach Yourself Java in 21 Days (Covering Java 8
   and Android by Rogers Cadenhead. */

package com.java21days;

import javax.swing.*;

public class TitleFrame extends JFrame {
    public TitleFrame() {
        super("Title Frame");
        setLookAndFeel();
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        String response = JOptionPane.showInputDialog(null,
            "Enter a Title for the Frame:");
        setTitle(response);
    }

    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception e) {
            System.err.println("Couldn't use the system "
                + "look and feel: " + e);
        }
    }
    
    public static void main(String[] arguments) {
        JFrame frame = new TitleFrame();
    }
}
