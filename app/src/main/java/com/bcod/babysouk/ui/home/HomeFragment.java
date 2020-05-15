package com.bcod.babysouk.ui.home;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.bcod.babysouk.R;
import com.bcod.babysouk.adapter.HomeViewPagerAdapter;
import com.bcod.babysouk.databinding.HomeFragmentBinding;
import com.bcod.babysouk.model.HomeViewPagerItem;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.youth.banner.Banner;
import com.youth.banner.indicator.CircleIndicator;


public class HomeFragment extends Fragment {

    private HomeFragmentBinding binding;
    private HomeViewModel mHomeViewModel;

    public static HomeFragment newInstance() {
        return new HomeFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = HomeFragmentBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        binding.homeViewPager.setAdapter(new HomeViewPagerAdapter(HomeViewPagerItem.getTestData()))
                .setIndicator(new CircleIndicator(container.getContext()))
                .start();

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mHomeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);
        // TODO: Use the ViewModel

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
