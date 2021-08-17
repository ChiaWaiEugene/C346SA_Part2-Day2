package sg.edu.rp.c346.id20041877.c346sapart2_day2;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context context;
    int layout_id;
    ArrayList<Expenditure> expList;

    public CustomAdapter(Context context, int resource, ArrayList<Expenditure> SongList) {
        super(context, resource, expList);

        this.context = context;
        this.layout_id = resource;
        this.expList = expList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id, parent, false);

        TextView tv1 = rowView.findViewById(R.id.textView1);
        TextView tv2 = rowView.findViewById(R.id.textView2);
        ImageView ivNew = rowView.findViewById(R.id.ivNote);

        Expenditure currItem = expList.get(position);

        tv1.setText((int) currItem.getAmount());
        tv2.setText(currItem.getPlace());

        tv2.setTextColor(Color.GRAY);


        if (currItem.getAmount() >= 5) {
            ivNew.setVisibility(View.VISIBLE);
        }
        else {
            ivNew.setVisibility(View.INVISIBLE);
        }

        return rowView;
    }


}
