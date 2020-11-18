package com.example.delay;

public class SingletonSimple {

    static {
        System.out.println("SingletonSimple: static initializer");
    }

    /**
     * {@code SingletonSimple}のインスタンス
     * <p>
     * {@code SingletonSimple}が宣言されたときに{@code SingletonSimple}クラスがロードされて、
     * {@code SingletonSimple}のコンストラクタが呼ばれ、インスタンスが生成される。
     * 一回目の宣言以降はすでに生成されている{@code SingletonSimple}インスタンスを返す。
     */
    private static final SingletonSimple INSTANCE = new SingletonSimple();

    /**
     * コンストラクタ
     */
    private SingletonSimple() {
        System.out.println("SingletonSimple: constructor");
    }

    /**
     * {@code SingletonSimple}のインスタンスのインスタンスを返す。
     * <p>
     * {@code private static final}で宣言されている{@code INSTANCE}メンバーを返す。
     *
     * @return　{@code SingletonSimple}のインスタンス
     */
    public static SingletonSimple getInstance() {
        System.out.println("SingletonSimple: getInstance");
        return INSTANCE;
    }

    /**
     * インスタンスを生成しなくても呼べるメソッド
     */
    public static void print() {
        System.out.println("SingletonSimple: static method");
    }

}
