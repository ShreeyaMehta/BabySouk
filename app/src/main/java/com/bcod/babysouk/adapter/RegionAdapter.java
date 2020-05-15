package com.bcod.babysouk.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bcod.babysouk.R;
import com.bcod.babysouk.model.RegionItem;

import java.util.ArrayList;

public class RegionAdapter extends ArrayAdapter<RegionItem> {
    public RegionAdapter(@NonNull Context context,  @NonNull ArrayList<RegionItem> regionItemArrayList) {
        super(context, 0, regionItemArrayList);
    }

    // ctrl+o
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initView(position, convertView, parent);
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initView(position, convertView, parent);
    }

    private View initView(int position, View convertView, ViewGroup parent) {
        if (convertView==null) {
            convertView =
                    LayoutInflater.from(getContext()).inflate(R.layout.region_drop_down_menu_row,
                            parent, false);
        }
        ImageView imageViewFlag = convertView.findViewById(R.id.region_image);
        TextView textViewName = convertView.findViewById(R.id.region_name);
        RegionItem currentItem = getItem(position);
        if (currentItem != null) {
            imageViewFlag.setImageResource(currentItem.getFlagImage());
            textViewName.setText(currentItem.getCountryName());
        }
        return convertView;
    }
}
