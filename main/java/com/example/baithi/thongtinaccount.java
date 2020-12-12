package com.example.baithi;

import android.content.Intent;
import android.os.Bundle ;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class thongtinaccount extends AppCompatActivity {
    ImageView imclose;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thongtinaccount);
        imclose = (ImageView)findViewById(R.id.close_thongtin);
        imclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(thongtinaccount.this, myaccount.class);
                startActivity(intent);
            }

        });
    }
}
