package com.example.khusrav.l0001_view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main extends AppCompatActivity {
    EditText editText;
    Button button1;
    Button button2;
    Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitytwo);
        TextView textView = (TextView) findViewById(R.id.label);
        textView.append("Yes");
        Button btn = (Button) findViewById(R.id.ok);
        btn.setText("ok-two");
        btn.setEnabled(false);
        editText = findViewById(R.id.enter);
        button1 = findViewById(R.id.button11);
        button2 = findViewById(R.id.button22);
        button3 = findViewById(R.id.button33);
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.button11:
                        editText.append("1");
                        break;
                    case R.id.button22:
                        editText.append("2");
                        break;
                    case R.id.button33:
                        editText.append("-");
                        break;
                }
            }
        };
        editText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("Yes");
            }
        });
        button1.setOnClickListener(onClickListener);
        button2.setOnClickListener(onClickListener);
        button3.setOnClickListener(onClickListener);
       /* button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.append("2");
            }
        });*/
    }
    /*public void clickButton1(View v){
        editText.append("1");
    }
    public void clickButton2(View v){
        editText.append("2");
    }*/
    /*public void clickButton3(View v){
        editText.append("3");
    }*/
}
