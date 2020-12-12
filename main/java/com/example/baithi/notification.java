package com.example.baithi;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class notification extends AppCompatActivity implements OnMapReadyCallback, AdapterView.OnItemSelectedListener {
    MapFragment mapFragment;
    FusedLocationProviderClient client;
    GoogleMap map,map1;
    Spinner spinner;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        spinner = (Spinner)findViewById(R.id.spinner);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.notification);
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

                        return true;
                    case R.id.myaccount:
                        startActivity(new Intent(getApplicationContext()
                                , myaccount.class));
                        overridePendingTransition(0, 0);
                        return true;
                }
                return false;
            }
        });


         //vi tri ban do
        String [] vitri = getResources().getStringArray(R.array.font_sizes);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, vitri);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

            mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.ggmap);
            mapFragment.getMapAsync(this);


    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map = googleMap;
        map1 = googleMap;
        LatLng cf1 = new LatLng(16.0680418, 108.2094249);
        LatLng cf2 = new LatLng(16.0697527, 108.2151522);
        LatLng cf3 = new LatLng(16.0546059, 108.2182103);
        LatLng cf4 = new LatLng(16.0709787, 108.2190851);
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(cf1, 15));
        map.addMarker(new MarkerOptions().title("The Coffee House").snippet("435 Lê Duẫn, Quận Thanh Khê").position(cf1));
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(cf2, 15));
        map.addMarker(new MarkerOptions().title("The Coffee House").snippet("80 Paster, Quận Hải Châu").position(cf2));
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(cf3, 15));
        map.addMarker(new MarkerOptions().title("The Coffee House").snippet("1 Núi Thành, Quận Hải Châu").position(cf3));
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(cf4, 15));
        map.addMarker(new MarkerOptions().title("The Coffee House").snippet("80A Nguyễn Chí Thanh, Quận Hải Châu").position(cf4));





    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if(parent.getId() == R.id.spinner){
            String location = parent.getItemAtPosition(position).toString();
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}