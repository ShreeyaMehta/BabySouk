package com.bcod.babysouk.order.reviews;

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

public class ReviewsFragment extends Fragment {

    private ReviewsViewModel mReviewViewModel;

    public static ReviewsFragment newInstance() {
        return new ReviewsFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.reviews_fragment, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mReviewViewModel = new ViewModelProvider(this).get(ReviewsViewModel.class);
        // TODO: Use the ViewModel
    }

}
