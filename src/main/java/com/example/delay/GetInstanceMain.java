package com.example.delay;

import com.example.util.PrintUtil;

public class GetInstanceMain {

    public static void main(String[] args) {
        PrintUtil.println("*****Start: SingletonSimple.getInstance()****");
        PrintUtil.println("---first---");
        PrintUtil.println(SingletonSimple.getInstance());
        PrintUtil.println("---second---");
        PrintUtil.println(SingletonSimple.getInstance());

        PrintUtil.println();

        PrintUtil.println("*****Start: SingletonDelay.getInstance()****");
        PrintUtil.println("---first---");
        PrintUtil.println(SingletonDelay.getInstance());
        PrintUtil.println("---second---");
        PrintUtil.println(SingletonDelay.getInstance());
    }

}
