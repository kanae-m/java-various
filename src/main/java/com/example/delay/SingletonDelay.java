package com.example.delay;

import com.example.util.PrintUtil;

public class SingletonDelay {

    static {
        PrintUtil.println("SingletonDelay: static initializer");
    }

    /**
     * コンストラクタ
     */
    private SingletonDelay() {
        PrintUtil.println("SingletonDelay: constructor");
    }

    /**
     * {@code SingletonDelay}のインスタンスを返す。
     * <p>
     * {@code SingletonHolder}内のインスタンスを返す。
     *
     * @return {@code SingletonDelay}のインスタンス
     */
    public static SingletonDelay getInstance() {
        PrintUtil.println("SingletonDelay.getInstance");
        return SingletonHolder.INSTANCE;
    }

    /**
     * インスタンスを保持する。
     * <p>
     * {@code SingletonHolder}が宣言されたときに{@code SingletonHolder}クラスがロードされるので、
     * {@code SingletonHolder}が最初に呼ばれたときに{@code SingletonDelay}が作成される。
     * つまり、{@code SingletonDelay#getInstance()}が初めて呼ばれたときに
     * {@code SingletonDelay}のインスタンスが生成される。
     * 以降は、すでに生成されている{@code SingletonDelay}インスタンスを保持する。
     */
    private static class SingletonHolder {

        static {
            PrintUtil.println("SingletonHolder: static initializer");
        }

        private static final SingletonDelay INSTANCE = new SingletonDelay();

    }

    /**
     * インスタンスを生成しなくても呼べるメソッド
     */
    public static void print() {
        PrintUtil.println("SingletonDelay: static method");
    }

}
