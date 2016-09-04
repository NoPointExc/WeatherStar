package jiayangs.weatherstar;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

/**
 * Created by sjyhe on 9/3/2016.
 */
public class ForecastFragment extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main,container,false);
        ListView listView = (ListView)rootView.findViewById(R.id.listview_forcast);
        ForcastAdapter adapter = new ForcastAdapter(getActivity(),null,0);
        listView.setAdapter(adapter);
        return rootView;
    }
}
