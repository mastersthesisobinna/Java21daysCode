/* Solution to Chapter 9, Exercise 1 in Teach Yourself Java in 21 Days (Covering Java 8
   and Android by Rogers Cadenhead. */

package com.java21days;

import javax.swing.*;

public class DVR extends JFrame {
    JButton play = new JButton("Play");
    JButton stopEject = new JButton("Stop/Eject");
    JButton rewind = new JButton("Rewind");
    JButton fastForward = new JButton("Fast Forward");
    JButton pause = new JButton("Pause");
    
    public DVR() {
        super("DVR");
        setSize(540, 80);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel pane = new JPanel();
        pane.add(play);
        pane.add(stopEject);
        pane.add(rewind);
        pane.add(fastForward);
        pane.add(pause);
        setContentPane(pane);
        setVisible(true);
}

    public static void main(String[] arguments) {
        DVR dvr = new DVR();
    }
}
