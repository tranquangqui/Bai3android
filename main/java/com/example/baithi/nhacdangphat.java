package com.example.baithi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class nhacdangphat extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nhacdangphat);
        ImageView close_nhac = (ImageView)findViewById(R.id.close_nhac);
        close_nhac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nhacdangphat.this, myaccount.class);
                startActivity(intent);
            }
        });
    }
}
