package com.example.newsapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class ArticleAdapter extends ArrayAdapter<Article> {

    public ArticleAdapter(Context context, List<Article> articles) {
        super(context, 0, articles);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_item, parent, false);
        }

        Article currentArticle = getItem(position);

        if (currentArticle != null) {
            TextView titleTextView = listItemView.findViewById(R.id.article_title);
            titleTextView.setText(currentArticle.getArticleTitle());

            TextView sectionTextView = listItemView.findViewById(R.id.section);
            sectionTextView.setText(currentArticle.getSection());

            TextView dateTextView = listItemView.findViewById(R.id.date);
            dateTextView.setText(currentArticle.getPublishDate());

            TextView authorTextView = listItemView.findViewById(R.id.author);
            authorTextView.setText(currentArticle.getAuthor());
        }

        return listItemView;
    }
}