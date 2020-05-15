package com.bcod.babysouk.order.brandStory;

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

public class BrandStoryFragment extends Fragment {

    private BrandStoryViewModel mBrandViewModel;

    public static BrandStoryFragment newInstance() {
        return new BrandStoryFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.brand_story_fragment, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mBrandViewModel = new ViewModelProvider(this).get(BrandStoryViewModel.class);
        // TODO: Use the ViewModel
    }

}
