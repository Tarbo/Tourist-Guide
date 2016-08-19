package com.example.android.touristguide;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class WaterFilter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water_filter);
    }

    /*
    * This function handles the details button
    * @params, take View as the only paramter
    * @returns, returns nothing
     */
    public void onClickWaterFilterDetails(View view) {
        Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
        String searchWaterFilter = getString(R.string.search_water_filter);
        intent.putExtra(SearchManager.QUERY, searchWaterFilter);
        startActivity(intent);
    }

    /*
    * Responds to next button click and fires up the next activity
     */
    public void onNextButtonClicked(View view) {
        Intent intent = new Intent(this, DoorStop.class);
        startActivity(intent);
    }
}
