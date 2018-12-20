package com.example.khusrav.calculatorproject1_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button buttonequal;
    Button buttondelete;
    Button buttonminus;
    Button buttonsum;
    Button buttondivision;
    Button buttonmultiplications;
    TextView textView;
    int cklickbutton = 0;
    ArrayList<Long> numbers = new ArrayList<>();
    StringBuilder lastnumber = new StringBuilder("0");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttondelete = findViewById(R.id.buttonDelete);
        buttonequal = findViewById(R.id.buttonEqual);
        buttonminus = findViewById(R.id.buttonMinus);
        buttondivision = findViewById(R.id.buttonDivision);
        buttonmultiplications = findViewById(R.id.buttonMultiplications);
        buttonsum = findViewById(R.id.buttonSum);
        textView = findViewById(R.id.textView);
        textView.setText(lastnumber);
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(lastnumber.charAt(0) == '0')
                    lastnumber.deleteCharAt(0);
                switch (v.getId()){
                    case R.id.button0:
                        lastnumber.append("0");
                        textView.setText(lastnumber);
                        break;
                    case R.id.button1:
                        lastnumber.append("1");
                        textView.setText(lastnumber);
                        break;
                    case R.id.button2:
                        lastnumber.append("2");
                        textView.setText(lastnumber);
                        break;
                    case R.id.button3:
                        lastnumber.append("3");
                        textView.setText(lastnumber);
                        break;
                    case R.id.button4:
                        lastnumber.append("4");
                        textView.setText(lastnumber);
                        break;
                    case R.id.button5:
                        lastnumber.append("5");
                        textView.setText(lastnumber);
                        break;
                    case R.id.button6:
                        lastnumber.append("6");
                        textView.setText(lastnumber);
                        break;
                    case R.id.button7:
                        lastnumber.append("7");
                        textView.setText(lastnumber);
                        break;
                    case R.id.button8:
                        lastnumber.append("8");
                        textView.setText(lastnumber);
                        break;
                    case R.id.button9:
                        lastnumber.append("9");
                        textView.setText(lastnumber);
                        break;
                }
            }
        };
        button0.setOnClickListener(onClickListener);
        button1.setOnClickListener(onClickListener);
        button2.setOnClickListener(onClickListener);
        button3.setOnClickListener(onClickListener);
        button4.setOnClickListener(onClickListener);
        button5.setOnClickListener(onClickListener);
        button6.setOnClickListener(onClickListener);
        button7.setOnClickListener(onClickListener);
        button8.setOnClickListener(onClickListener);
        button9.setOnClickListener(onClickListener);
        buttonsum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(lastnumber.length() > 0) {
                    if(numbers.size() == 0) {
                        numbers.add(Long.parseLong(lastnumber.toString()));
                    }
                    else{
                        Long number = Long.parseLong(lastnumber.toString());
                        if(1 <= cklickbutton && cklickbutton <= 4) {
                            numbers.add(getAns(number, cklickbutton));
                        }
                    }
                    lastnumber.delete(1 , lastnumber.length());
                    lastnumber.deleteCharAt(0);
                    lastnumber = new StringBuilder("0");
                }
                textView.setText(numbers.get(numbers.size() - 1).toString());
                cklickbutton = 1 ;
            }
        });
        buttonminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(lastnumber.length() > 0) {
                    if(numbers.size() == 0) {
                        numbers.add(Long.parseLong(lastnumber.toString()));
                    }
                    else{
                        Long number = Long.parseLong(lastnumber.toString());
                        if(1 <= cklickbutton && cklickbutton <= 4) {
                            numbers.add(getAns(number, cklickbutton));
                        }
                    }
                    lastnumber.delete(1 , lastnumber.length());
                    lastnumber.deleteCharAt(0);
                    lastnumber = new StringBuilder("0");
                }
                textView.setText(numbers.get(numbers.size() - 1).toString());
                cklickbutton = 2 ;
            }
        });
        buttonmultiplications.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(lastnumber.length() > 0) {
                    if(numbers.size() == 0) {
                        numbers.add(Long.parseLong(lastnumber.toString()));
                    }
                    else{
                        Long number = Long.parseLong(lastnumber.toString());
                        if(1 <= cklickbutton && cklickbutton <= 4) {
                            numbers.add(getAns(number, cklickbutton));
                        }
                    }
                    lastnumber.delete(1 , lastnumber.length());
                    lastnumber.deleteCharAt(0);
                    lastnumber = new StringBuilder("0");
                }
                textView.setText(numbers.get(numbers.size() - 1).toString());
                cklickbutton = 3 ;
            }
        });
        buttondivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(lastnumber.length() > 0) {
                    if(numbers.size() == 0) {
                        numbers.add(Long.parseLong(lastnumber.toString()));
                    }
                    else{
                        Long number = Long.parseLong(lastnumber.toString());
                        if(1 <= cklickbutton && cklickbutton <= 4) {
                            numbers.add(getAns(number, cklickbutton));
                        }
                    }
                    lastnumber.delete(1 , lastnumber.length());
                    lastnumber.deleteCharAt(0);
                    lastnumber = new StringBuilder("0");
                }
                textView.setText(numbers.get(numbers.size() - 1).toString());
                cklickbutton = 4 ;
            }
        });
        buttonequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(lastnumber.length() > 0) {
                    if(numbers.size() == 0) {
                        numbers.add(Long.parseLong(lastnumber.toString()));
                    }
                    else{
                        Long number = Long.parseLong(lastnumber.toString());
                        if(1 <= cklickbutton && cklickbutton <= 4) {
                            numbers.add(getAns(number, cklickbutton));
                        }
                    }
                    lastnumber.delete(1 , lastnumber.length());
                    lastnumber.deleteCharAt(0);
                    lastnumber = new StringBuilder("0");
                }
                textView.setText(numbers.get(numbers.size() - 1).toString());
                cklickbutton = 5 ;
            }
        });
        buttondelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers.clear();
                lastnumber.delete(0 , lastnumber.length());
                lastnumber = new StringBuilder("0");
                textView.setText(lastnumber.toString());
            }
        });
    }
    public Long getAns(Long number , int clickbutton){
        if(clickbutton == 1) {
            return numbers.get(numbers.size() - 1) + number;
        }
        if (clickbutton == 2){
            return numbers.get(numbers.size() - 1) - number;
        }
        if(clickbutton == 3){
            return numbers.get(numbers.size() - 1) * number;
        }
        return numbers.get(numbers.size() - 1) / number;
    }
}
