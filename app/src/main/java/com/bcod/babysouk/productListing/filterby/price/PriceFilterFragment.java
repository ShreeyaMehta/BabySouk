package com.bcod.babysouk.productListing.filterby.price;

import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bcod.babysouk.R;
import com.bcod.babysouk.databinding.PriceFilterFragmentBinding;

public class PriceFilterFragment extends Fragment {

    private PriceFilterFragmentBinding priceFilterFragmentBinding;
    private PriceFilterViewModel mPriceFilterViewModel;

    public static PriceFilterFragment newInstance() {
        return new PriceFilterFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        priceFilterFragmentBinding = PriceFilterFragmentBinding.inflate(inflater, container, false);
        View root = priceFilterFragmentBinding.getRoot();
        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mPriceFilterViewModel = new ViewModelProvider(this).get(PriceFilterViewModel.class);
        // TODO: Use the ViewModel
    }

}
