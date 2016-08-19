package com.example.android.touristguide;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class DoorStop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_door_stop);
    }

    /*
    * This function handles the details button
    * @params, take View as the only paramter
    * @returns, returns nothing
     */
    public void onClickDoorStopDetails(View view) {
        Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
        String searchDoorStop = getString(R.string.search_door_stop);
        intent.putExtra(SearchManager.QUERY, searchDoorStop);
        startActivity(intent);
    }

    /*
    * Responds to next button click and fires up the next activity
     */
    public void onNextButtonClicked(View view) {
        Intent intent = new Intent(this, WaterFilter.class);
        startActivity(intent);
    }
}
