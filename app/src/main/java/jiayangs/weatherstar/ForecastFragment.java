package jiayangs.weatherstar;


import android.database.Cursor;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import jiayangs.weatherstar.sync.ForcastDebugAdapter;

public class ForecastFragment extends Fragment {
    private static final String TAG = Fragment.class.getSimpleName();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView: enter");
        View rootView = inflater.inflate(R.layout.fragment_main,container,false);
        ListView listView = (ListView)rootView.findViewById(R.id.listview_forcast);
        //ForcastAdapter adapter = new ForcastAdapter(getActivity(),null,0);
        ForcastDebugAdapter adapter = new ForcastDebugAdapter(getActivity(),getMockData(7));
        listView.setAdapter(adapter);
        Log.d(TAG, "onCreateView: attached="+rootView.isAttachedToWindow());
        return rootView;
    }

    private List<Weather> getMockData(int num){
        List<Weather> mockData = new ArrayList<>();
        for(int i=0;i<num;i++){
            mockData.add(new Weather());
        }
        return mockData;
    }
}
