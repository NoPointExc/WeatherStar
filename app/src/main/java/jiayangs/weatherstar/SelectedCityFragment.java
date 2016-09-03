package jiayangs.weatherstar;

import android.content.Context;
import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.util.AttributeSet;
import android.util.Log;

/**
 * Created by sjyhe on 9/2/2016.
 */
public class SelectedCityFragment extends PreferenceFragment {
    private final String TAG = this.getClass().getSimpleName();
    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: enter");
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.selected_city_perference);
    }
}
