package com.example.android.touristguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RatingBar;

public class FeedbackActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
    }

    /*
    * The function starts an email app
    * @params, only view is the parameter
    * @returns, it returns no variables
     */
    public void sendEmail(View view) {
        EditText name = (EditText) findViewById(R.id.name_edittext);
        EditText emailBody = (EditText) findViewById(R.id.message_body_edittext);
        RatingBar ratingBar = (RatingBar) findViewById(R.id.rating);
        float rating = ratingBar.getRating();
        Intent sendEmail = new Intent(Intent.ACTION_SENDTO);
        sendEmail.setData(Uri.parse("mailto:")); // only email apps can handle this
        sendEmail.putExtra(Intent.EXTRA_EMAIL, new String[]{getString(R.string.email_address)});
        sendEmail.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.feedback_email_subject) + " " + name.getText().toString());
        sendEmail.putExtra(Intent.EXTRA_TEXT, "Thank you for rating our app: " + rating + "\n" + emailBody.getText().toString());
        if (sendEmail.resolveActivity(getPackageManager()) != null) {
            startActivity(sendEmail);
        }

    }
}
