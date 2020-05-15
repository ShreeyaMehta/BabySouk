package com.bcod.babysouk.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bcod.babysouk.R;
import com.bcod.babysouk.model.CountryItem;

import java.util.ArrayList;

public class CountryAdapter extends ArrayAdapter {
    public CountryAdapter(@NonNull Context context,
                           @NonNull ArrayList<CountryItem> countryItemArrayList) {
        super(context, 0, countryItemArrayList);
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
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).
                    inflate(R.layout.country_drop_down_menu_row, parent, false);
        }

        TextView textViewLanguage = convertView.findViewById(R.id.country_name_drop_down);
        CountryItem currentItem = (CountryItem) getItem(position);
        if (currentItem != null) {
            textViewLanguage.setText(currentItem.getCountryName());
        }
        return convertView;
    }
}
