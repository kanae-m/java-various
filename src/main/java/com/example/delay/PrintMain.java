package com.example.delay;

import com.example.util.PrintUtil;

public class PrintMain {

    public static void main(String[] args) {
        PrintUtil.println("---Start: SingletonSimple.print()---");
        SingletonSimple.print();

        PrintUtil.println();

        PrintUtil.println("---Start: SingletonDelay.print()---");
        SingletonDelay.print();
    }

}
