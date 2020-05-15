package com.bcod.babysouk.appbar.cart.delivery_address;

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
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class DeliveryAddressFragment extends Fragment {

    private DeliveryAddressViewModel mDeliveryAddressViewModel;

    public static DeliveryAddressFragment newInstance() {
        return new DeliveryAddressFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.delivery_address_fragment, container, false);
        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mDeliveryAddressViewModel = new ViewModelProvider(this).get(DeliveryAddressViewModel.class);
        // TODO: Use the ViewModel

        BottomNavigationView bottomNavigationView = getActivity().findViewById(R.id.bottom_nav_view);
        bottomNavigationView.setVisibility(View.GONE);
    }

}