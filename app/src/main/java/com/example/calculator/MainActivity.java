package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView display;
    private TextView display2;
    private Button press1;
    private Button press2;
    private Button press3;
    private Button press4;
    private Button press5;
    private Button btnPlus;

    void initialViews() {
        display2 = (TextView) findViewById(R.id.tvDisplay);
        display2 = (TextView) findViewById(R.id.tvDisplay2);
        press1 = (Button) findViewById(R.id.btn1);
        press2 = (Button) findViewById(R.id.btn2);
        press3 = (Button) findViewById(R.id.btn3);
        press4 = (Button) findViewById(R.id.btn4);
        press5 = (Button) findViewById(R.id.btn5);
        btnPlus = (Button) findViewById(R.id.btnPlus);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialViews();
        press1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setDigit("1");

            }
        });


        press2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setDigit("2");

            }
        });


        press3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setDigit("3");

            }
        });


        press4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setDigit("4");

            }
        });


        press5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setDigit("5");

            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setDigit("+");

            }
        });

    }

    void setDigit(String digit) {
        if (digit.equals("+")) {
            String tem = display2.getText().toString();
            int a = Integer.parseInt(tem);
            display.setText(String.valueOf(a) + "+");
            display2.setText("");

        } else {
            String tem = display2.getText() + digit;
            display2.setText(tem);
        }

    }
}