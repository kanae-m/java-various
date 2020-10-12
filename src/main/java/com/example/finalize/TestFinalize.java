package com.example.finalize;

public class TestFinalize {

    public static void main(String[] args) {
        Finalize s = new Finalize();
        s = null;

        System.out.println("System.gc()-start");
        System.gc();
        System.out.println("System.gc()-end");
    }

}

class Finalize {

    public Finalize() {
        System.out.println("constructor");
    }

    public void close() {
        System.out.println("close");
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("finalize()");
            this.close();
        } finally {
            super.finalize();
        }
    }

}
