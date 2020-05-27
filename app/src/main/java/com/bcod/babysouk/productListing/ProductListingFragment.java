package com.bcod.babysouk.productListing;

import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.bcod.babysouk.R;
import com.bcod.babysouk.productListing.sortby.SortBy;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class ProductListingFragment extends Fragment implements SortBy.BottomSheetListener {

    private ProductListingViewModel mProductListingViewModel;
    private TextView textView;
    private Button sort;

    public static ProductListingFragment newInstance() {
        return new ProductListingFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.product_listing_fragment, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mProductListingViewModel = new ViewModelProvider(this).get(ProductListingViewModel.class);
        // TODO: Use the ViewModel
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textView = view.findViewById(R.id.check_sort);
        sort = view.findViewById(R.id.sort);
        sort.setOnClickListener(view1 -> {
            SortBy sortBy = new SortBy();
            sortBy.show(getChildFragmentManager(),"sortby");
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        textView = null;
        sort = null;
    }

    @Override
    public void onTextclick(String text) {
        textView.setText(text);
    }
}
