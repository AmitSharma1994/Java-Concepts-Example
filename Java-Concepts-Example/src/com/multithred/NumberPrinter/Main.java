package com.multithred.NumberPrinter;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            NumberPrinter numberPrinter = new NumberPrinter(i);
            Thread thread = new Thread(numberPrinter);
            thread.start();
        }
    }
}
