package com.example.baithi;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import douong.DoUong;
import douong.doUongAdapter;

public class Fragement_douong extends Fragment {
    RecyclerView recyclerView;
    View view;
    doUongAdapter doUongAdapter;
    private List<DoUong> lstDoUong;

    public Fragement_douong() {

    }

    @Nullable
    @Override
    public View onCreateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.thucuong_fragment, container, false);
        recyclerView = view.findViewById(R.id.thucuong_recyclerView);
        RecycleViewAdapter recycleViewAdapter = new RecycleViewAdapter(getContext(), lstDoUong);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(recycleViewAdapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lstDoUong = new ArrayList<>();
        lstDoUong.add(new DoUong(R.drawable.thucuong1, "Cafe Sữa Đá", "32.000"));
        lstDoUong.add(new DoUong(R.drawable.thucuong2, "Bạc Xỉu", "51.000"));
        lstDoUong.add(new DoUong(R.drawable.thucuong3, "Trà Phúc Bồn Tử", "47.000"));
        lstDoUong.add(new DoUong(R.drawable.thucuong4, "Latte Đá", "36.000VND"));
        lstDoUong.add(new DoUong(R.drawable.thucuong6, "Americano Đá", "30.000VND"));
        lstDoUong.add(new DoUong(R.drawable.thucuong5, "Cappuchino", "52.000VND"));
        lstDoUong.add(new DoUong(R.drawable.thucuong7, "Latte Nóng", "36.000VND"));
        lstDoUong.add(new DoUong(R.drawable.thucuong8, "Cafe Sữa Nóng", "30.000VND"));
        lstDoUong.add(new DoUong(R.drawable.thucuong9, "Cappuchino Nóng", "52.000VND"));


    }
}



