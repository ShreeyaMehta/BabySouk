package com.bcod.babysouk.productListing.sortby;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bcod.babysouk.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class SortBy extends BottomSheetDialogFragment {

    private BottomSheetListener mListener;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.sort_by, container, false);
        TextView default_order = view.findViewById(R.id.default_order);
        default_order.setOnClickListener(view1 -> {
            mListener.onTextclick("Default Order");
            dismiss();
        });
        return view;
    }

    public interface BottomSheetListener {
        void onTextclick(String text);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            mListener = (BottomSheetListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString()
                    + " must implement BottomSheetListener");
        }
    }
}
