/* Solution to Chapter 20, Exercise 2 in Teach Yourself Java in 21 Days (Covering Java 8
   and Android by Rogers Cadenhead. */

package com.java21days;

import java.util.HashMap;

public interface PingHandler {
    public HashMap ping(String siteName, String url);
}