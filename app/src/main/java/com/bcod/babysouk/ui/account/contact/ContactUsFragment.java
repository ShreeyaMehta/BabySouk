package com.bcod.babysouk.ui.account.contact;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.bcod.babysouk.R;
import com.bcod.babysouk.adapter.CountryAdapter;
import com.bcod.babysouk.databinding.ContactUsFragmentBinding;
import com.bcod.babysouk.model.CountryItem;

import java.util.ArrayList;

public class ContactUsFragment extends Fragment {

    private ContactUsFragmentBinding binding;
    private ContactUsViewModel mContactUsViewModel;
    private Context context;
    private ArrayList<CountryItem> mCountryArrayList;

    public static ContactUsFragment newInstance() {
        return new ContactUsFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = ContactUsFragmentBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        if (container != null) {
            context = container.getContext();
        }
        initCountryList();
        CountryAdapter mCountryAdapter = new CountryAdapter(context, mCountryArrayList);
        binding.countrySpinner.setAdapter(mCountryAdapter);
        return view;
    }

    private void initCountryList() {
        mCountryArrayList = new ArrayList<>();
        mCountryArrayList.add(new CountryItem(R.string.united_arab_emirates_short_form));
        mCountryArrayList.add(new CountryItem(R.string.afghanistan));
        mCountryArrayList.add(new CountryItem(R.string.albania));
        mCountryArrayList.add(new CountryItem(R.string.algeria));
        mCountryArrayList.add(new CountryItem(R.string.andorra));
        mCountryArrayList.add(new CountryItem(R.string.angola));
        mCountryArrayList.add(new CountryItem(R.string.anguilla));
        mCountryArrayList.add(new CountryItem(R.string.argentina));
        mCountryArrayList.add(new CountryItem(R.string.armenia));
        mCountryArrayList.add(new CountryItem(R.string.aruba));
        mCountryArrayList.add(new CountryItem(R.string.australia));
        mCountryArrayList.add(new CountryItem(R.string.austria));
        mCountryArrayList.add(new CountryItem(R.string.azerbaijan));
        mCountryArrayList.add(new CountryItem(R.string.bahamas));
        mCountryArrayList.add(new CountryItem(R.string.bahrain));
        mCountryArrayList.add(new CountryItem(R.string.bangladesh));
        mCountryArrayList.add(new CountryItem(R.string.barbados));
        mCountryArrayList.add(new CountryItem(R.string.belarus));
        mCountryArrayList.add(new CountryItem(R.string.belgium));
        mCountryArrayList.add(new CountryItem(R.string.belize));
        mCountryArrayList.add(new CountryItem(R.string.benin));
        mCountryArrayList.add(new CountryItem(R.string.bermuda));
        mCountryArrayList.add(new CountryItem(R.string.bhutan));
        mCountryArrayList.add(new CountryItem(R.string.bolivia));
        mCountryArrayList.add(new CountryItem(R.string.bosnia_and_herzegovina));
        mCountryArrayList.add(new CountryItem(R.string.botswana));
        mCountryArrayList.add(new CountryItem(R.string.brazil));
        mCountryArrayList.add(new CountryItem(R.string.british_virgin_islands));
        mCountryArrayList.add(new CountryItem(R.string.brunei));
        mCountryArrayList.add(new CountryItem(R.string.bulgaria));
        mCountryArrayList.add(new CountryItem(R.string.burkina_faso));
        mCountryArrayList.add(new CountryItem(R.string.burundi));
        mCountryArrayList.add(new CountryItem(R.string.cambodia));
        mCountryArrayList.add(new CountryItem(R.string.cameroon));
        mCountryArrayList.add(new CountryItem(R.string.canada));
        mCountryArrayList.add(new CountryItem(R.string.cape_verde));
        mCountryArrayList.add(new CountryItem(R.string.cayman_islands));
        mCountryArrayList.add(new CountryItem(R.string.central_african_republic));
        mCountryArrayList.add(new CountryItem(R.string.chad));
        mCountryArrayList.add(new CountryItem(R.string.chile));
        mCountryArrayList.add(new CountryItem(R.string.china));
        mCountryArrayList.add(new CountryItem(R.string.colombia));
        mCountryArrayList.add(new CountryItem(R.string.costa_rica));
        mCountryArrayList.add(new CountryItem(R.string.cote_divoire));
        mCountryArrayList.add(new CountryItem(R.string.croatia));
        mCountryArrayList.add(new CountryItem(R.string.cuba));
        mCountryArrayList.add(new CountryItem(R.string.curacao));
        mCountryArrayList.add(new CountryItem(R.string.cyprus));
        mCountryArrayList.add(new CountryItem(R.string.czech_republic));
        mCountryArrayList.add(new CountryItem(R.string.democratic_republic_of_the_congo_short_form));
        mCountryArrayList.add(new CountryItem(R.string.denmark));
        mCountryArrayList.add(new CountryItem(R.string.djibouti));
        mCountryArrayList.add(new CountryItem(R.string.dominica));
        mCountryArrayList.add(new CountryItem(R.string.dominican_republic));
        mCountryArrayList.add(new CountryItem(R.string.east_timor));
        mCountryArrayList.add(new CountryItem(R.string.ecuador));
        mCountryArrayList.add(new CountryItem(R.string.egypt));
        mCountryArrayList.add(new CountryItem(R.string.el_salvador));
        mCountryArrayList.add(new CountryItem(R.string.equatorial_guinea));
        mCountryArrayList.add(new CountryItem(R.string.eritrea));
        mCountryArrayList.add(new CountryItem(R.string.estonia));
        mCountryArrayList.add(new CountryItem(R.string.eswatini));
        mCountryArrayList.add(new CountryItem(R.string.ethiopia));
        mCountryArrayList.add(new CountryItem(R.string.falkland_islands));
        mCountryArrayList.add(new CountryItem(R.string.faroe_islands));
        mCountryArrayList.add(new CountryItem(R.string.fiji));
        mCountryArrayList.add(new CountryItem(R.string.finland));
        mCountryArrayList.add(new CountryItem(R.string.france));
        mCountryArrayList.add(new CountryItem(R.string.french_guiana));
        mCountryArrayList.add(new CountryItem(R.string.french_polynesia));
        mCountryArrayList.add(new CountryItem(R.string.gabon));
        mCountryArrayList.add(new CountryItem(R.string.gambia));
        mCountryArrayList.add(new CountryItem(R.string.georgia));
        mCountryArrayList.add(new CountryItem(R.string.germany));
        mCountryArrayList.add(new CountryItem(R.string.ghana));
        mCountryArrayList.add(new CountryItem(R.string.gibraltar));
        mCountryArrayList.add(new CountryItem(R.string.greece));
        mCountryArrayList.add(new CountryItem(R.string.greenland));
        mCountryArrayList.add(new CountryItem(R.string.grenada));
        mCountryArrayList.add(new CountryItem(R.string.guatemala));
        mCountryArrayList.add(new CountryItem(R.string.guernsey));
        mCountryArrayList.add(new CountryItem(R.string.guinea));
        mCountryArrayList.add(new CountryItem(R.string.guinea_bissau));
        mCountryArrayList.add(new CountryItem(R.string.guyana));
        mCountryArrayList.add(new CountryItem(R.string.haiti));
        mCountryArrayList.add(new CountryItem(R.string.honduras));
        mCountryArrayList.add(new CountryItem(R.string.hong_kong));
        mCountryArrayList.add(new CountryItem(R.string.hungary));
        mCountryArrayList.add(new CountryItem(R.string.iceland));
        mCountryArrayList.add(new CountryItem(R.string.india));
        mCountryArrayList.add(new CountryItem(R.string.indonesia));
        mCountryArrayList.add(new CountryItem(R.string.iran));
        mCountryArrayList.add(new CountryItem(R.string.iraq));
        mCountryArrayList.add(new CountryItem(R.string.ireland));
        mCountryArrayList.add(new CountryItem(R.string.isle_of_man));
        mCountryArrayList.add(new CountryItem(R.string.israel));
        mCountryArrayList.add(new CountryItem(R.string.italy));
        mCountryArrayList.add(new CountryItem(R.string.jamaica));
        mCountryArrayList.add(new CountryItem(R.string.japan));
        mCountryArrayList.add(new CountryItem(R.string.jersey));
        mCountryArrayList.add(new CountryItem(R.string.jordan));
        mCountryArrayList.add(new CountryItem(R.string.kazakhstan));
        mCountryArrayList.add(new CountryItem(R.string.kenya));
        mCountryArrayList.add(new CountryItem(R.string.kosovo));
        mCountryArrayList.add(new CountryItem(R.string.kuwait));
        mCountryArrayList.add(new CountryItem(R.string.kyrgyzstan));
        mCountryArrayList.add(new CountryItem(R.string.laos));
        mCountryArrayList.add(new CountryItem(R.string.latvia));
        mCountryArrayList.add(new CountryItem(R.string.lebanon));
        mCountryArrayList.add(new CountryItem(R.string.liberia));
        mCountryArrayList.add(new CountryItem(R.string.libya));
        mCountryArrayList.add(new CountryItem(R.string.liechtenstein));
        mCountryArrayList.add(new CountryItem(R.string.lithuania));
        mCountryArrayList.add(new CountryItem(R.string.luxembourg));
        mCountryArrayList.add(new CountryItem(R.string.macao));
        mCountryArrayList.add(new CountryItem(R.string.madagascar));
        mCountryArrayList.add(new CountryItem(R.string.malawi));
        mCountryArrayList.add(new CountryItem(R.string.malaysia));
        mCountryArrayList.add(new CountryItem(R.string.maldives));
        mCountryArrayList.add(new CountryItem(R.string.mali));
        mCountryArrayList.add(new CountryItem(R.string.malta));
        mCountryArrayList.add(new CountryItem(R.string.mauritania));
        mCountryArrayList.add(new CountryItem(R.string.mauritius));
        mCountryArrayList.add(new CountryItem(R.string.mexico));
        mCountryArrayList.add(new CountryItem(R.string.moldova));
        mCountryArrayList.add(new CountryItem(R.string.monaco));
        mCountryArrayList.add(new CountryItem(R.string.mongolia));
        mCountryArrayList.add(new CountryItem(R.string.montenegro));
        mCountryArrayList.add(new CountryItem(R.string.montserrat));
        mCountryArrayList.add(new CountryItem(R.string.morocco));
        mCountryArrayList.add(new CountryItem(R.string.mozambique));
        mCountryArrayList.add(new CountryItem(R.string.myanmar));
        mCountryArrayList.add(new CountryItem(R.string.namibia));
        mCountryArrayList.add(new CountryItem(R.string.nepal));
        mCountryArrayList.add(new CountryItem(R.string.netherlands));
        mCountryArrayList.add(new CountryItem(R.string.new_caledonia));
        mCountryArrayList.add(new CountryItem(R.string.new_zealand));
        mCountryArrayList.add(new CountryItem(R.string.nicaragua));
        mCountryArrayList.add(new CountryItem(R.string.niger));
        mCountryArrayList.add(new CountryItem(R.string.nigeria));
        mCountryArrayList.add(new CountryItem(R.string.north_macedonia));
        mCountryArrayList.add(new CountryItem(R.string.norway));
        mCountryArrayList.add(new CountryItem(R.string.oman));
        mCountryArrayList.add(new CountryItem(R.string.pakistan));
        mCountryArrayList.add(new CountryItem(R.string.palestine));
        mCountryArrayList.add(new CountryItem(R.string.panama));
        mCountryArrayList.add(new CountryItem(R.string.papua_new_guinea));
        mCountryArrayList.add(new CountryItem(R.string.paraguay));
        mCountryArrayList.add(new CountryItem(R.string.peru));
        mCountryArrayList.add(new CountryItem(R.string.philippines));
        mCountryArrayList.add(new CountryItem(R.string.poland));
        mCountryArrayList.add(new CountryItem(R.string.portugal));
        mCountryArrayList.add(new CountryItem(R.string.qatar));
        mCountryArrayList.add(new CountryItem(R.string.republic_of_the_congo));
        mCountryArrayList.add(new CountryItem(R.string.romania));
        mCountryArrayList.add(new CountryItem(R.string.russia));
        mCountryArrayList.add(new CountryItem(R.string.rwanda));
        mCountryArrayList.add(new CountryItem(R.string.saint_lucia));
        mCountryArrayList.add(new CountryItem(R.string.san_marino));
        mCountryArrayList.add(new CountryItem(R.string.saudi_arabia));
        mCountryArrayList.add(new CountryItem(R.string.senegal));
        mCountryArrayList.add(new CountryItem(R.string.serbia));
        mCountryArrayList.add(new CountryItem(R.string.seychelles));
        mCountryArrayList.add(new CountryItem(R.string.sierra_leone));
        mCountryArrayList.add(new CountryItem(R.string.singapore));
        mCountryArrayList.add(new CountryItem(R.string.slovakia));
        mCountryArrayList.add(new CountryItem(R.string.slovenia));
        mCountryArrayList.add(new CountryItem(R.string.somalia));
        mCountryArrayList.add(new CountryItem(R.string.south_africa));
        mCountryArrayList.add(new CountryItem(R.string.south_korea));
        mCountryArrayList.add(new CountryItem(R.string.south_sudan));
        mCountryArrayList.add(new CountryItem(R.string.spain));
        mCountryArrayList.add(new CountryItem(R.string.sri_lanka));
        mCountryArrayList.add(new CountryItem(R.string.sudan));
        mCountryArrayList.add(new CountryItem(R.string.suriname));
        mCountryArrayList.add(new CountryItem(R.string.sweden));
        mCountryArrayList.add(new CountryItem(R.string.switzerland));
        mCountryArrayList.add(new CountryItem(R.string.syria));
        mCountryArrayList.add(new CountryItem(R.string.taiwan));
        mCountryArrayList.add(new CountryItem(R.string.tajikistan));
        mCountryArrayList.add(new CountryItem(R.string.tanzania));
        mCountryArrayList.add(new CountryItem(R.string.thailand));
        mCountryArrayList.add(new CountryItem(R.string.togo));
        mCountryArrayList.add(new CountryItem(R.string.tunisia));
        mCountryArrayList.add(new CountryItem(R.string.turkey));
        mCountryArrayList.add(new CountryItem(R.string.turkmenistan));
        mCountryArrayList.add(new CountryItem(R.string.uganda));
        mCountryArrayList.add(new CountryItem(R.string.ukraine));
        mCountryArrayList.add(new CountryItem(R.string.united_arab_emirates));
        mCountryArrayList.add(new CountryItem(R.string.united_kingdom));
        mCountryArrayList.add(new CountryItem(R.string.united_states));
        mCountryArrayList.add(new CountryItem(R.string.uruguay));
        mCountryArrayList.add(new CountryItem(R.string.uzbekistan));
        mCountryArrayList.add(new CountryItem(R.string.vatican));
        mCountryArrayList.add(new CountryItem(R.string.venezuela));
        mCountryArrayList.add(new CountryItem(R.string.vietnam));
        mCountryArrayList.add(new CountryItem(R.string.yemen));
        mCountryArrayList.add(new CountryItem(R.string.zambia));
        mCountryArrayList.add(new CountryItem(R.string.zimbabwe));
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mContactUsViewModel = new ViewModelProvider(this).get(ContactUsViewModel.class);
        // TODO: Use the ViewModel

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
