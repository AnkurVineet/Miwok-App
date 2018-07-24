package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("lutti","one",R.drawable.number_one));
        words.add(new Word("otiiko","two",R.drawable.number_two));
        words.add(new Word("tolookosu","three",R.drawable.number_three));
        words.add(new Word("oyyisa","four",R.drawable.number_four));
        words.add(new Word("massokka","five",R.drawable.number_five));
        words.add(new Word("temmokka","six",R.drawable.number_six));
        words.add(new Word("kenekaku","seven",R.drawable.number_seven));
        words.add(new Word("kawinta","eight",R.drawable.number_eight));
        words.add(new Word("wo'e","nine",R.drawable.number_nine));
        words.add(new Word("na'aaacha","ten",R.drawable.number_ten));

        WordAdaptor adapter = new WordAdaptor(this,words,R.color.category_numbers);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);


    }
}



/**Old but simplified code kept for reference. Uses default ArrayList and ArrayAdapter

// ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,words);
//Log.i("NumbersActivity","Second Number:"+words.get(1));
//        LinearLayout rootView = findViewById(R.id.rootView);
//        for(int index = 0; index < words.size(); index++)
//        {
//            TextView wordview = new TextView(this);
//            wordview.setText(words.get(index));
//            rootView.addView(wordview);
//        }
 */