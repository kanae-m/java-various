package com.example.sync;

import com.example.util.PrintUtil;
import lombok.Synchronized;

public class Bathroom {

    @Synchronized
    void bathing(String name) {
        PrintUtil.println(name + "「お風呂に入ります！」");
        for (int count = 0; count < 100000; count++) {
            if (count == 1000) {
                PrintUtil.println(name + "「入浴中！」");
            }
        }
        PrintUtil.println(name + "「お風呂から出ました！」");
    }

    @Synchronized
    void clean(String name) {
        PrintUtil.println(name + "「お風呂を掃除します！」");
        for (int count = 0; count < 100000; count++) {
            if (count == 1000) {
                PrintUtil.println(name + "「掃除中！」");
                PrintUtil.println(name + "「転んだ！」");
            }
        }
        PrintUtil.println(name + "「お風呂を掃除し終わりました！」");
    }

}
