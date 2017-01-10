package tsyki.java_conf.gr.jp.androidtutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.drawButton).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        // ボタンは一つしかないのでidの判定は不要
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("result", "Daikichi");
        startActivity(intent);
    }
}
