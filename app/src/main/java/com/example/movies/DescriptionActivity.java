package com.example.movies;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DescriptionActivity extends AppCompatActivity {
    ImageView imageView;
    TextView textView1;
    TextView textView2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        imageView = findViewById(R.id.img);
        textView1 = findViewById(R.id.title_tv);
        textView2 = findViewById(R.id.description_tv);
        Intent intent = getIntent();
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            int resId = bundle.getInt("image");
            imageView.setImageResource(resId);
        }
        textView1.setText(intent.getStringExtra("title"));
        textView2.setText(intent.getStringExtra("desc"));
    }
}