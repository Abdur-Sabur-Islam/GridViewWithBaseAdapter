package com.bproperty.gridviewwithbaseadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

/**
 * Created by acer on 1/22/2017.
 */

public class CustomAdapter extends BaseAdapter {

    Context context;
    int logo[];
    LayoutInflater layoutInflater;

    public CustomAdapter(Context context,int[] logo) {
        this.logo = logo;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return logo.length;
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
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = layoutInflater.inflate(R.layout.activity_gridview,null);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        imageView.setImageResource(logo[i]);
        return view;
    }
}
