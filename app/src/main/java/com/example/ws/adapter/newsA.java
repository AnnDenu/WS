package com.example.ws.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ws.R;
import com.example.ws.models.news;

import java.util.List;

public class newsA extends BaseAdapter {

    Context context;

    private List<news> newsList;

    public newsA(Context context, List<news> newsList) {
        this.context = context;
        this.newsList = newsList;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
       view = View.inflate(context, R.layout.activity_analize, null);

        TextView textView = view.findViewById(R.id.check);
        TextView textVw = view.findViewById(R.id.nine_isl);
        TextView textV = view.findViewById(R.id.price);
        TextView TextView = view.findViewById(R.id.image_man);

        news currentNews = newsList.get(i);

        textView.setText(currentNews.getName());
        textVw.setText(currentNews.getDescription());
        textV.setText(currentNews.getPrice());
        TextView.setText(currentNews.getImage());


        return view;
    }
}
