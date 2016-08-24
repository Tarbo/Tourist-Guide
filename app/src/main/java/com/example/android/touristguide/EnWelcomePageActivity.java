package com.example.android.touristguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class EnWelcomePageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_en_welcome_page);
    }

    public void onNextButtonClicked(View view) {
        Intent intent = new Intent(this, FiveItemsActivity.class);
        startActivity(intent);

    }
}
