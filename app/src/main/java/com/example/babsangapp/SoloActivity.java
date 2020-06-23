package com.example.babsangapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

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

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.solo_layout);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("밥상머리가 이게 뭐~니?");

        final ImageView imageView = findViewById(R.id.imageView); // 이미지 뷰
        final Button button = findViewById(R.id.menuBtn); // 메뉴버튼
        final Button recipeBtn = findViewById(R.id.recipeBtn); // 레시피버튼
        final RadioGroup convenience = findViewById(R.id.convenience);
        RadioButton gs = findViewById(R.id.gs);
        RadioButton cu = findViewById(R.id.cu);
        RadioButton seveneleven = findViewById(R.id.seveneleven);
        final TextView textView = findViewById(R.id.textView2);
        final Animation animation;
        animation = new AlphaAnimation(0.0f,1.0f);
        animation.setDuration(300);
        animation.setStartOffset(20);
        animation.setRepeatMode(Animation.REVERSE);
        animation.setRepeatCount(Animation.INFINITE);
        textView.startAnimation(animation);


        gs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button.setVisibility(View.VISIBLE);
                textView.clearAnimation();
                textView.setVisibility(View.INVISIBLE);
            }
        });
        cu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button.setVisibility(View.VISIBLE);
                textView.clearAnimation();
                textView.setVisibility(View.INVISIBLE);
            }
        });
        seveneleven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button.setVisibility(View.VISIBLE);
                textView.clearAnimation();
                textView.setVisibility(View.INVISIBLE);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recipeBtn.setVisibility(View.VISIBLE);
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

        recipeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent recipe = new Intent(Intent.ACTION_VIEW, Uri.parse("https://linktr.ee/hwi_0204"));
                startActivity(recipe);
            }
        });




    }
}
