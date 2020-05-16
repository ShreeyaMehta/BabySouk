package com.bcod.babysouk.drawer.giftsouk;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.bcod.babysouk.R;

public class GiftSoukFragment extends Fragment {

    private GiftSoukViewModel mGiftSoukViewModel;
    private ConstraintLayout send_gift_to, choose_gift_ribbon, choose_tag, add_message;
    private TextView send_gift, choose_ribbon, select_tag, add_message_tv;
    private ImageView img_send_to, img_choose_ribbon, img_select_tag, img_add_message;


    public static GiftSoukFragment newInstance() {
        return new GiftSoukFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.gift_souk_fragment, container, false);
        send_gift_to = root.findViewById(R.id.send_to_constraint);
        choose_gift_ribbon = root.findViewById(R.id.choose_gift_ribbon_constraint);
        choose_tag = root.findViewById(R.id.gift_tag_constraint);
        add_message = root.findViewById(R.id.add_message_constraint);
        send_gift = root.findViewById(R.id.send_gift_to_text);
        choose_ribbon = root.findViewById(R.id.choose_gift_ribbon_text);
        select_tag = root.findViewById(R.id.select_gift_tag_text);
        add_message_tv = root.findViewById(R.id.gift_add_message_text);
        img_send_to = root.findViewById(R.id.show_send_to);
        img_add_message = root.findViewById(R.id.show_add_message);
        img_choose_ribbon = root.findViewById(R.id.show_choose_ribbon);
        img_select_tag = root.findViewById(R.id.show_select_tag);
        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mGiftSoukViewModel = new ViewModelProvider(this).get(GiftSoukViewModel.class);
        // TODO: Use the ViewModel
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        send_gift.setOnClickListener(view14 -> {
            changeVisibility(send_gift_to);
            changeRotate(img_send_to, 0, 90f).start();
            add_message.setVisibility(View.GONE);
            choose_gift_ribbon.setVisibility(View.GONE);
            choose_tag.setVisibility(View.GONE);
        });

        choose_ribbon.setOnClickListener(view13 -> {
            changeVisibility(choose_gift_ribbon);
            changeRotate(img_choose_ribbon, 0, 90f).start();
            add_message.setVisibility(View.GONE);
            send_gift_to.setVisibility(View.GONE);
            choose_tag.setVisibility(View.GONE);
        });

        select_tag.setOnClickListener(view12 -> {
            changeVisibility(choose_tag);
            changeRotate(img_select_tag, 0, 90f).start();
            add_message.setVisibility(View.GONE);
            send_gift_to.setVisibility(View.GONE);
            choose_gift_ribbon.setVisibility(View.GONE);
        });

        add_message_tv.setOnClickListener(view1 -> {
            changeVisibility(add_message);
            changeRotate(img_add_message, 0, 90f).start();
            choose_gift_ribbon.setVisibility(View.GONE);
            send_gift_to.setVisibility(View.GONE);
            choose_tag.setVisibility(View.GONE);
        });


    }

    private void changeVisibility(ConstraintLayout constraintLayout){
        if(constraintLayout.getVisibility() == View.GONE){
            constraintLayout.setVisibility(View.VISIBLE);
        }else{
            constraintLayout.setVisibility(View.GONE);
        }
    }

    private ObjectAnimator changeRotate(ImageView indicatorImage, float from, float to) {
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(indicatorImage, "rotation", from, to);
        objectAnimator.setDuration(300);
        objectAnimator.setInterpolator(new LinearInterpolator());
        return objectAnimator;
    }
}
