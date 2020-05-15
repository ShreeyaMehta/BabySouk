package com.bcod.babysouk.model;

import com.bcod.babysouk.R;

import java.util.ArrayList;
import java.util.List;

public class HomeViewPagerItem {
    public int images;
    public int viewtype;

    public HomeViewPagerItem(int images, int viewtype) {
        this.images = images;
        this.viewtype = viewtype;
    }

    public static List<HomeViewPagerItem> getTestData() {
        List<HomeViewPagerItem> list = new ArrayList<>();
        list.add(new HomeViewPagerItem(R.drawable.baby_inside_white_bathtub, 1));
        list.add(new HomeViewPagerItem(R.drawable.little_baby, 2));
        list.add(new HomeViewPagerItem(R.drawable.two_babies_wearing_white_headdress, 3));
        list.add(new HomeViewPagerItem(R.drawable.adorable_autumn_baby_blur, 4));
        return list;
    }
}
