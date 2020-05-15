package com.bcod.babysouk.ui.account.address;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.bcod.babysouk.R;
import com.bcod.babysouk.databinding.AddressBookFragmentBinding;
import com.google.android.material.button.MaterialButton;

public class AddressBookFragment extends Fragment {

    private AddressBookFragmentBinding binding;
    private AddressBookViewModel mAddressBookViewModel;

    public static AddressBookFragment newInstance() {
        return new AddressBookFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = AddressBookFragmentBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mAddressBookViewModel = new ViewModelProvider(this).get(AddressBookViewModel.class);
        // TODO: Use the ViewModel
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final NavController navController = Navigation.findNavController(view);
        MaterialButton add_new_address = view.findViewById(R.id.add_new_address_button);
        add_new_address.setOnClickListener(view1 -> navController.
                navigate(R.id.action_navigation_address_book_to_navigation_new_address));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
