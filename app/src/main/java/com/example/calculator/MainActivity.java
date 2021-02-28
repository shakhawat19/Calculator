package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView display;
    private Button press;
    private TextView display2;
    private Button press2;
    private TextView display3;
    private Button press3;
    private TextView display4;
    private Button press4;
    private TextView display5;
    private Button press5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display=(TextView) findViewById(R.id.tvDisplay);
        press=(Button)findViewById(R.id.btnPress);
        press.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText("1");
                Toast.makeText(MainActivity.this,"Press Done",Toast.LENGTH_SHORT).show();
            }
        });


        display2=(TextView) findViewById(R.id.tvDisplay2);
        press2=(Button) findViewById(R.id.btnPress2);
        press2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display2.setText("2");
                Toast.makeText(MainActivity.this,"Press Done",Toast.LENGTH_SHORT).show();
            }
        });

        display3=(TextView) findViewById(R.id.tvDisplay3);
        press3=(Button) findViewById(R.id.btnPress3);
        press3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display3.setText("3");
                Toast.makeText(MainActivity.this,"Press Done",Toast.LENGTH_SHORT).show();
            }
        });


        display4=(TextView) findViewById(R.id.tvDisplay4);
        press4=(Button) findViewById(R.id.btnPress4);
        press4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display4.setText("4");
                Toast.makeText(MainActivity.this,"Press Done",Toast.LENGTH_SHORT).show();
            }
        });


        display5=(TextView) findViewById(R.id.tvDisplay5);
        press5=(Button) findViewById(R.id.btnPress5);
        press5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display5.setText("5");
                Toast.makeText(MainActivity.this,"Press Done",Toast.LENGTH_SHORT).show();
            }
        });

    }
}