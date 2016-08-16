package com.example.hwhong.newyorktimesclone;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by hwhong on 7/29/16.
 */
public class Adapter extends ArrayAdapter<String> {

        String[] titles = {};
        String[] descriptions = {};
        Context c;
        LayoutInflater inflater;

public Adapter(Context context, String[] titles, String[] descriptions) {
        super(context, R.layout.newsview, titles);
        this.c = context;
        this.titles = titles;
        this.descriptions = descriptions;
        }

public class ViewHolder {
    TextView titles;
    TextView descriptions;
}

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null) {
            inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.newsview, null);
        }

        final ViewHolder holder = new  ViewHolder();

        holder.titles = (TextView) convertView.findViewById(R.id.titleTV);
        holder.descriptions = (TextView) convertView.findViewById(R.id.descripTV);

        holder.titles.setText(titles[position]);
        holder.descriptions.setText(descriptions[position]);

        return convertView;
    }
}
