package com.bcod.babysouk.adapter;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.bcod.babysouk.order.brandStory.BrandStoryFragment;
import com.bcod.babysouk.order.deliveryReturns.DeliveryAndReturnsFragment;
import com.bcod.babysouk.order.overview.OverviewFragment;
import com.bcod.babysouk.order.reviews.ReviewsFragment;

public class ItemTablayoutPageAdapter extends FragmentPagerAdapter {
    private Context context;
    private int totalTabs;
    public ItemTablayoutPageAdapter(Context context, FragmentManager fm, int totalTabs) {
        super(fm);
        context = context;
        this.totalTabs = totalTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                OverviewFragment overviewfragment = new OverviewFragment();
                return overviewfragment;
            case 1:
                BrandStoryFragment brand_story_fragment = new BrandStoryFragment();
                return brand_story_fragment;
            case 2:
                DeliveryAndReturnsFragment delivery_fragment = new DeliveryAndReturnsFragment();
                return delivery_fragment;
            case 3:
                ReviewsFragment review_fragment = new ReviewsFragment();
                return review_fragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return totalTabs;
    }
}
