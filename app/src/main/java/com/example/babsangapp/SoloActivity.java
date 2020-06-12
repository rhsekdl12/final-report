package com.example.babsangapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class SoloActivity extends AppCompatActivity {

    public static final int [] gsrandom = {

            R.raw.solo_gs1, R.raw.solo_gs2, R.raw.solo_gs3, R.raw.solo_gs4
    };

    public static final int [] curandom = {

            R.raw.solo_cu1, R.raw.solo_cu2, R.raw.solo_cu3,R.raw.solo_cu4
    };

    public static final int [] sevenelevenrandom = {

            R.raw.solo_seven1, R.raw.solo_seven2, R.raw.solo_seven3,R.raw.solo_seven4
    };

    Button solobutton;
    RadioGroup convenience;
    RadioButton gs, cu, seveneleven;
    ImageView imageView;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.solo_layout);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("밥상머리가 이게 뭐~니?");




        solobutton = findViewById(R.id.solobutton);


        convenience = findViewById(R.id.convenience);
        gs = findViewById(R.id.gs);
        cu = findViewById(R.id.cu);
        seveneleven = findViewById(R.id.seveneleven);

        imageView = findViewById(R.id.imageView1);

        solobutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (convenience.getCheckedRadioButtonId()) {
                    case R.id.gs:
                        int gsindex = (int) (Math.random() * 4);
                        int gsmenu = gsrandom[gsindex];
                        imageView.setImageResource(gsmenu);
                        break;

                    case R.id.cu:
                        int cuindex = (int) (Math.random() * 4);
                        int cumenu = curandom[cuindex];
                        imageView.setImageResource(cumenu);
                        break;

                    case R.id.seveneleven:
                        int sevenelevenindex = (int) (Math.random() * 4);
                        int sevenelevenmenu = sevenelevenrandom[sevenelevenindex];
                        imageView.setImageResource(sevenelevenmenu);
                        break;
                }

            }
        });




    }
}
