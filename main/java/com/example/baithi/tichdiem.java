package com.example.baithi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class tichdiem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.tichdiem);
        ImageView imclose = (ImageView) findViewById(R.id.close);
        imclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(tichdiem.this, MainActivity.class);
                startActivity(intent);
            }

        });
    }
}
