package tsyki.java_conf.gr.jp.androidtutorial;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        findViewById(R.id.backButton).setOnClickListener(this);

        // ここで画像とメッセージを設定
        int result = getIntent().getIntExtra("result", 0);
        int imageResource;
        String message;
        // おみくじ画面から受け取った結果に応じて判定
        switch(result){
            case 0:
                imageResource = R.drawable.daikichi;
                message = "待人：必ず来る\n仕事：楽しい";
                break;
            case 1:
                imageResource = R.drawable.kichi;
                message = "ラッキーアイテム：おもち";
                break;
            case 2:
                imageResource = R.drawable.suekichi;
                message = "末吉！";
                break;
            case 3:
                imageResource = R.drawable.syoukichi;
                message = "小吉！";
                break;
            default:
                imageResource = R.drawable.daikichi;
                message = "error";
        }
        // 画像を設定
        ImageView resultImage = (ImageView) findViewById(R.id.imageView);
        resultImage.setImageResource(imageResource);
        // メッセージを設定
        TextView resultText = (TextView) findViewById(R.id.resultMessageText);
        resultText.setText(message);
    }

    @Override
    public void onClick(View view) {
        // ボタンは一つしかないのでidの判定は不要
        // 元の画面に戻るならfinishのみでOK
        finish();
    }
}
