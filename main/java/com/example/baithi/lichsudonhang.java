package com.example.baithi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class lichsudonhang extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lichsudonhang);
        ImageView close_lichsu = (ImageView)findViewById(R.id.close_lichsu);
        close_lichsu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(lichsudonhang.this, myaccount.class);
                startActivity(intent);
            }
        });


       
    }
}
