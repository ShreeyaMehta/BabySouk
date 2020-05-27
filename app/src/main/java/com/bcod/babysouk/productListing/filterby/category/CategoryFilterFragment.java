package com.bcod.babysouk.productListing.filterby.category;

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
import com.bcod.babysouk.databinding.CategoryFilterFragmentBinding;

public class CategoryFilterFragment extends Fragment {

    private CategoryFilterFragmentBinding categoryFilterFragmentBinding;
    private CategoryFilterViewModel mCategoryViewModel;

    public static CategoryFilterFragment newInstance() {
        return new CategoryFilterFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        categoryFilterFragmentBinding =  CategoryFilterFragmentBinding.inflate(inflater, container, false);
        View root = categoryFilterFragmentBinding.getRoot();
        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mCategoryViewModel = new ViewModelProvider(this).get(CategoryFilterViewModel.class);
        // TODO: Use the ViewModel
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        categoryFilterFragmentBinding = null;
    }
}
