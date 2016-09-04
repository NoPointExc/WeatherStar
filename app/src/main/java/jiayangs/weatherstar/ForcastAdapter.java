package jiayangs.weatherstar;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by sjyhe on 9/3/2016.
 */
public class ForcastAdapter extends CursorAdapter {

    private static final int VIEW_TYPE_COUNT = 2;
    private static final int VIEW_TYPE_TODAY = 0;
    private static final int VIEW_TYPE_FUTURE_DAY = 1;

    public ForcastAdapter(Context context, Cursor c, int flags) {
        super(context, c, flags);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        int itemViewType = getItemViewType(cursor.getPosition());
        int layoutId = -1;
        switch (itemViewType){
            case VIEW_TYPE_TODAY:
                layoutId = R.layout.list_item_today;
                break;
            case VIEW_TYPE_FUTURE_DAY:
                layoutId = R.layout.list_item_furture;
                break;
        }

        View view = LayoutInflater.from(context).inflate(layoutId,viewGroup,false);
        ViewHolder viewHolder = new ViewHolder(view);
        view.setTag(viewHolder);

        return view;
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        ViewHolder viewHolder = (ViewHolder)view.getTag();
    }

    @Override
    public int getItemViewType(int position) {
        return (position == 0 ) ? VIEW_TYPE_TODAY : VIEW_TYPE_FUTURE_DAY;
    }

    public static class ViewHolder{
        public final TextView dateTextview;
        public final ImageView imageView;
        public final TextView highTextView;
        public final TextView lowTextView;
        public final TextView forestTextView;

        public ViewHolder(View rootView){
            dateTextview = (TextView) rootView.findViewById(R.id.list_item_date_textview);
            imageView =(ImageView) rootView.findViewById(R.id.list_item_forecast_icon);
            highTextView = (TextView) rootView.findViewById(R.id.list_item_high_textview);
            lowTextView = (TextView) rootView.findViewById(R.id.list_item_low_textview);
            forestTextView = (TextView) rootView.findViewById(R.id.list_item_forecast_textview);
        }
    }
}
