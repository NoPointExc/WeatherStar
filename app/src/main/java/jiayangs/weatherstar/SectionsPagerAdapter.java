package jiayangs.weatherstar;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

import jiayangs.weatherstar.data.WeatherContract;

/**
 * Created by sjyhe on 9/4/2016.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {
    private Context mContext;
    private final static String TAG = FragmentPagerAdapter.class.getSimpleName();

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {;
        String selectedCityCode = (String)Util.getSelectedCity(mContext).toArray()[position];
        return this.newInstance(selectedCityCode);
    }

    @Override
    public int getCount() {
        int count = Util.getSelectedCity(mContext).size();
        Log.d(TAG, "getCount: "+count);
        return count;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        CharSequence[] selectedCityNames = Util.getSelectedCityName(mContext);
        return selectedCityNames[position];
    }

    public static Fragment newInstance(String locationCode){
        Log.d(TAG, "newInstance: enter");
        Fragment fragment = new ForecastFragment();
        Bundle args = new Bundle();
        args.putString(WeatherContract.KEY_LOCATION_CODE,locationCode);
        fragment.setArguments(args);
        return fragment;
    }
}