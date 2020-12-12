package com.example.baithi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;


public class thanhvien extends AppCompatActivity {
    private TabLayout tablayout;
    private ViewPager viewPaper;
    private ViewPaperAdapter_thanhvien adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thanhvien);

        tablayout = findViewById(R.id.tab_layout);
        viewPaper = findViewById(R.id.view_paper);
        adapter = new ViewPaperAdapter_thanhvien(getSupportFragmentManager());

        adapter.AddFragment(new Moi(),"Mới");
        adapter.AddFragment(new Dong(),"Đồng");
        adapter.AddFragment(new Bac(),"Bạc");
        adapter.AddFragment(new Vang(),"Vàng");
        adapter.AddFragment(new KimCuong(),"Kim Cương");
        viewPaper.setAdapter(adapter);
        tablayout.setupWithViewPager(viewPaper);

        tablayout.getTabAt(0).setIcon(R.drawable.ic_events);
        tablayout.getTabAt(1).setIcon(R.drawable.ic_events1);
        tablayout.getTabAt(2).setIcon(R.drawable.ic_events4);
        tablayout.getTabAt(3).setIcon(R.drawable.ic_events3);
        tablayout.getTabAt(4).setIcon(R.drawable.ic_events2);
        ImageView im_close_thanhvien = (ImageView)findViewById(R.id.close_thanhvien);
        im_close_thanhvien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(thanhvien.this, myaccount.class);
                startActivity(intent);
            }
        });
    }
}