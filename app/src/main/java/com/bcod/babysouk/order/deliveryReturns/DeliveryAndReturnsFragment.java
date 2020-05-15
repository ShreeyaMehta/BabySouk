package com.bcod.babysouk.order.deliveryReturns;

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

public class DeliveryAndReturnsFragment extends Fragment {

    private DeliveryAndReturnsViewModel mDeliveryReturnsViewModel;

    public static DeliveryAndReturnsFragment newInstance() {
        return new DeliveryAndReturnsFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.delivery_and_returns_fragment, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mDeliveryReturnsViewModel = new ViewModelProvider(this).get(DeliveryAndReturnsViewModel.class);
        // TODO: Use the ViewModel
    }

}
