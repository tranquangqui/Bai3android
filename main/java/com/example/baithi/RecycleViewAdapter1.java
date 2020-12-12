package com.example.baithi;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import douong.DoUong;

public class RecycleViewAdapter1 extends RecyclerView.Adapter<RecycleViewAdapter1.MyViewHolder> {
    Context mContext;
    List<DoAn> mData;

    public RecycleViewAdapter1(Context mContext, List<DoAn>mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.item_thucuong, parent, false);
        MyViewHolder vHolder = new MyViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        holder.textViewName.setText(mData.get(position).getName());
        holder.textViewGia.setText(mData.get(position).getGia());
        holder.imageViewDoUong.setImageResource(mData.get(position).getPhoto());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, mData.get(position).getName(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(mContext.getApplicationContext(), chitietsanpham.class);
                //    Intent intent = new Intent(mContext,chitietsanpham.class);
                intent.putExtra("name",mData.get(position).getName());
                intent.putExtra("image",mData.get(position).getPhoto());
                intent.putExtra("gia",mData.get(position).getGia());
                mContext.startActivity(intent);
            }
        });



    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView textViewName;
        TextView textViewGia;
        private ImageView imageViewDoUong;

        public MyViewHolder(View itemView){
            super(itemView);
            textViewName = (TextView) itemView.findViewById(R.id.tv_ten);
            textViewGia = (TextView) itemView.findViewById(R.id.tv_tien);
            imageViewDoUong = (ImageView) itemView.findViewById(R.id.img_thucuong);
//            itemView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    listener.onItemClick(new Imt());
//                }
//            });

        }
    }

}