package com.example.babsangapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    RadioGroup rGroup1;
    RadioButton rButton1, rButton2, rButton3, rButton4;
    Button BtnOK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("밥상머리가 이게 뭐~니?");



        rGroup1 = findViewById(R.id.rGroup1);
        rButton1 = findViewById(R.id.rButton1);
        rButton2 = findViewById(R.id.rButton2);
        rButton3 = findViewById(R.id.rButton3);
        rButton4 = findViewById(R.id.rButton4);
        BtnOK = findViewById(R.id.BtnOK);

        BtnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (rGroup1.getCheckedRadioButtonId()) {
                    case R.id.rButton1:
                        Intent BasicIntent = new Intent(getApplicationContext(), BasicActivity.class);
                        startActivity(BasicIntent);
                        break;

                    case R.id.rButton2:
                        Intent HealthyIntent = new Intent(getApplicationContext(), HealthyActivity.class);
                        startActivity(HealthyIntent);
                        break;

                    case R.id.rButton3:
                        Intent BiggerIntent = new Intent(getApplicationContext(), BiggerActivity.class);
                        startActivity(BiggerIntent);
                        break;

                    case R.id.rButton4:
                        Intent SoloIntent = new Intent(getApplicationContext(), SoloActivity.class);
                        startActivity(SoloIntent);
                        break;
            }
            }
        });

    }
}
