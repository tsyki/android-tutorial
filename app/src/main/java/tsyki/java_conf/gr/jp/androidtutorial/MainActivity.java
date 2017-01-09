package tsyki.java_conf.gr.jp.androidtutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int num1 = 2;
        int num2 = 3;
        int calcResult = num1 + num2;

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
