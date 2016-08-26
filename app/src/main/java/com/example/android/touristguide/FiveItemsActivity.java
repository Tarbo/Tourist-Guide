package com.example.android.touristguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class FiveItemsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five_items);
    }

    public void onClickPashmina(View view) {
        Intent intent = new Intent(this, PashminaActivity.class);
        if (intent.resolveActivity(getPackageManager()) != null)
            startActivity(intent);
    }

    public void onClickHeadLamp(View view) {
        Intent intent = new Intent(this, HeadLampActivity.class);
        if (intent.resolveActivity(getPackageManager()) != null)
            startActivity(intent);
    }

    public void onClickDryLiteTowel(View view) {
        Intent intent = new Intent(this, DryLiteTowelActivity.class);
        if (intent.resolveActivity(getPackageManager()) != null)
            startActivity(intent);
    }

    public void onClickWaterFilter(View view) {
        Intent intent = new Intent(this, WaterFilter.class);
        if (intent.resolveActivity(getPackageManager()) != null)
            startActivity(intent);
    }

    public void onClickDoorStop(View view) {
        Intent intent = new Intent(this, DoorStop.class);
        if (intent.resolveActivity(getPackageManager()) != null)
            startActivity(intent);
    }

    public void onClickFeedback(View view) {
        Intent intent = new Intent(this, FeedbackActivity.class);
        if (intent.resolveActivity(getPackageManager()) != null)
            startActivity(intent);
    }

}
