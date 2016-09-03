package jiayangs.weatherstar;

import android.app.Activity;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by sjyhe on 9/2/2016.
 */
public class SettingActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        if(savedInstanceState ==null){
            SelectedCityFragment selectedCityFragment = new SelectedCityFragment();
            this.getFragmentManager().beginTransaction().
                    replace(R.id.setting_container,selectedCityFragment)
                    .commit();
        }
    }

}
