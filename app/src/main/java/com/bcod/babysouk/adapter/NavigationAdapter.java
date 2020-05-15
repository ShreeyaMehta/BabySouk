package com.bcod.babysouk.adapter;

import android.animation.ObjectAnimator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bcod.babysouk.R;
import com.bcod.babysouk.model.NavigationItem;

import java.util.ArrayList;

public class NavigationAdapter extends RecyclerView.Adapter {

    private ArrayList<NavigationItem> mNavigationItemArrayList;

    public NavigationAdapter(ArrayList<NavigationItem> navigationItemArrayList) {
        mNavigationItemArrayList = navigationItemArrayList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view;
        /*if (viewType == 0) {
            view = layoutInflater.inflate(R.layout.navigation_row_chips,parent,false);
            return new NavigationViewHolderChips(view);
        } else*/ if (viewType == 1) {
            view = layoutInflater.
                    inflate(R.layout.navigation_row_with_child, parent, false);
            return new NavigationViewHolderWithChild(view);
        } else {
            view = layoutInflater.
                    inflate(R.layout.navigation_row_without_child, parent, false);
            return new NavigationViewHolderWithoutChild(view);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        NavigationItem currentItem = mNavigationItemArrayList.get(position);
        if (mNavigationItemArrayList.get(position).isExpandable()) {
            // bind viewHolder 1
            NavigationViewHolderWithChild viewHolderWithChild = (NavigationViewHolderWithChild) holder;
            viewHolderWithChild.mTextView.setText(currentItem.getText());
            boolean isLayoutExpanded = mNavigationItemArrayList.get(position).isLayoutExpanded();
            ((NavigationViewHolderWithChild) holder).expandableRecyclerView.setVisibility(isLayoutExpanded ?
                    View.VISIBLE : View.VISIBLE);
        } else {
            // bind viewHolder 2
            NavigationViewHolderWithoutChild viewHolderWithoutChild =
                    (NavigationViewHolderWithoutChild) holder;
            viewHolderWithoutChild.mTextView.setText(currentItem.getText());
        }
    }

    @Override
    public int getItemViewType(int position) {
        /*if (position == 0) {
            return 0;
        }else {*/
            if (mNavigationItemArrayList.get(position).isExpandable()) {
                return 1;
            } else {
                return 2;
            }
        //}
    }

    @Override
    public int getItemCount() {
        return mNavigationItemArrayList.size();
    }

    static class NavigationViewHolderChips extends RecyclerView.ViewHolder {

        public NavigationViewHolderChips(@NonNull View itemView) {
            super(itemView);
        }
    }

    class NavigationViewHolderWithChild extends RecyclerView.ViewHolder {
        RecyclerView expandableRecyclerView;
        TextView mTextView;
        ConstraintLayout layoutWithChild;
        ImageView indicatorImage;
        NavigationViewHolderWithChild(@NonNull View itemView) {
            super(itemView);
            mTextView = itemView.findViewById(R.id.base_menu_text_with_child);
            expandableRecyclerView = itemView.findViewById(R.id.expanded_menu_layout);
            layoutWithChild = itemView.findViewById(R.id.navigation_item_with_child);
            indicatorImage = itemView.findViewById(R.id.view_inflate_indicator);
            layoutWithChild.setOnClickListener(v -> {
                NavigationItem navigationItem =
                        mNavigationItemArrayList.get(getAdapterPosition());
                navigationItem.setLayoutExpanded(!navigationItem.isLayoutExpanded());
                notifyItemChanged(getAdapterPosition());
                if (!navigationItem.isLayoutExpanded()) {
                    changeRotate(indicatorImage, 0f, 90f).start();
                } else {
                    changeRotate(indicatorImage, 90f, 0f).start();
                }
            });

        }
    }

    static class NavigationViewHolderWithoutChild extends RecyclerView.ViewHolder {
        TextView mTextView;
        NavigationViewHolderWithoutChild(@NonNull View itemView) {
            super(itemView);
            mTextView = itemView.findViewById(R.id.base_menu_text_without_child);
        }
    }

    private ObjectAnimator changeRotate(ImageView indicatorImage, float from, float to) {
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(indicatorImage, "rotation", from, to);
        objectAnimator.setDuration(300);
        objectAnimator.setInterpolator(new LinearInterpolator());
        return objectAnimator;
    }
}
