package com.bcod.babysouk.productListing.filterby;

import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bcod.babysouk.R;
import com.bcod.babysouk.databinding.FilterByFragmentBinding;
import com.bcod.babysouk.productListing.filterby.category.CategoryFilterFragment;
import com.bcod.babysouk.productListing.filterby.price.PriceFilterFragment;

public class FilterByFragment extends Fragment {

    private FilterByFragmentBinding filterByFragmentBinding;
    private FilterByViewModel mFilterByViewModel;

    public static FilterByFragment newInstance() {
        return new FilterByFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        filterByFragmentBinding = FilterByFragmentBinding.inflate(inflater, container, false);
        View view = filterByFragmentBinding.getRoot();
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mFilterByViewModel = new ViewModelProvider(this).get(FilterByViewModel.class);
        // TODO: Use the ViewModel
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadFragment(new CategoryFilterFragment());
        TextView category = view.findViewById(R.id.category_text);
        TextView price = view.findViewById(R.id.price_text);

        category.setOnClickListener(view1 -> {
            loadFragment(new CategoryFilterFragment());
            category.setBackgroundResource(R.color.colorOriginal);
            price.setBackgroundResource(R.color.bluish);
        });
        
        price.setOnClickListener(view12 -> {
            price.setBackgroundResource(R.color.colorOriginal);
            category.setBackgroundResource(R.color.bluish);
            loadFragment(new PriceFilterFragment());
        });

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        filterByFragmentBinding = null;
    }

    public void loadFragment(Fragment fragment){
        FragmentTransaction fragmentTransaction = getChildFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.filter_frame, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}
