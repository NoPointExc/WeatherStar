package jiayangs.weatherstar;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.ListPreference;
import android.preference.PreferenceManager;
import android.util.Log;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


/**
 * Created by sjyhe on 9/4/2016.
 */
public class Util {
    private static final String TAG = Util.class.getSimpleName();

    public static Set<String> getSelectedCity(Context context){
        SharedPreferences preference = PreferenceManager.getDefaultSharedPreferences(context);
        Set<String> set = preference.getStringSet(context.getString(R.string.key_selected_cities),new HashSet<String>());
        Log.d(TAG, "getSelectedCity: "+set);
        return set;
    }

    public static CharSequence[] getSelectedCityName(Context context){
        SharedPreferences preference = PreferenceManager.getDefaultSharedPreferences(context);
        Set<String> selectedCityCodes = preference.getStringSet(context.getString(R.string.key_selected_cities),new HashSet<String>());
        CharSequence[] selectedCityNames = new CharSequence[selectedCityCodes.size()];

        String[] codes = context.getResources().getStringArray(R.array.city_codes);
        String[] names = context.getResources().getStringArray(R.array.city_options);
        HashMap<String,String> map = new HashMap<>();

        for(int i=0;i<codes.length;i++){
            map.put(codes[i],names[i]);
        }

        int i = 0;
        for(String code:selectedCityCodes){
            selectedCityNames[i] = map.get(code);
            i++;
        }

        return selectedCityNames;
    }
}
