package com.example.babsangapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class BiggerActivity extends AppCompatActivity {

    public static final int [] random = {

            R.raw.bigger1, R.raw.bigger2, R.raw.bigger3,R.raw.bigger4,R.raw.bigger5,
            R.raw.bigger6, R.raw.bigger7, R.raw.bigger8
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bigger_layout);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("밥상머리가 이게 뭐~니?");

        Button button = findViewById(R.id.menuBtn);

        final ImageView imageView = findViewById(R.id.imageView1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int index = (int) (Math.random() * 8);
                int menu = random[index];

                imageView.setImageResource(menu);
            }
        });

    }
}
