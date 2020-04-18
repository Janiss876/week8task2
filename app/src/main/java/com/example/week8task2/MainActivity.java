package com.example.week8task2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView bottom;
    TextView money;
    SeekBar slider;
    BottleDispenser bottled = BottleDispenser.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottom = (TextView) findViewById(R.id.bottomText);
    }

    public void add(View v) {
        bottled.addMoney(bottom, 1);
    }

    public void buy(View v) {
        bottled.buyBottle(1, bottom);
    }

    public void returnMoney(View v) {
        bottled.returnMoney(bottom);
    }
}

