package com.example.sync;

import com.example.util.PrintUtil;

public class Main {

    public static void main(String[] args) {
        Bathroom bathroom = new Bathroom();
        BathThread father = new BathThread(bathroom, "父");
        CleanThread me = new CleanThread(bathroom, "私");
        BathThread mother = new BathThread(bathroom, "母");
        BathThread sister = new BathThread(bathroom, "姉");

        father.start();

        Thread.UncaughtExceptionHandler handler = (t, e) -> {
            PrintUtil.println("さては掃除に失敗したな？");
            e.printStackTrace();
        };
        me.setUncaughtExceptionHandler(handler);
        me.start();

        mother.start();
        sister.start();
    }

}
