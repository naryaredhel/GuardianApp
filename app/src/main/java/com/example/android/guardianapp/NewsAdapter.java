package com.example.android.guardianapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class NewsAdapter extends ArrayAdapter<News> {

    //named the elements as eNews to prevent confusing
    public NewsAdapter(Context context, ArrayList<News> eNews) {
        super(context, 0, eNews);
    }

    private static final String LOCATION_SEPARATOR = "T";

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_news_view, parent, false);
        }

        News currentNews = getItem(position);

        TextView title = (TextView) listItemView.findViewById(R.id.title);
        title.setText(currentNews.getTitle());

        TextView section = (TextView) listItemView.findViewById(R.id.section);
        section.setText(currentNews.getSection());

        String originalLocation = currentNews.getTime();
        String date;
        String hour;

        if (originalLocation.contains(LOCATION_SEPARATOR)) {
            String[] parts = originalLocation.split(LOCATION_SEPARATOR);
            date = parts[0] + LOCATION_SEPARATOR;
            hour = parts[1];
        } else {
            date = "YYYY/MM/DD";
            hour = "HH:MM:SS";
        }

        TextView dateView = (TextView) listItemView.findViewById(R.id.date);
        dateView.setText(date);

        TextView hourView = (TextView) listItemView.findViewById(R.id.hour);
        hourView.setText(hour);

        TextView author = (TextView) listItemView.findViewById(R.id.author);
        author.setText(currentNews.getAuthor());

        return listItemView;
    }
}
