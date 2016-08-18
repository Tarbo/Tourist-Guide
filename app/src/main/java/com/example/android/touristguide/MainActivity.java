package com.example.android.touristguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
    * Checks which radio button is checked
    * and selects appropriate layout
    * @paramaters, takes only View parameter
    * @returns, returns nothing as its declared void
     */
    public void onRadioButtonClicked(View view) {
        // Is the button now checked
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was checked
        switch (view.getId()) {
            case R.id.en_radio_button:
                if (checked) {
                    Intent intent = new Intent(this, EnWelcomePageActivity.class);
                    startActivity(intent);
                    break;
                }
            case R.id.fr_radio_button:
                if (checked) {
                    // Displays welcome page in french
                    Intent intent = new Intent(this, FrWelcomePageActivity.class);
                    startActivity(intent);
                    break;
                }
        }
    }
}
