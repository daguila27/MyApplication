package com.example.casa.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by CASA on 14/05/2017.
 */

public class AdaptadordeFotos extends BaseAdapter {
    private Context context;

    public AdaptadordeFotos(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return Foto.ITEMS.length;
    }

    @Override
    public Foto getItem(int position) {
        return Foto.ITEMS[position];
    }

    @Override
    public long getItemId(int position) {
        return getItem(position).getId();
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.grid_item, viewGroup, false);
        }

        ImageView imagen = (ImageView) view.findViewById(R.id.item_photo);

        final Foto item = getItem(position);
        imagen.setImageResource(item.getIddrawable());

        return view;
    }

}