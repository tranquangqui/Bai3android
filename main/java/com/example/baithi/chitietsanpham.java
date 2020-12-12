package com.example.baithi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class chitietsanpham extends AppCompatActivity {
    RadioGroup radioGroup;

    TextView idName, idGia, tongtien;
    ImageView idImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chitietsp);
        //set dữ liệu cho trang sau click vào 1 item
        idName = findViewById(R.id.idttchinh);
        idGia = (TextView)findViewById(R.id.idgia);
        idImage = (ImageView) findViewById(R.id.imageView);
        tongtien = (TextView) findViewById(R.id.tongtien);
        Intent intent = getIntent();
        String receivedName =  intent.getStringExtra("name");
        int receivedImage = intent.getIntExtra("image",0);
        String receivedGia =  intent.getStringExtra("gia");
        String receivedTongTien =  intent.getStringExtra("gia");

        idName.setText(receivedName);
        idImage.setImageResource(receivedImage);
        idGia.setText(receivedGia);
        tongtien.setText(receivedTongTien);
        ImageView closechitiet = (ImageView) findViewById(R.id.close_chitietsp);
        closechitiet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chitietsanpham.this, order.class);
                startActivity(intent);
            }
        });
        final ImageView yeuthich = (ImageView)findViewById(R.id.yeuthich);
        yeuthich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yeuthich.setImageResource(R.drawable.heart1);
            }
        });
//        RadioButton rb_1 = (RadioButton)findViewById(R.id.rd_1);
//        RadioButton rb_2 = (RadioButton)findViewById(R.id.rd_2);
//        RadioButton rb_3 = (RadioButton)findViewById(R.id.rd_3);
//        final TextView tv_tongtien = (TextView) findViewById(R.id.tongtien);
//        final int tien = Integer.parseInt(String.valueOf(tv_tongtien.getText())) ;
//        ImageView im_tru = (ImageView)findViewById(R.id.tru);
//        ImageView im_cong = (ImageView)findViewById(R.id.cong);
        radioGroup = (RadioGroup) findViewById(R.id.rg_radio);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int id) {
                switch (id){
                    case R.id.rd_1:

                        break;
                    case R.id.rd_2:
                        break;
                    case R.id.rd_3:
                        break;

                }

            }
        });
    }
}
