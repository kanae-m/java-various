package com.example.delay;

public class GetInstanceMain {

    public static void main(String[] args) {
        System.out.println("*****Start: SingletonSimple.getInstance()****");
        System.out.println("---first---");
        System.out.println(SingletonSimple.getInstance());
        System.out.println("---second---");
        System.out.println(SingletonSimple.getInstance());

        System.out.println();

        System.out.println("*****Start: SingletonDelay.getInstance()****");
        System.out.println("---first---");
        System.out.println(SingletonDelay.getInstance());
        System.out.println("---second---");
        System.out.println(SingletonDelay.getInstance());
    }

}
