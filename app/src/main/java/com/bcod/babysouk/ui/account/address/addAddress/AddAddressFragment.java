package com.bcod.babysouk.ui.account.address.addAddress;

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

public class AddAddressFragment extends Fragment {

    private AddAddressViewModel mAddAddressViewModel;

    public static AddAddressFragment newInstance() {
        return new AddAddressFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.add_address_fragment, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mAddAddressViewModel = new ViewModelProvider(this).get(AddAddressViewModel.class);
        // TODO: Use the ViewModel
    }

}
