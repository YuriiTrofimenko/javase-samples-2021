package org.tyaa.demo.javase.samples;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        try {
            String action = args[0];
            switch (action) {
                case "say-hello": {
                    System.out.println("Hello!");
                    break;
                }
                case "show-time": {
                    System.out.println(new Date());
                    break;
                }
                default: {
                    System.out.println("Unknown argument");
                }
            }
        } catch (Exception ex) {
            // ex.printStackTrace();
            System.out.println("No argument");
        }
    }
}
