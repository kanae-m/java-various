package com.example.finalize;

import java.lang.ref.Cleaner;

public class TestClean {

    public static void main(String[] args) {
        Clean s = new Clean();
        s = null;

        System.out.println("System.gc()-start");
        System.gc();
        System.out.println("System.gc()-end");
    }

}

class Clean {

    private static final Cleaner cleaner = Cleaner.create();

    Clean() {
        System.out.println("constructor");
        CloseObject obj = new CloseObject();
        CloseRunnable closeRunnable = new CloseRunnable(obj);
        Cleaner.Cleanable cleanable = cleaner.register(this, closeRunnable);
    }

}

class CloseObject {

    void close() {
        System.out.println("close");
    }

}

class CloseRunnable implements Runnable {

    private CloseObject obj;

    CloseRunnable(CloseObject obj) {
        this.obj = obj;
    }

    public void run() {
        System.out.println("Runnable.run()");
        obj.close();
    }

}
