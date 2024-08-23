# Rock paper scissors with Java

このリポジトリは、[Python を使用したオブジェクト指向プログラミングの概要 - Training | Microsoft Learn](https://learn.microsoft.com/ja-jp/training/modules/python-object-oriented-programming/)で登場したじゃんけんゲームのソースコードをJavaで実装し直したものです。

オリジナルのソースコードは下記URLから閲覧できます。

https://github.com/MicrosoftDocs/mslearn-python-oo

## 遊び方

先攻あるいは後攻となるプレイヤー2名を決めます。先攻の名前は `Spock`, 後攻の名前は `Kirk` です。

`Main.java` を実行すると、先攻が出す手を入力するようコンソールに次のようなメッセージが表示されます。

```
Spock, select rock, paper or scissor: 
```

先攻が出す手を入力すると、次に後攻が出す手を入力するようコンソールに次のようなメッセージが表示されます。

```
Kirk, select rock, paper or scissor: 
```

後攻が出す手が入力されると、先攻から見た勝敗が表示されます。勝った方に1ポイントが加算されます。その後ゲームを続けるかどうかコンソールに次のようなメッセージが表示されます。

```
Continue game y/n: 
```

`y` を入力するとゲームが継続され、再び先攻が出す手を入力するよう促されます。

そうでなければゲームが終了し、先攻と後攻の総得点と最終的な勝者が表示されます。

## 実装していない点

- 拡張された新しい「手」である `lizard` と `Spock` は実装していません。
- `GameRound` クラスの `awardPoints()` メソッドは、もとのソースコードでも何の処理も行わないので実装していません。

## 原典からの変更点

`GameRound` クラスについて、コンストラクタにゲームラウンドをスタートさせた後の処理を書くのは好ましくないと考えたため、その処理を `start()` メソッドに分離しました。
