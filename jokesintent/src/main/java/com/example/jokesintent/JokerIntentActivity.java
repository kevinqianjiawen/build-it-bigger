package com.example.jokesintent;

import android.os.Bundle;
import android.provider.DocumentsContract;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

/**
 * Created by painter on 1/1/17.
 */

public class JokerIntentActivity extends AppCompatActivity{
    public static final String EXTRA_JOKE = "Extra_Joke";


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.joke_intent_activity);

        if (getIntent() != null && getIntent().hasExtra(EXTRA_JOKE)) {
            TextView jokeTextView = (TextView) findViewById(R.id.text_view_joke);
            jokeTextView.setText(getIntent().getStringExtra(EXTRA_JOKE));
        }

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case (android.R.id.home):
            default:
                onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}
