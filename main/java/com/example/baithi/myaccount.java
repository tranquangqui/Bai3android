package com.example.baithi;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

import Login.LoginActivity;

public class myaccount extends AppCompatActivity {
    private ListView lvContact;
    private TabLayout tablayout;
    private ViewPager viewPaper;
    private ViewPaperAdapter_thanhvien adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myaccount);
        Button btn = (Button) findViewById(R.id.btn_logout);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(myaccount.this);
                alertDialogBuilder.setMessage("Bạn có muốn đăng xuất?");
                alertDialogBuilder.setPositiveButton("Có", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(myaccount.this,LoginActivity.class);
                        startActivity(intent);
                    }
                });
                alertDialogBuilder.setNegativeButton("Không", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                alertDialogBuilder.show();
            }
        });

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.myaccount);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.order:
                        startActivity(new Intent(getApplicationContext()
                                , order.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext()
                                , MainActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.notification:
                        startActivity(new Intent(getApplicationContext()
                                , notification.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.myaccount:

                        return true;
                }
                return false;
            }
        });
        lvContact = (ListView) findViewById(R.id.lv_profile);
        lvContact.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                            Intent intent = new Intent(myaccount.this, thanhvien.class);
                            startActivity(intent);
                }
                if(position==1){
                    Intent intent = new Intent(myaccount.this, thongtinaccount.class);
                    startActivity(intent);
                }
                if(position==2){
                    Intent intent = new Intent(myaccount.this, nhacdangphat.class);
                    startActivity(intent);
                }
                if(position==3){
                    Intent intent = new Intent(myaccount.this, lichsudonhang.class);
                    startActivity(intent);
                }
                if(position==4){
                    Intent intent = new Intent(myaccount.this, quidinh.class);
                    startActivity(intent);
                }
                if(position==5){
                    Intent intent = new Intent(myaccount.this, caidat.class);
                    startActivity(intent);
                }
            }
        });
        ArrayList<Contact> arrayList = new ArrayList<Contact>();

        Contact contact1 = new Contact(R.drawable.best, "The Coffee House Rewards");
        Contact contact2 = new Contact(R.drawable.user, "Thông Tin Tài Khoản");
        Contact contact3 = new Contact(R.drawable.music, "Nhạc đang phát");
        Contact contact4 = new Contact(R.drawable.scroll, "Lịch sử");
        Contact contact5 = new Contact(R.drawable.question, "Giúp đỡ");
        Contact contact6 = new Contact(R.drawable.setting, "Cài đặt");

        arrayList.add(contact1);
        arrayList.add(contact2);
        arrayList.add(contact3);
        arrayList.add(contact4);
        arrayList.add(contact5);
        arrayList.add(contact6);

        Adapter customAdapter = new Adapter(this, R.layout.row_item, arrayList);
        lvContact.setAdapter(customAdapter);
    }


}




