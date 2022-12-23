package org.example;

import java.util.Random;

public class Generator {
    private static char randomChar() {
        Random r = new Random();
        return (char)(r.nextInt(26) + 'A');
    }

    public static void main(String[] args) {
        char c = randomChar();
        System.out.println(c);
    }
}
