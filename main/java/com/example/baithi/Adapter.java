package com.example.baithi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends ArrayAdapter<Contact> {
    private Context context;
    private int resource;
    private ArrayList<Contact> arrContact;

    public Adapter(@NonNull Context context, int resource, @NonNull List<Contact> objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource=resource;
        this.arrContact= (ArrayList<Contact>) objects;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.row_item, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.tv_color = (ImageView) convertView.findViewById(R.id.ic_left);
            viewHolder.tv_name = (TextView) convertView.findViewById(R.id.tv_text);
            convertView.setTag(viewHolder);
        }
        else{
            viewHolder =(ViewHolder) convertView.getTag();
        }

        Contact contact = arrContact.get(position);

        viewHolder.tv_color.setImageResource(contact.getmImage1());
        viewHolder.tv_name.setText(contact.getmName());
        return convertView;
    }
    public class ViewHolder {
        ImageView tv_color;
        TextView tv_name;

    }
}
