package com.example.baithi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class thongtinthongbao extends AppCompatActivity {
    ImageView close_thongbao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thongtinthongbao);

        close_thongbao = (ImageView)findViewById(R.id.close_thongbao1);
        close_thongbao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(thongtinthongbao.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
