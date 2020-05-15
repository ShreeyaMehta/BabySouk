package com.bcod.babysouk.ui.account.profile;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.bcod.babysouk.R;
import com.bcod.babysouk.databinding.MyProfileFragmentBinding;

public class MyProfileFragment extends Fragment {

    private MyProfileFragmentBinding binding;
    private MyProfileViewModel mMyProfileViewModel;

    Dialog dialog;

    public static MyProfileFragment newInstance() {
        return new MyProfileFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = MyProfileFragmentBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        dialog = new Dialog(getContext());
        binding.changePasswordLink.setOnClickListener(v -> {
            dialog.setContentView(R.layout.change_password_dialog);
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            dialog.show();
        });
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mMyProfileViewModel = new ViewModelProvider(this).get(MyProfileViewModel.class);
        // TODO: Use the ViewModel
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
