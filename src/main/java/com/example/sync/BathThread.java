package com.example.sync;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BathThread extends Thread {

    private final Bathroom bathroom;
    private final String name;

    @Override
    public void run() {
        bathroom.bathing(name);
    }

}
