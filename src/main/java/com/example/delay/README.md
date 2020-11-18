# シングルトンの遅延初期化

## シングルトンの実装方法

### 定数フィールドで保持する

例：SingletonSimple

- 定数フィールドを宣言しコンストラクタで初期化する。
- ロードされるタイミングでインスタンスが生成される。

```java
private static final SingletonSimple INSTANCE = new SingletonSimple()
```

#### メリット

- 実装がシンプル

### デメリット

- クラス宣言されたタイミングでインスタンスが生成されてしまう。（例：PrintMainクラス）

    たとえば、 `SingletonSimle#print()` メソッドのようにインスタンス生成が必要がない場合も、
    インスタンスが生成されてしまう。
    
- クラス宣言されたタイミングで生成されるため、実装者がインスタンス生成のタイミングを制御できない。

### ホルダークラスを用いて保持する

例：SingletonDelay

- ホルダークラスをprivateクラスで宣言し、その中でインスタンスを保持する。
- `getInstance()`が呼ばれるとSingletonHolderがロードされ、インスタンスが生成される。

```java
public static SingletonDelay getInstance() {
    System.out.println("SingletonDelay.getInstance");
    return SingletonHolder.INSTANCE;
}

private static class SingletonHolder {

    private static final SingletonDelay INSTANCE = new SingletonDelay();

}
```

### メリット

- クラスがロードされるタイミングでは、インスタンスは生成されない。（例：PrintMainクラス）

     たとえば、 `SingletonDelay#print()` メソッドのようにインスタンス生成が必要がない場合は、
     インスタンスが生成されない。

- 実装者が生成のタイミングを制御できる

### デメリット

- 実装量が多くなる

## どちらを使うべき？

- ネット上ではホルダークラスを用いて保持する方を推奨することが多い。
- 開発者が生成のタイミングを制御できるのは、これといったいい点は見つからなかったけど、
コードを読んだ時に分かりやすいとは思った。
- 例でも示した通りprivateメソッドがあるときとか、
宣言はするけど、条件によってはインスタンス生成するかわからないような実装では、効果的であると感じた。

