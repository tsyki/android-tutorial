package tsyki.java_conf.gr.jp.androidtutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // XXX ここでoperationは+、-などの文字列にしたいが、equalsを使う必要があるので避ける
        int operation = 0;
        int num1 = 2;
        int num2 = 3;
        int calcResult;
        if (operation == 0) {
            calcResult = num1 + num2;
        } else {
            calcResult = num1 - num2;
        }
        System.out.println("if " + calcResult);

        switch (operation) {
            case 0:
                calcResult = num1 + num2;
                break;
            case 1:
                calcResult = num1 - num2;
                break;
            default:
                calcResult = 0;
                break;
        }
        System.out.println("switch " + calcResult);

        // 10回繰り返し
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            // XXX ここは標準出力などにしたい
            sum = sum + 1;
        }
        System.out.println("for " + sum);

        // 1から10の合計
        sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("for2 " + sum);

        // 逆バージョン
        sum = 0;
        for (int i = 10; i > 0; i--) {
            sum += i;
        }
        System.out.println("for3 " + sum);

        // conitnue
        // 奇数のみ表示
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
        // while
        sum = 0;
        int i = 1;
        while (i <= 10) {
            sum += i;
            i++;
        }
        System.out.println("while " + sum);

        // 四則演算サンプル
        // 引き算(減算)
        // int calcResult = num1 - num2;
        // 掛け算(乗算)
        // int calcResult = num1 * num2;
        // 計算順序の制御
        // int calcResult = 1 + 2 * 3;
        // int calcResult = (1 + 2) * 3;
        // 割り算(除算)
        // 上手くいかない例
        // int calcResult = num1 / num2;
        // 小数型を使う
        // double num1 = 2;
        // double num2 = 3;
        // double calcResult = num1 / num2;
        // XXX BigDecimalを使った丸め方の指定はここではやらない

        // 計算結果を文字列型に変換
        String calcResultString = String.valueOf(calcResult);
        // レイアウト
        // においたテキスト部品を取得(おまじない)
        TextView textView = (TextView) findViewById(R.id.text);
        // 計算結果を画面に表示させる
        textView.setText(calcResultString);
    }
}
