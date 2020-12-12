package com.example.baithi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import douong.DoUong;

public class DoAnAdapter extends RecyclerView.Adapter<DoAnAdapter.DoUongViewHolder> {
    private List<DoAn> mDoUong;
    public void setData(List<DoAn> list){
        this.mDoUong = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public DoAnAdapter.DoUongViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_thucuong, parent, false);
        return new DoAnAdapter.DoUongViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DoUongViewHolder holder, int position) {
        DoAn DoAn = mDoUong.get(position);
        if(DoAn == null){
            return;
        }
        holder.imgDoUong.setImageResource(DoAn.getPhoto());
        holder.tv_name.setText(DoAn.getName());
        holder.tv_gia.setText(DoAn.getGia());
    }

//    @Override
//    public void onBindViewHolder(@NonNull douong.doUongAdapter.DoUongViewHolder holder, int position) {
//        DoUong DoUong = mDoUong.get(position);
//        if(DoUong == null){
//            return;
//        }
//        holder.imgDoUong.setImageResource(DoUong.getPhoto());
//        holder.tv_name.setText(DoUong.getName());
//        holder.tv_gia.setText(DoUong.getGia());
//    }

    @Override
    public int getItemCount() {
        if(mDoUong != null){
            return mDoUong.size();
        }
        return 0;
    }

    public  class DoUongViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgDoUong;
        private TextView tv_gia;
        private TextView tv_name;

        public DoUongViewHolder(@NonNull  View itemView){
            super(itemView);
            imgDoUong = itemView.findViewById(R.id.img_thucuong);
            tv_name = itemView.findViewById(R.id.tv_ten);
            tv_name = itemView.findViewById(R.id.tv_tien);
        }
    }

}