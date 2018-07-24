package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdaptor extends ArrayAdapter<Word> {

    private static final int NO_IMAGE = -1;
    private int categoryColorId;

    public WordAdaptor(@NonNull Activity context, ArrayList<Word> words, int colorId) {
        super(context, 0, words);
        categoryColorId = colorId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listViewItem = convertView;
        if (listViewItem == null) {
            listViewItem = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        Word currenWords = getItem(position);

        TextView miwokTextview = listViewItem.findViewById(R.id.miwok_word);
        miwokTextview.setText(currenWords.getMiwokTranslation());

        TextView englishTextview = listViewItem.findViewById(R.id.english_word);
        englishTextview.setText(currenWords.getdefaultTranslation());

        ImageView displayImage = listViewItem.findViewById(R.id.display_image);
        if (currenWords.getImageResourceId() == NO_IMAGE) {
            displayImage.setVisibility(View.GONE);
        } else {
            displayImage.setImageResource(currenWords.getImageResourceId());
        }
        LinearLayout textContainer = listViewItem.findViewById(R.id.text_container);
        textContainer.setBackgroundColor(ContextCompat.getColor(getContext(),categoryColorId));
        return listViewItem;
    }
}
