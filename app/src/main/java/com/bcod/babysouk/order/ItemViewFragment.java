package com.bcod.babysouk.order;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.ViewPager;

import com.bcod.babysouk.R;
//import com.bcod.babysouk.adapter.ItemTablayoutPageAdapter;
import com.bcod.babysouk.databinding.ItemViewFragmentBinding;
import com.google.android.material.tabs.TabLayout;

public class ItemViewFragment extends Fragment {

    private ItemViewFragmentBinding binding;
    private ItemViewViewModel mItemViewViewModel;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private Context context;


    public static ItemViewFragment newInstance() {
        return new ItemViewFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = ItemViewFragmentBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        if (container != null) {
            context = container.getContext();
        }
        tabLayout = view.findViewById(R.id.item_tab_layout);
        viewPager = view.findViewById(R.id.item_viewpager);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mItemViewViewModel = new ViewModelProvider(this).get(ItemViewViewModel.class);
        // TODO: Use the ViewModel
        tabLayout.addTab(tabLayout.newTab().setText(R.string.overview));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.brandStory));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.delivery_returns));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.reviews));

        /*final ItemTablayoutPageAdapter itemTablayoutPageAdapter = new ItemTablayoutPageAdapter(context, getFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(itemTablayoutPageAdapter);
*/
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
