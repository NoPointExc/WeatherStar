package jiayangs.weatherstar.sync;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

import jiayangs.weatherstar.R;
import jiayangs.weatherstar.Weather;

/**
 * Created by sjyhe on 9/4/2016.
 */
public class ForcastDebugAdapter extends ArrayAdapter<Weather> {
    private static final int VIEW_TYPE_COUNT = 2;
    private static final int VIEW_TYPE_TODAY = 0;
    private static final int VIEW_TYPE_FUTURE_DAY = 1;

    public ForcastDebugAdapter(Context context, List<Weather> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            if(position ==0 ){
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_today, parent, false);
            }else{
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_furture, parent, false);
            }
        }

        return convertView;
    }


}
