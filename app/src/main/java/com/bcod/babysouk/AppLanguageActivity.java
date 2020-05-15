package com.bcod.babysouk;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import androidx.appcompat.app.AppCompatActivity;

import com.bcod.babysouk.adapter.RegionAdapter;
import com.bcod.babysouk.databinding.ActivityAppLanguageBinding;
import com.bcod.babysouk.model.RegionItem;
import com.google.android.material.button.MaterialButtonToggleGroup;

import java.util.ArrayList;


public class AppLanguageActivity extends AppCompatActivity {

    private ActivityAppLanguageBinding activityAppLanguageBinding;
    private ArrayList<RegionItem> mRegionArrayList;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityAppLanguageBinding = ActivityAppLanguageBinding.inflate(getLayoutInflater());
        View view = activityAppLanguageBinding.getRoot();
        setContentView(view);
        context = this;

        initList();

        RegionAdapter mRegionAdapter = new RegionAdapter(this, mRegionArrayList);
        activityAppLanguageBinding.regionDropDownMenu.setAdapter(mRegionAdapter);
        activityAppLanguageBinding.regionDropDownMenu.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                RegionItem clickedItem = (RegionItem) parent.getItemAtPosition(position);
                String clickedLanguage = clickedItem.getLanguage();
                switch (clickedLanguage) {
                    case "albanian":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.albanian_lang_btn_text);
                        break;
                    case "amharic":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.amharic_lang_btn_text);
                        break;
                    case "arabic":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.arabic_lang_btn_text);
                        break;
                    case "armenian":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.armenian_lang_btn_text);
                        break;
                    case "azerbaijani":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.azerbaijani_lang_btn_text);
                        break;
                    case "belarusian":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.belarusian_lang_btn_text);
                        break;
                    case "bengali":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.bengali_lang_btn_text);
                        break;
                    case "bosnian":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.bosnian_lang_btn_text);
                        break;
                    case "bulgarian":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.bulgarian_lang_btn_text);
                        break;
                    case "chinese simplified":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.chinese_simplified_lang_btn_text);
                        break;
                    case "chinese traditional":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.chinese_traditional_lang_btn_text);
                        break;
                    case "croatian":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.croatian_lang_btn_text);
                        break;
                    case "czech":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.czech_lang_btn_text);
                        break;
                    case "danish":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.danish_lang_btn_text);
                        break;
                    case "dutch":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.dutch_lang_btn_text);
                        break;
                    case "english":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.english_lang_btn_text);
                        break;
                    case "estonian":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.estonian_lang_btn_text);
                        break;
                    case "filipino":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.filipino_lang_btn_text);
                        break;
                    case "finnish":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.finnish_lang_btn_text);
                        break;
                    case "french":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.french_lang_btn_text);
                        break;
                    case "georgian":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.georgian_lang_btn_text);
                        break;
                    case "german":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.german_lang_btn_text);
                        break;
                    case "greek":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.greek_lang_btn_text);
                        break;
                    case "haitian creole":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.haitian_creole_lang_btn_text);
                        break;
                    case "hebrew":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.hebrew_lang_btn_text);
                        break;
                    case "hindi":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.hindi_lang_btn_text);
                        break;
                    case "hungarian":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.hungarian_lang_btn_text);
                        break;
                    case "icelandic":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.icelandic_lang_btn_text);
                        break;
                    case "indonesian":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.indonesian_lang_btn_text);
                        break;
                    case "irish":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.irish_lang_btn_text);
                        break;
                    case "italian":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.italian_lang_btn_text);
                        break;
                    case "japanese":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.japanese_lang_btn_text);
                        break;
                    case "kazakh":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.kazakh_lang_btn_text);
                        break;
                    case "khmer":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.khmer_lang_btn_text);
                        break;
                    case "kinyarwanda":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.kinyarwanda_lang_btn_text);
                        break;
                    case "korean":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.korean_lang_btn_text);
                        break;
                    case "kyrgyz":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.kyrgyz_lang_btn_text);
                        break;
                    case "lao":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.lao_lang_btn_text);
                        break;
                    case "latin":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.latin_lang_btn_text);
                        break;
                    case "latvian":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.latvian_lang_btn_text);
                        break;
                    case "lithuanian":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.lithuanian_lang_btn_text);
                        break;
                    case "luxembourgish":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.luxembourgish_lang_btn_text);
                        break;
                    case "macedonian":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.macedonian_lang_btn_text);
                        break;
                    case "malagasy":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.malagasy_lang_btn_text);
                        break;
                    case "malay":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.malay_lang_btn_text);
                        break;
                    case "maltese":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.maltese_lang_btn_text);
                        break;
                    case "maori":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.maori_lang_btn_text);
                        break;
                    case "mongolian":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.mongolian_lang_btn_text);
                        break;
                    case "myanmar":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.myanmar_lang_btn_text);
                        break;
                    case "nepali":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.nepali_lang_btn_text);
                        break;
                    case "norwegian":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.norwegian_lang_btn_text);
                        break;
                    case "pashto":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.pashto_lang_btn_text);
                        break;
                    case "persian":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.persian_lang_btn_text);
                        break;
                    case "polish":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.polish_lang_btn_text);
                        break;
                    case "portuguese":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.portuguese_lang_btn_text);
                        break;
                    case "romanian":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.romanian_lang_btn_text);
                        break;
                    case "russian":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.russian_lang_btn_text);
                        break;
                    case "serbian":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.serbian_lang_btn_text);
                        break;
                    case "sinhala":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.sinhala_lang_btn_text);
                        break;
                    case "slovak":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.slovak_lang_btn_text);
                        break;
                    case "slovenian":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.slovenian_lang_btn_text);
                        break;
                    case "somali":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.somali_lang_btn_text);
                        break;
                    case "spanish":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.spanish_lang_btn_text);
                        break;
                    case "swahili":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.swahili_lang_btn_text);
                        break;
                    case "swedish":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.swedish_lang_btn_text);
                        break;
                    case "tajik":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.tajik_lang_btn_text);
                        break;
                    case "thai":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.thai_lang_btn_text);
                        break;
                    case "turkish":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.turkish_lang_btn_text);
                        break;
                    case "turkmen":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.turkmen_lang_btn_text);
                        break;
                    case "ukrainian":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.ukrainian_lang_btn_text);
                        break;
                    case "urdu":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.urdu_lang_btn_text);
                        break;
                    case "uzbek":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.uzbek_lang_btn_text);
                        break;
                    case "vietnamese":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.vietnamese_lang_btn_text);
                        break;
                    case "zulu":
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.zulu_lang_btn_text);
                        break;
                    default:
                        activityAppLanguageBinding.secondLanguageButton.setText(R.string.arabic_lang_btn_text);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        activityAppLanguageBinding.languageToggle.addOnButtonCheckedListener(new MaterialButtonToggleGroup.OnButtonCheckedListener() {
            @Override
            public void onButtonChecked(MaterialButtonToggleGroup group, int checkedId, boolean isChecked) {
                if (activityAppLanguageBinding.secondLanguageButton.isChecked()) {

                } else {

                }
            }
        });
        activityAppLanguageBinding.confirmLanguage.setOnClickListener(v -> {
            Intent intent = new Intent(AppLanguageActivity.this, SignInActivity.class);
            //intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
            startActivity(intent);
            //overridePendingTransition(0,0); //0 for no animation
        });
    }

    private void initList() {
        mRegionArrayList = new ArrayList<>();
        mRegionArrayList.add(new RegionItem("United Arab Emirates",
                R.drawable.united_arab_emirates, "arabic"));
        mRegionArrayList.add(new RegionItem("Afghanistan", R.drawable.afghanistan,
                "pashto"));
        mRegionArrayList.add(new RegionItem("Albania", R.drawable.albania,
                "albanian"));
        mRegionArrayList.add(new RegionItem("Algeria", R.drawable.algeria,
                "arabic"));
        mRegionArrayList.add(new RegionItem("Andorra", R.drawable.andorra,
                "catalan"));
        mRegionArrayList.add(new RegionItem("Angola", R.drawable.angola,
                "portuguese"));
        mRegionArrayList.add(new RegionItem("Anguilla", R.drawable.anguilla,
                "english"));
        mRegionArrayList.add(new RegionItem("Argentina", R.drawable.argentina,
                "spanish"));
        mRegionArrayList.add(new RegionItem("Armenia", R.drawable.armenia,
                "armenian"));
        mRegionArrayList.add(new RegionItem("Aruba", R.drawable.aruba,
                "dutch"));
        mRegionArrayList.add(new RegionItem("Australia", R.drawable.australia,
                "english"));
        mRegionArrayList.add(new RegionItem("Austria", R.drawable.austria,
                "german"));
        mRegionArrayList.add(new RegionItem("Azerbaijan", R.drawable.azerbaijan,
                "azerbaijani"));
        mRegionArrayList.add(new RegionItem("Bahamas", R.drawable.bahamas,
                "english"));
        mRegionArrayList.add(new RegionItem("Bahrain", R.drawable.bahrain,
                "arabic"));
        mRegionArrayList.add(new RegionItem("Bangladesh", R.drawable.bangladesh,
                "bengali"));
        mRegionArrayList.add(new RegionItem("Barbados", R.drawable.barbados,
                "english"));
        mRegionArrayList.add(new RegionItem("Belarus", R.drawable.belarus,
                "belarusian"));
        mRegionArrayList.add(new RegionItem("Belgium", R.drawable.belgium,
                "dutch"));
        mRegionArrayList.add(new RegionItem("Belize", R.drawable.belize,
                "english"));
        mRegionArrayList.add(new RegionItem("Benin", R.drawable.benin,
                "french"));
        mRegionArrayList.add(new RegionItem("Bermuda", R.drawable.bermuda,
                "english"));
        mRegionArrayList.add(new RegionItem("Bhutan", R.drawable.bhutan,
                "nepali"));
        mRegionArrayList.add(new RegionItem("Bolivia", R.drawable.bolivia,
                "spanish"));
        mRegionArrayList.add(new RegionItem("Bosnia And \nHerzegovina",
                R.drawable.bosnia_and_herzegovina, "bosnian"));
        mRegionArrayList.add(new RegionItem("Botswana", R.drawable.botswana,
                "english"));
        mRegionArrayList.add(new RegionItem("Brazil", R.drawable.brazil,
                "portuguese"));
        mRegionArrayList.add(new RegionItem("British Virgin Islands",
                R.drawable.british_virgin_islands, "english"));
        mRegionArrayList.add(new RegionItem("Brunei", R.drawable.brunei,
                "malay"));
        mRegionArrayList.add(new RegionItem("Bulgaria", R.drawable.bulgaria,
                "bulgarian"));
        mRegionArrayList.add(new RegionItem("Burkina Faso", R.drawable.burkina_faso,
                "french"));
        mRegionArrayList.add(new RegionItem("Burundi", R.drawable.burundi,
                "english"));
        mRegionArrayList.add(new RegionItem("Cambodia", R.drawable.cambodia,
                "khmer"));
        mRegionArrayList.add(new RegionItem("Cameroon", R.drawable.cameroon,
                "french"));
        mRegionArrayList.add(new RegionItem("Canada", R.drawable.canada,
                "french"));
        mRegionArrayList.add(new RegionItem("Cape Verde", R.drawable.cape_verde,
                "portuguese"));
        mRegionArrayList.add(new RegionItem("Cayman Islands",
                R.drawable.cayman_islands, "english"));
        mRegionArrayList.add(new RegionItem("Central African \nRepublic",
                R.drawable.central_african_republic, "french"));
        mRegionArrayList.add(new RegionItem("Chad", R.drawable.chad,
                "french"));
        mRegionArrayList.add(new RegionItem("Chile", R.drawable.chile,
                "spanish"));
        mRegionArrayList.add(new RegionItem("China", R.drawable.china,
                "chinese simplified"));
        mRegionArrayList.add(new RegionItem("Colombia", R.drawable.colombia,
                "spanish"));
        mRegionArrayList.add(new RegionItem("Costa Rica", R.drawable.costa_rica,
                "spanish"));
        mRegionArrayList.add(new RegionItem("Cote Divoire", R.drawable.cote_divoire,
                "french"));
        mRegionArrayList.add(new RegionItem("Croatia", R.drawable.croatia,
                "croatian"));
        mRegionArrayList.add(new RegionItem("Cuba", R.drawable.cuba,
                "spanish"));
        mRegionArrayList.add(new RegionItem("Curacao", R.drawable.curacao,
                "dutch"));
        mRegionArrayList.add(new RegionItem("Cyprus", R.drawable.cyprus,
                "greek"));
        mRegionArrayList.add(new RegionItem("Czech Republic",
                R.drawable.czech_republic, "czech"));
        mRegionArrayList.add(new RegionItem("Democratic Republic \nOf The Congo",
                R.drawable.democratic_republic_of_the_congo, "french"));
        mRegionArrayList.add(new RegionItem("Denmark", R.drawable.denmark,
                "danish"));
        mRegionArrayList.add(new RegionItem("Djibouti", R.drawable.djibouti,
                "french"));
        mRegionArrayList.add(new RegionItem("Dominica", R.drawable.dominica,
                "english"));
        mRegionArrayList.add(new RegionItem("Dominican Republic",
                R.drawable.dominican_republic, "spanish"));
        mRegionArrayList.add(new RegionItem("East Timor", R.drawable.east_timor,
                "portuguese"));
        mRegionArrayList.add(new RegionItem("Ecuador", R.drawable.ecuador,
                "spanish"));
        mRegionArrayList.add(new RegionItem("Egypt", R.drawable.egypt,
                "arabic"));
        mRegionArrayList.add(new RegionItem("El Salvador", R.drawable.el_salvador,
                "spanish"));
        mRegionArrayList.add(new RegionItem("Equatorial Guinea",
                R.drawable.equatorial_guinea, "spanish"));
        mRegionArrayList.add(new RegionItem("Eritrea", R.drawable.eritrea,
                "english"));
        mRegionArrayList.add(new RegionItem("Estonia", R.drawable.estonia,
                "estonian"));
        mRegionArrayList.add(new RegionItem("Eswatini", R.drawable.eswatini,
                "english"));
        mRegionArrayList.add(new RegionItem("Ethiopia", R.drawable.ethiopia,
                "amharic"));
        mRegionArrayList.add(new RegionItem("Falkland Islands",
                R.drawable.falkland_islands, "english"));
        mRegionArrayList.add(new RegionItem("Faroe Islands",
                R.drawable.faroe_islands, "english"));
        mRegionArrayList.add(new RegionItem("Fiji", R.drawable.fiji,
                "hindi"));
        mRegionArrayList.add(new RegionItem("Finland", R.drawable.finland,
                "finnish"));
        mRegionArrayList.add(new RegionItem("France", R.drawable.france,
                "french"));
        mRegionArrayList.add(new RegionItem("French Guiana",
                R.drawable.french_guiana, "french"));
        mRegionArrayList.add(new RegionItem("French Polynesia",
                R.drawable.french_polynesia, "french"));
        mRegionArrayList.add(new RegionItem("Gabon", R.drawable.gabon,
                "french"));
        mRegionArrayList.add(new RegionItem("Gambia", R.drawable.gambia,
                "english"));
        mRegionArrayList.add(new RegionItem("Georgia", R.drawable.georgia,
                "georgian"));
        mRegionArrayList.add(new RegionItem("Germany", R.drawable.germany,
                "german"));
        mRegionArrayList.add(new RegionItem("Ghana", R.drawable.ghana,
                "english"));
        mRegionArrayList.add(new RegionItem("Gibraltar", R.drawable.gibraltar,
                "english"));
        mRegionArrayList.add(new RegionItem("Greece", R.drawable.greece,
                "greek"));
        mRegionArrayList.add(new RegionItem("Greenland", R.drawable.greenland,
                "danish"));
        mRegionArrayList.add(new RegionItem("Grenada", R.drawable.grenada,
                "english"));
        mRegionArrayList.add(new RegionItem("Guatemala", R.drawable.guatemala,
                "spanish"));
        mRegionArrayList.add(new RegionItem("Guernsey", R.drawable.guernsey,
                "english"));
        mRegionArrayList.add(new RegionItem("Guinea", R.drawable.guinea,
                "french"));
        mRegionArrayList.add(new RegionItem("Guinea Bissau",
                R.drawable.guinea_bissau, "portuguese"));
        mRegionArrayList.add(new RegionItem("Guyana", R.drawable.guyana,
                "english"));
        mRegionArrayList.add(new RegionItem("Haiti", R.drawable.haiti,
                "haitian creole"));
        mRegionArrayList.add(new RegionItem("Honduras", R.drawable.honduras,
                "spanish"));
        mRegionArrayList.add(new RegionItem("Hong Kong", R.drawable.hong_kong,
                "chinese traditional"));
        mRegionArrayList.add(new RegionItem("Hungary", R.drawable.hungary,
                "hungarian"));
        mRegionArrayList.add(new RegionItem("Iceland", R.drawable.iceland,
                "icelandic"));
        mRegionArrayList.add(new RegionItem("India", R.drawable.india,
                "hindi"));
        mRegionArrayList.add(new RegionItem("Indonesia", R.drawable.indonesia,
                "indonesian"));
        mRegionArrayList.add(new RegionItem("Iran", R.drawable.iran,
                "persian"));
        mRegionArrayList.add(new RegionItem("Iraq", R.drawable.iraq,
                "arabic"));
        mRegionArrayList.add(new RegionItem("Ireland", R.drawable.ireland,
                "irish"));
        mRegionArrayList.add(new RegionItem("Isle Of Man", R.drawable.isle_of_man,
                "english"));
        mRegionArrayList.add(new RegionItem("Israel", R.drawable.israel,
                "hebrew"));
        mRegionArrayList.add(new RegionItem("Italy", R.drawable.italy,
                "italian"));
        mRegionArrayList.add(new RegionItem("Jamaica", R.drawable.jamaica,
                "english"));
        mRegionArrayList.add(new RegionItem("Japan", R.drawable.japan,
                "japanese"));
        mRegionArrayList.add(new RegionItem("Jersey", R.drawable.jersey,
                "french"));
        mRegionArrayList.add(new RegionItem("Jordan", R.drawable.jordan,
                "arabic"));
        mRegionArrayList.add(new RegionItem("Kazakhstan", R.drawable.kazakhstan,
                "kazakh"));
        mRegionArrayList.add(new RegionItem("Kenya", R.drawable.kenya,
                "swahili"));
        mRegionArrayList.add(new RegionItem("Kosovo", R.drawable.kosovo,
                "albanian"));
        mRegionArrayList.add(new RegionItem("Kuwait", R.drawable.kuwait,
                "arabic"));
        mRegionArrayList.add(new RegionItem("Kyrgyzstan", R.drawable.kyrgyzstan,
                "kyrgyz"));
        mRegionArrayList.add(new RegionItem("Laos", R.drawable.laos,
                "lao"));
        mRegionArrayList.add(new RegionItem("Latvia", R.drawable.latvia,
                "latvian"));
        mRegionArrayList.add(new RegionItem("Lebanon", R.drawable.lebanon,
                "arabic"));
        mRegionArrayList.add(new RegionItem("Liberia", R.drawable.liberia,
                "english"));
        mRegionArrayList.add(new RegionItem("Libya", R.drawable.libya,
                "arabic"));
        mRegionArrayList.add(new RegionItem("Liechtenstein",
                R.drawable.liechtenstein, "german"));
        mRegionArrayList.add(new RegionItem("Lithuania", R.drawable.lithuania,
                "lithuanian"));
        mRegionArrayList.add(new RegionItem("Luxembourg", R.drawable.luxembourg,
                "luxembourgish"));
        mRegionArrayList.add(new RegionItem("Macao", R.drawable.macao,
                "chinese simplified"));
        mRegionArrayList.add(new RegionItem("Madagascar", R.drawable.madagascar,
                "malagasy"));
        mRegionArrayList.add(new RegionItem("Malawi", R.drawable.malawi,
                "english"));
        mRegionArrayList.add(new RegionItem("Malaysia", R.drawable.malaysia,
                "malay"));
        mRegionArrayList.add(new RegionItem("Maldives", R.drawable.maldives,
                "english"));
        mRegionArrayList.add(new RegionItem("Mali", R.drawable.mali,
                "french"));
        mRegionArrayList.add(new RegionItem("Malta", R.drawable.malta,
                "maltese"));
        mRegionArrayList.add(new RegionItem("Mauritania", R.drawable.mauritania,
                "arabic"));
        mRegionArrayList.add(new RegionItem("Mauritius", R.drawable.mauritius,
                "english"));
        mRegionArrayList.add(new RegionItem("Mexico", R.drawable.mexico,
                "spanish"));
        mRegionArrayList.add(new RegionItem("Moldova", R.drawable.moldova,
                "romanian"));
        mRegionArrayList.add(new RegionItem("Monaco", R.drawable.monaco,
                "french"));
        mRegionArrayList.add(new RegionItem("Mongolia", R.drawable.mongolia,
                "mongolian"));
        mRegionArrayList.add(new RegionItem("Montenegro", R.drawable.montenegro,
                "serbian"));
        mRegionArrayList.add(new RegionItem("Montserrat", R.drawable.montserrat,
                "english"));
        mRegionArrayList.add(new RegionItem("Morocco", R.drawable.morocco,
                "arabic"));
        mRegionArrayList.add(new RegionItem("Mozambique", R.drawable.mozambique,
                "portuguese"));
        mRegionArrayList.add(new RegionItem("Myanmar", R.drawable.myanmar,
                "myanmar"));
        mRegionArrayList.add(new RegionItem("Namibia", R.drawable.namibia,
                "english"));
        mRegionArrayList.add(new RegionItem("Nepal", R.drawable.nepal,
                "nepali"));
        mRegionArrayList.add(new RegionItem("Netherlands", R.drawable.netherlands,
                "dutch"));
        mRegionArrayList.add(new RegionItem("New Caledonia",
                R.drawable.new_caledonia, "french"));
        mRegionArrayList.add(new RegionItem("New Zealand", R.drawable.new_zealand,
                "maori"));
        mRegionArrayList.add(new RegionItem("Nicaragua", R.drawable.nicaragua,
                "spanish"));
        mRegionArrayList.add(new RegionItem("Niger", R.drawable.niger,
                "french"));
        mRegionArrayList.add(new RegionItem("Nigeria", R.drawable.nigeria,
                "english"));
        mRegionArrayList.add(new RegionItem("North Macedonia",
                R.drawable.north_macedonia, "macedonian"));
        mRegionArrayList.add(new RegionItem("Norway", R.drawable.norway,
                "norwegian"));
        mRegionArrayList.add(new RegionItem("Oman", R.drawable.oman,
                "arabic"));
        mRegionArrayList.add(new RegionItem("Pakistan", R.drawable.pakistan,
                "urdu"));
        mRegionArrayList.add(new RegionItem("Palestine", R.drawable.palestine,
                "arabic"));
        mRegionArrayList.add(new RegionItem("Panama", R.drawable.panama,
                "spanish"));
        mRegionArrayList.add(new RegionItem("Papua New Guinea",
                R.drawable.papua_new_guinea, "english"));
        mRegionArrayList.add(new RegionItem("Paraguay", R.drawable.paraguay,
                "spanish"));
        mRegionArrayList.add(new RegionItem("Peru", R.drawable.peru,
                "spanish"));
        mRegionArrayList.add(new RegionItem("Philippines", R.drawable.philippines,
                "filipino"));
        mRegionArrayList.add(new RegionItem("Poland", R.drawable.poland,
                "polish"));
        mRegionArrayList.add(new RegionItem("Portugal", R.drawable.portugal,
                "portuguese"));
        mRegionArrayList.add(new RegionItem("Qatar", R.drawable.qatar,
                "arabic"));
        mRegionArrayList.add(new RegionItem("Republic Of The Congo",
                R.drawable.republic_of_the_congo, "french"));
        mRegionArrayList.add(new RegionItem("Romania", R.drawable.romania,
                "romanian"));
        mRegionArrayList.add(new RegionItem("Russia", R.drawable.russia,
                "russian"));
        mRegionArrayList.add(new RegionItem("Rwanda", R.drawable.rwanda,
                "kinyarwanda"));
        mRegionArrayList.add(new RegionItem("Saint Lucia", R.drawable.saint_lucia,
                "english"));
        mRegionArrayList.add(new RegionItem("San Marino", R.drawable.san_marino,
                "italian"));
        mRegionArrayList.add(new RegionItem("Saudi Arabia", R.drawable.saudi_arabia,
                "arabic"));
        mRegionArrayList.add(new RegionItem("Senegal", R.drawable.senegal,
                "french"));
        mRegionArrayList.add(new RegionItem("Serbia", R.drawable.serbia,
                "serbian"));
        mRegionArrayList.add(new RegionItem("Seychelles", R.drawable.seychelles,
                "french"));
        mRegionArrayList.add(new RegionItem("Sierra Leone", R.drawable.sierra_leone,
                "english"));
        mRegionArrayList.add(new RegionItem("Singapore", R.drawable.singapore,
                "malay"));
        mRegionArrayList.add(new RegionItem("Slovakia", R.drawable.slovakia,
                "slovak"));
        mRegionArrayList.add(new RegionItem("Slovenia", R.drawable.slovenia,
                "slovenian"));
        mRegionArrayList.add(new RegionItem("Somalia", R.drawable.somalia,
                "somali"));
        mRegionArrayList.add(new RegionItem("South Africa", R.drawable.south_africa,
                "zulu"));
        mRegionArrayList.add(new RegionItem("South Korea", R.drawable.south_korea,
                "korean"));
        mRegionArrayList.add(new RegionItem("South Sudan", R.drawable.south_sudan,
                "english"));
        mRegionArrayList.add(new RegionItem("Spain", R.drawable.spain,
                "spanish"));
        mRegionArrayList.add(new RegionItem("Sri Lanka", R.drawable.sri_lanka,
                "sinhala"));
        mRegionArrayList.add(new RegionItem("Sudan", R.drawable.sudan,
                "arabic"));
        mRegionArrayList.add(new RegionItem("Suriname", R.drawable.suriname,
                "dutch"));
        mRegionArrayList.add(new RegionItem("Sweden", R.drawable.sweden,
                "swedish"));
        mRegionArrayList.add(new RegionItem("Switzerland", R.drawable.switzerland,
                "german"));
        mRegionArrayList.add(new RegionItem("Syria", R.drawable.syria,
                "arabic"));
        mRegionArrayList.add(new RegionItem("Taiwan", R.drawable.taiwan,
                "chinese traditional"));
        mRegionArrayList.add(new RegionItem("Tanzania", R.drawable.tanzania,
                "swahili"));
        mRegionArrayList.add(new RegionItem("Tajikistan", R.drawable.tajikistan,
                "tajik"));
        mRegionArrayList.add(new RegionItem("Thailand", R.drawable.thailand,
                "thai"));
        mRegionArrayList.add(new RegionItem("Togo", R.drawable.togo,
                "french"));
        mRegionArrayList.add(new RegionItem("Tunisia", R.drawable.tunisia,
                "arabic"));
        mRegionArrayList.add(new RegionItem("Turkey", R.drawable.turkey,
                "turkish"));
        mRegionArrayList.add(new RegionItem("Turkmenistan", R.drawable.turkmenistan,
                "turkmen"));
        mRegionArrayList.add(new RegionItem("Uganda", R.drawable.uganda,
                "swahili"));
        mRegionArrayList.add(new RegionItem("Ukraine", R.drawable.ukraine,
                "ukrainian"));
        mRegionArrayList.add(new RegionItem("United Arab Emirates",
                R.drawable.united_arab_emirates, "arabic"));
        mRegionArrayList.add(new RegionItem("United Kingdom",
                R.drawable.united_kingdom, "english"));
        mRegionArrayList.add(new RegionItem("United States",
                R.drawable.united_states, "english"));
        mRegionArrayList.add(new RegionItem("Uruguay", R.drawable.uruguay,
                "spanish"));
        mRegionArrayList.add(new RegionItem("Uzbekistan", R.drawable.uzbekistan,
                "uzbek"));
        mRegionArrayList.add(new RegionItem("Vatican", R.drawable.vatican,
                "latin"));
        mRegionArrayList.add(new RegionItem("Venezuela", R.drawable.venezuela,
                "spanish"));
        mRegionArrayList.add(new RegionItem("Vietnam", R.drawable.vietnam,
                "vietnamese"));
        mRegionArrayList.add(new RegionItem("Yemen", R.drawable.yemen,
                "arabic"));
        mRegionArrayList.add(new RegionItem("Zambia", R.drawable.zambia,
                "english"));
        mRegionArrayList.add(new RegionItem("Zimbabwe", R.drawable.zimbabwe,
                "english"));
    }
}