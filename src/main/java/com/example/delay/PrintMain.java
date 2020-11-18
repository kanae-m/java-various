package com.example.delay;

public class PrintMain {

    public static void main(String[] args) {
        System.out.println("---Start: SingletonSimple.print()---");
        SingletonSimple.print();

        System.out.println();

        System.out.println("---Start: SingletonDelay.print()---");
        SingletonDelay.print();
    }

}
