package com.example.delay;

public class SingletonDelay {

    static {
        System.out.println("SingletonDelay: static initializer");
    }

    /**
     * コンストラクタ
     */
    private SingletonDelay() {
        System.out.println("SingletonDelay: constructor");
    }

    /**
     * {@code SingletonDelay}のインスタンスを返す。
     * <p>
     * {@code SingletonHolder}内のインスタンスを返す。
     *
     * @return {@code SingletonDelay}のインスタンス
     */
    public static SingletonDelay getInstance() {
        System.out.println("SingletonDelay.getInstance");
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
            System.out.println("SingletonHolder: static initializer");
        }

        private static final SingletonDelay INSTANCE = new SingletonDelay();

    }

    /**
     * インスタンスを生成しなくても呼べるメソッド
     */
    public static void print() {
        System.out.println("SingletonDelay: static method");
    }

}
