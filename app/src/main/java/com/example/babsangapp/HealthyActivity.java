package com.example.babsangapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class HealthyActivity extends AppCompatActivity {

    public static final int [] random = {

            R.raw.healthy1, R.raw.healthy2, R.raw.healthy3,R.raw.healthy4,R.raw.healthy5,
            R.raw.healthy6, R.raw.healthy7, R.raw.healthy8
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.healthy_layout);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("밥상머리가 이게 뭐~니?");


        final ImageView imageView = findViewById(R.id.imageView); // 이미지 뷰
        Button button = findViewById(R.id.menuBtn); // 메뉴버튼
        final Button recipeBtn = findViewById(R.id.recipeBtn); // 레시피버튼


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               int index = (int) (Math.random() * 8);
               int menu = random[index];

                imageView.setImageResource(menu);
                recipeBtn.setVisibility(View.VISIBLE);

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
