package com.ist402.jdm5908.burgercaloriecounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RadioGroup pattyRG;
    private CheckBox prosciuttoCBX;
    private RadioGroup cheeseRG;
    private SeekBar sauceSBR;
    private TextView caloriesTV;
    private Burger burger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        burger = new Burger();
        initialize();
        registerChangeListener();
    }

    private void initialize() {
        pattyRG = (RadioGroup) findViewById(R.id.radioGroup1);
        prosciuttoCBX = (CheckBox) findViewById(R.id.checkBox1);
        cheeseRG = (RadioGroup) findViewById(R.id.radioGroup2);
        sauceSBR = (SeekBar) findViewById(R.id.seekBar1);
        caloriesTV = (TextView) findViewById(R.id.textView2);

        displayCalories();
    }

    private void registerChangeListener() {
        pattyRG.setOnCheckedChangeListener(foodListener);
        prosciuttoCBX.setOnClickListener(baconListener);
        cheeseRG.setOnCheckedChangeListener(foodListener);
        sauceSBR.setOnSeekBarChangeListener(sauceListener);
    }


}
