    package com.example.baithi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import douong.DoUong;
import douong.doUongAdapter;

public class Fragment_doan extends Fragment {
    View v;

    DoAnAdapter doUongAdapter;
    private List<DoAn> lstDoAn;
    public Fragment_doan() {
    }

    @Nullable
    @Override
    public View onCreateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.doan_fragment, container, false);
        RecyclerView recyclerView1 = v.findViewById(R.id.doan_recyclerView);
        RecycleViewAdapter1 recycleViewAdapter1 = new RecycleViewAdapter1(getContext(), lstDoAn);
        recyclerView1.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView1.setAdapter(recycleViewAdapter1);
        return v;
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lstDoAn = new ArrayList<>();
        lstDoAn.add(new DoAn(R.drawable.thucan1, "Bánh Mỳ Chà Bông", "19.000"));
        lstDoAn.add(new DoAn(R.drawable.thucan2, "Bánh Mỳ Que", "20.000"));
        lstDoAn.add(new DoAn(R.drawable.thucan3, "Bông Lan Trứng Muối", "18.000"));
        lstDoAn.add(new DoAn(R.drawable.thucan4, "Cam Tươi Sấy Dẻo", "30.000VND"));
        lstDoAn.add(new DoAn(R.drawable.thucan5, "Điểu Vàng Mật Ong", "35.000VND"));
        lstDoAn.add(new DoAn(R.drawable.thucan6, "Mít Xấy", "42.000VND"));


    }
}
