package com.bcod.babysouk.ui.account.settings;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.bcod.babysouk.R;
import com.bcod.babysouk.adapter.CurrencyAdapter;
import com.bcod.babysouk.adapter.LanguageAdapter;
import com.bcod.babysouk.databinding.SettingsFragmentBinding;
import com.bcod.babysouk.model.CurrencyItem;
import com.bcod.babysouk.model.LanguageItem;

import java.util.ArrayList;

public class SettingsFragment extends Fragment {

    private SettingsFragmentBinding binding;
    private SettingsViewModel mSettingsViewModel;
    private ArrayList<CurrencyItem> mCurrencyArrayList;
    private ArrayList<LanguageItem> mLanguageArrayList;
    private Context context;

    public static SettingsFragment newInstance() {
        return new SettingsFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = SettingsFragmentBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        if (container != null) {
            context = container.getContext();
        }
        initCurrencyList();
        initLanguageList();

        CurrencyAdapter mRegionAdapter = new CurrencyAdapter(context, mCurrencyArrayList);
        if (binding.countryDropDownMenu != null) {
            binding.countryDropDownMenu.setAdapter(mRegionAdapter);
        }
        LanguageAdapter mLanguageAdapter = new LanguageAdapter(context, mLanguageArrayList);
        binding.languageDropDownMenu.setAdapter(mLanguageAdapter);
        binding.languageDropDownMenu.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                LanguageItem clickedItem = (LanguageItem) parent.getItemAtPosition(position);
                /*String clickedLanguageName = clickedItem.getLanguage();
                Toast.makeText(SettingsFragment.this, clickedLanguageName + "selected",
                        Toast.LENGTH_SHORT).show();*/
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mSettingsViewModel = new ViewModelProvider(this).get(SettingsViewModel.class);
        // TODO: Use the ViewModel
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    private void initCurrencyList() {
        mCurrencyArrayList = new ArrayList<>();
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.united_arab_emirates,
                R.string.united_arab_emirates_short_form, R.string.united_arab_emirates_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.afghanistan,
                R.string.afghanistan, R.string.afghanistan_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.albania,
                R.string.albania, R.string.albania_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.algeria,
                R.string.algeria, R.string.algeria_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.andorra,
                R.string.andorra, R.string.andorra_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.angola,
                R.string.angola, R.string.angola_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.anguilla,
                R.string.anguilla, R.string.anguilla_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.argentina,
                R.string.argentina, R.string.argentina_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.armenia,
                R.string.armenia, R.string.armenia_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.aruba,
                R.string.aruba, R.string.aruba_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.australia,
                R.string.australia, R.string.australia_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.austria,
                R.string.austria, R.string.austria_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.azerbaijan,
                R.string.azerbaijan, R.string.azerbaijan_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.bahamas,
                R.string.bahamas, R.string.bahamas_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.bahrain,
                R.string.bahrain, R.string.bahrain_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.bangladesh,
                R.string.bangladesh, R.string.bangladesh_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.barbados,
                R.string.barbados, R.string.barbados_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.belarus,
                R.string.belarus, R.string.belarus_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.belgium,
                R.string.belgium, R.string.belarus_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.belize,
                R.string.belize, R.string.belize_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.benin,
                R.string.benin, R.string.benin_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.bermuda,
                R.string.bermuda, R.string.bermuda_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.bhutan,
                R.string.bhutan, R.string.bhutan_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.bolivia,
                R.string.bolivia, R.string.bolivia_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.bosnia_and_herzegovina,
                R.string.bosnia_and_herzegovina, R.string.bosnia_and_herzegovina_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.botswana,
                R.string.botswana, R.string.botswana_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.brazil,
                R.string.brazil, R.string.brazil_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.british_virgin_islands,
                R.string.british_virgin_islands, R.string.british_virgin_islands_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.brunei,
                R.string.brunei, R.string.brunei_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.bulgaria,
                R.string.bulgaria, R.string.bulgaria_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.burkina_faso,
                R.string.burkina_faso, R.string.burkina_faso_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.burundi,
                R.string.burundi, R.string.burundi_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.cambodia,
                R.string.cambodia, R.string.cambodia_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.cameroon,
                R.string.cameroon, R.string.cameroon_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.canada,
                R.string.canada, R.string.canada_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.cape_verde,
                R.string.cape_verde, R.string.cape_verde_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.cayman_islands,
                R.string.cayman_islands, R.string.cayman_islands_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.central_african_republic,
                R.string.central_african_republic, R.string.central_african_republic_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.chad,
                R.string.chad, R.string.chad_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.chile,
                R.string.chile, R.string.chile_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.china,
                R.string.china, R.string.china_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.colombia,
                R.string.colombia, R.string.colombia_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.costa_rica,
                R.string.costa_rica, R.string.costa_rica_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.cote_divoire,
                R.string.cote_divoire, R.string.cote_divoire_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.croatia,
                R.string.croatia, R.string.croatia_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.cuba,
                R.string.cuba, R.string.cuba_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.curacao,
                R.string.curacao, R.string.curacao_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.cyprus,
                R.string.cyprus, R.string.cyprus_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.czech_republic,
                R.string.czech_republic, R.string.czech_republic_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.democratic_republic_of_the_congo,
                R.string.democratic_republic_of_the_congo_short_form,
                R.string.democratic_republic_of_the_congo_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.denmark,
                R.string.denmark, R.string.denmark_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.djibouti,
                R.string.djibouti, R.string.djibouti_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.dominica,
                R.string.dominica, R.string.dominica_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.dominican_republic,
                R.string.dominican_republic, R.string.dominican_republic_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.east_timor,
                R.string.east_timor, R.string.east_timor_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.ecuador,
                R.string.ecuador, R.string.ecuador_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.egypt,
                R.string.egypt, R.string.egypt_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.el_salvador,
                R.string.el_salvador, R.string.el_salvador_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.equatorial_guinea,
                R.string.equatorial_guinea, R.string.equatorial_guinea_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.eritrea,
                R.string.eritrea, R.string.eritrea_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.estonia,
                R.string.estonia, R.string.estonia_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.eswatini,
                R.string.eswatini, R.string.eswatini_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.ethiopia,
                R.string.ethiopia, R.string.ethiopia_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.falkland_islands,
                R.string.falkland_islands, R.string.falkland_islands_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.faroe_islands,
                R.string.faroe_islands, R.string.faroe_islands_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.fiji,
                R.string.fiji, R.string.fiji_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.finland,
                R.string.finland, R.string.finland_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.france,
                R.string.france, R.string.france_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.french_guiana,
                R.string.french_guiana, R.string.french_guiana_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.french_polynesia,
                R.string.french_polynesia, R.string.french_polynesia_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.gabon,
                R.string.gabon, R.string.gabon_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.gambia,
                R.string.gambia, R.string.gambia_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.georgia,
                R.string.georgia, R.string.georgia_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.germany,
                R.string.germany, R.string.germany_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.ghana,
                R.string.ghana, R.string.ghana_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.gibraltar,
                R.string.gibraltar, R.string.gibraltar_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.greece,
                R.string.greece, R.string.greece_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.greenland,
                R.string.greenland, R.string.greenland_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.grenada,
                R.string.grenada, R.string.grenada_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.guatemala,
                R.string.guatemala, R.string.guatemala_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.guernsey,
                R.string.guernsey, R.string.guernsey_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.guinea,
                R.string.guinea, R.string.guinea_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.guinea_bissau,
                R.string.guinea_bissau, R.string.guinea_bissau_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.guyana,
                R.string.guyana, R.string.guyana_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.haiti,
                R.string.haiti, R.string.haiti_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.honduras,
                R.string.honduras, R.string.honduras_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.hong_kong,
                R.string.hong_kong, R.string.hong_kong_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.hungary,
                R.string.hungary, R.string.hungary_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.iceland,
                R.string.iceland, R.string.iceland_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.india,
                R.string.india, R.string.india_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.indonesia,
                R.string.indonesia, R.string.indonesia_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.iran,
                R.string.iran, R.string.iran_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.iraq,
                R.string.iraq, R.string.iraq_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.ireland,
                R.string.ireland, R.string.ireland_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.isle_of_man,
                R.string.isle_of_man, R.string.isle_of_man_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.israel,
                R.string.israel, R.string.israel_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.italy,
                R.string.italy, R.string.italy_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.jamaica,
                R.string.jamaica, R.string.jamaica_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.japan,
                R.string.japan, R.string.japan_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.jersey,
                R.string.jersey, R.string.jersey_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.jordan,
                R.string.jordan, R.string.jordan_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.kazakhstan,
                R.string.kazakhstan, R.string.kazakhstan_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.kenya,
                R.string.kenya, R.string.kenya_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.kosovo,
                R.string.kosovo, R.string.kosovo_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.kuwait,
                R.string.kuwait, R.string.kuwait_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.kyrgyzstan,
                R.string.kyrgyzstan, R.string.kyrgyzstan_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.laos,
                R.string.laos, R.string.laos_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.latvia,
                R.string.latvia, R.string.latvia_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.lebanon,
                R.string.lebanon, R.string.lebanon_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.liberia,
                R.string.liberia, R.string.liberia_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.libya,
                R.string.libya, R.string.libya_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.liechtenstein,
                R.string.liechtenstein, R.string.liechtenstein_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.lithuania,
                R.string.lithuania, R.string.lithuania_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.luxembourg,
                R.string.luxembourg, R.string.luxembourg_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.macao,
                R.string.macao, R.string.macao_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.madagascar,
                R.string.madagascar, R.string.madagascar_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.malawi,
                R.string.malawi, R.string.malawi_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.malaysia,
                R.string.malaysia, R.string.malaysia_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.maldives,
                R.string.maldives, R.string.maldives_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.mali,
                R.string.mali, R.string.mali_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.malta,
                R.string.malta, R.string.malta_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.mauritania,
                R.string.mauritania, R.string.mauritania_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.mauritius,
                R.string.mauritius, R.string.mauritius_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.mexico,
                R.string.mexico, R.string.mexico_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.moldova,
                R.string.moldova, R.string.moldova_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.monaco,
                R.string.monaco, R.string.monaco_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.mongolia,
                R.string.mongolia, R.string.mongolia_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.montenegro,
                R.string.montenegro, R.string.montenegro_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.montserrat,
                R.string.montserrat, R.string.montserrat_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.morocco,
                R.string.morocco, R.string.morocco_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.mozambique,
                R.string.mozambique, R.string.mozambique_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.myanmar,
                R.string.myanmar, R.string.myanmar_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.namibia,
                R.string.namibia, R.string.namibia_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.nepal,
                R.string.nepal, R.string.nepal_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.netherlands,
                R.string.netherlands, R.string.netherlands_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.new_caledonia,
                R.string.new_caledonia, R.string.new_caledonia_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.new_zealand,
                R.string.new_zealand, R.string.new_zealand_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.nicaragua,
                R.string.nicaragua, R.string.nicaragua_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.niger,
                R.string.niger, R.string.niger_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.nigeria,
                R.string.nigeria, R.string.nigeria_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.north_macedonia,
                R.string.north_macedonia, R.string.north_macedonia_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.norway,
                R.string.norway, R.string.norway));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.oman,
                R.string.oman, R.string.oman_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.pakistan,
                R.string.pakistan, R.string.pakistan_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.palestine,
                R.string.palestine, R.string.palestine_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.panama,
                R.string.panama, R.string.panama_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.papua_new_guinea,
                R.string.papua_new_guinea, R.string.papua_new_guinea_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.paraguay,
                R.string.paraguay, R.string.paraguay_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.peru,
                R.string.peru, R.string.peru_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.philippines,
                R.string.philippines, R.string.philippines_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.poland,
                R.string.poland, R.string.poland_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.portugal,
                R.string.portugal, R.string.portugal_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.qatar,
                R.string.qatar, R.string.qatar_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.republic_of_the_congo,
                R.string.republic_of_the_congo, R.string.republic_of_the_congo_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.romania,
                R.string.romania, R.string.romania_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.russia,
                R.string.russia, R.string.russia_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.rwanda,
                R.string.rwanda, R.string.rwanda_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.saint_lucia,
                R.string.saint_lucia, R.string.saint_lucia_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.san_marino,
                R.string.san_marino, R.string.san_marino_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.saudi_arabia,
                R.string.saudi_arabia, R.string.saudi_arabia_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.senegal,
                R.string.senegal, R.string.senegal_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.serbia,
                R.string.serbia, R.string.serbia_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.seychelles,
                R.string.seychelles, R.string.seychelles_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.sierra_leone,
                R.string.sierra_leone, R.string.sierra_leone_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.singapore,
                R.string.singapore, R.string.singapore_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.slovakia,
                R.string.slovakia, R.string.slovakia_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.slovenia,
                R.string.slovenia, R.string.slovenia));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.somalia,
                R.string.somalia, R.string.somalia_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.south_africa,
                R.string.south_africa, R.string.south_africa_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.south_korea,
                R.string.south_korea, R.string.south_korea_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.south_sudan,
                R.string.south_sudan, R.string.south_sudan_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.spain,
                R.string.spain, R.string.spain_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.sri_lanka,
                R.string.sri_lanka, R.string.sri_lanka_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.sudan,
                R.string.sudan, R.string.sudan_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.suriname,
                R.string.suriname, R.string.suriname_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.sweden,
                R.string.sweden, R.string.sweden_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.switzerland,
                R.string.switzerland, R.string.switzerland_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.syria,
                R.string.syria, R.string.syria_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.taiwan,
                R.string.taiwan, R.string.taiwan_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.tajikistan,
                R.string.tajikistan, R.string.tajikistan_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.tanzania,
                R.string.tanzania, R.string.tanzania_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.thailand,
                R.string.thailand, R.string.thailand_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.togo,
                R.string.togo, R.string.togo_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.tunisia,
                R.string.tunisia, R.string.tunisia_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.turkey,
                R.string.turkey, R.string.turkey_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.turkmenistan,
                R.string.turkmenistan, R.string.turkmenistan_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.uganda,
                R.string.uganda, R.string.uganda_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.ukraine,
                R.string.ukraine, R.string.ukraine_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.united_arab_emirates,
                R.string.united_arab_emirates, R.string.united_arab_emirates_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.united_kingdom,
                R.string.united_kingdom, R.string.united_kingdom_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.united_states,
                R.string.united_states, R.string.united_states_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.uruguay,
                R.string.uruguay, R.string.uruguay_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.uzbekistan,
                R.string.uzbekistan, R.string.uzbekistan_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.vatican,
                R.string.vatican, R.string.vatican_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.venezuela,
                R.string.venezuela, R.string.venezuela_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.vietnam,
                R.string.vietnam, R.string.vietnam_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.yemen,
                R.string.yemen, R.string.yemen_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.zambia,
                R.string.zambia, R.string.zambia_currency));
        mCurrencyArrayList.add(new CurrencyItem(R.drawable.zimbabwe,
                R.string.zimbabwe, R.string.zimbabwe_currency));
    }

    private void initLanguageList() {
        mLanguageArrayList = new ArrayList<>();
        mLanguageArrayList.add(new LanguageItem(R.string.albanian_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.amharic_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.arabic_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.armenian_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.azerbaijani_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.belarusian_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.bengali_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.bosnian_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.bulgarian_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.chinese_simplified_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.chinese_traditional_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.croatian_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.czech_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.danish_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.dutch_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.english_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.estonian_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.filipino_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.finnish_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.french_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.georgian_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.german_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.greek_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.haitian_creole_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.hebrew_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.hindi_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.hungarian_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.icelandic_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.indonesian_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.irish_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.italian_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.japanese_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.kazakh_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.khmer_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.kinyarwanda_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.korean_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.kyrgyz_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.lao_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.latin_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.latvian_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.lithuanian_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.luxembourgish_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.macedonian_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.malagasy_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.malay_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.maltese_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.maori_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.mongolian_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.myanmar_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.nepali_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.norwegian_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.pashto_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.persian_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.polish_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.portuguese_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.romanian_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.russian_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.serbian_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.sinhala_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.slovak_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.slovenian_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.somali_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.spanish_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.swahili_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.swedish_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.tajik_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.thai_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.turkish_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.turkmen_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.ukrainian_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.urdu_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.uzbek_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.vietnamese_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.zulu_lang_btn_text));
    }
}
