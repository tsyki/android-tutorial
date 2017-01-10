package tsyki.java_conf.gr.jp.androidtutorial;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        findViewById(R.id.backButton).setOnClickListener(this);

        // TODO ここで画像とメッセージを設定
        String result = getIntent().getStringExtra("result");
        TextView resultText = (TextView) findViewById(R.id.resultMessageText);
        resultText.setText(result);
    }

    @Override
    public void onClick(View view) {
        // ボタンは一つしかないのでidの判定は不要
        // 元の画面に戻るならfinishのみでOK
        finish();
    }
}
