/* Solution to Chapter 3, Exercise 2 in Teach Yourself Java in 21 Days (Covering Java 8
   and Android by Rogers Cadenhead. */

package com.java21days;

class Sampler {
    public static void main(String[] arguments) {
        Sample thing = new Sample();
        thing.height = 72;
        thing.weight = 1000;
        thing.depth = 420;
        System.out.println("Height: " + thing.height);
        System.out.println("Weight: " + thing.weight);
        System.out.println("Depth: " + thing.depth);
    }
}
