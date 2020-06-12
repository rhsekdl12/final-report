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

public class BasicActivity extends AppCompatActivity {

    public static final int [] random = {

            R.raw.basic1, R.raw.basic2, R.raw.basic3,R.raw.basic4,R.raw.basic5,
            R.raw.basic6, R.raw.basic7, R.raw.basic8
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basic_layout);


        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("밥상머리가 이게 뭐~니?");

        Button button = findViewById(R.id.menuBtn);
        Button recipeBtn = findViewById(R.id.recipeBtn);

        final ImageView imageView = findViewById(R.id.imageView1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int index = (int) (Math.random() * 8);
                int menu = random[index];

                imageView.setImageResource(menu);

            }
        });

        recipeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent recipe = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.10000recipe.com/recipe/list.html"));
                startActivity(recipe);
            }
        });



    }
}
