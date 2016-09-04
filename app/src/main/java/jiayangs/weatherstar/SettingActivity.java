package jiayangs.weatherstar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

/**
 * Created by sjyhe on 9/2/2016.
 */
public class SettingActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_setting);
        setSupportActionBar(toolbar);
        if(savedInstanceState ==null){
            SelectedCityFragment selectedCityFragment = new SelectedCityFragment();
            this.getFragmentManager().beginTransaction().
                    replace(R.id.setting_container,selectedCityFragment)
                    .commit();
        }
    }

}
