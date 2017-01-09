package tsyki.java_conf.gr.jp.androidtutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.addButton).setOnClickListener(this);
        findViewById(R.id.minusButton).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        EditText numberText1 = (EditText) findViewById(R.id.numberText1);
        EditText numberText2 = (EditText) findViewById(R.id.numberText2);
        String numberString1 = numberText1.getText().toString();
        String numberString2 = numberText2.getText().toString();
        // TODO ここで空文字チェックが必要
        int number1 = Integer.parseInt(numberString1);
        int number2 = Integer.parseInt(numberString2);

        TextView textView = (TextView) findViewById(R.id.resultText);

        int clickedWidgetId = view.getId();
        int calcResult;
        switch(clickedWidgetId){
            case R.id.addButton:
                calcResult = number1 + number2;
                break;
            case R.id.minusButton:
                calcResult = number1 - number2;
                break;
            default:
                calcResult = 0;
                break;
        }
        textView.setText(String.valueOf(calcResult));
    }
}
