package com.example.babsangapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    RadioGroup rGroup1;
    RadioButton rButton1, rButton2, rButton3, rButton4;
    Button BtnOK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rGroup1 = (RadioGroup)findViewById(R.id.rGroup1);
        rButton1 = (RadioButton)findViewById(R.id.rButton1);
        rButton2 = (RadioButton)findViewById(R.id.rButton2);
        rButton3 = (RadioButton)findViewById(R.id.rButton3);
        rButton4 = (RadioButton)findViewById(R.id.rButton4);
        BtnOK = (Button)findViewById(R.id.BtnOK);

        BtnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (rGroup1.getCheckedRadioButtonId()) {
                    case R.id.rButton1:
                        Intent intent = new Intent(getApplicationContext(), BasicActivity.class);
                        break;

                }
            }
        });








            }
        }



