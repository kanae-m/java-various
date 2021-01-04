package com.example.sync;

import com.example.util.PrintUtil;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CleanThread extends Thread {

    private final Bathroom bathroom;
    private final String name;

    @Override
    public void run() {
        try {
            bathroom.clean(name);
        } catch (Exception e) {
            PrintUtil.println(e.getMessage());
            throw new RuntimeException("掃除に失敗！");
        }
    }

}
