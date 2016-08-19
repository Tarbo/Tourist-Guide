package com.example.android.touristguide;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class HeadLampActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_head_lamp);
    }

    /*
    * This function handles the details button
    * @params, take View as the only paramter
    * @returns, returns nothing
     */
    public void onClickHeadLampDetails(View view) {
        Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
        String searchHeadLamp = getString(R.string.search_headlamp);
        intent.putExtra(SearchManager.QUERY, searchHeadLamp);
        startActivity(intent);
    }

    /*
    * Responds to next button click and fires up the next activity
     */
    public void onNextButtonClicked(View view) {
        Intent intent = new Intent(this, DryLiteTowelActivity.class);
        startActivity(intent);
    }
}
