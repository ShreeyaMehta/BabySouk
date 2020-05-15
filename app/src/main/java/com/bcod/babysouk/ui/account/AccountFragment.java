package com.bcod.babysouk.ui.account;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.bcod.babysouk.R;
import com.bcod.babysouk.databinding.AccountFragmentBinding;

public class AccountFragment extends Fragment {

    private AccountFragmentBinding binding;
    private AccountViewModel mAccountViewModel;

    public static AccountFragment newInstance() {
        return new AccountFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = AccountFragmentBinding.inflate(inflater, container, false);
        View view = binding.getRoot();

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final NavController navController = Navigation.findNavController(view);
        TextView myProfileTextView = view.findViewById(R.id.account_my_profile_text);
        TextView myOrdersTextView = view.findViewById(R.id.account_my_orders_text);
        TextView addressBookTextView = view.findViewById(R.id.account_address_book_text);
        TextView contactUsTextView = view.findViewById(R.id.account_contact_us_text);
        TextView rateOurAppTextView = view.findViewById(R.id.account_rate_our_app_text);
        TextView settingsTextView = view.findViewById(R.id.account_settings_text);
        myProfileTextView.setOnClickListener(v -> navController.
                navigate(R.id.action_navigation_account_to_navigation_my_profile));
        myOrdersTextView.setOnClickListener(v -> navController.
                navigate(R.id.action_navigation_account_to_navigation_my_orders));
        addressBookTextView.setOnClickListener(v -> navController.
                navigate(R.id.action_navigation_account_to_navigation_address_book));
        contactUsTextView.setOnClickListener(v -> navController.
                navigate(R.id.action_navigation_account_to_navigation_contact_us));
        settingsTextView.setOnClickListener(v -> navController.
                navigate(R.id.action_navigation_account_to_navigation_settings));
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mAccountViewModel = new ViewModelProvider(this).get(AccountViewModel.class);
        // TODO: Use the ViewModel
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
