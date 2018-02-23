package com.example.android.wichitatourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class Sights extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sights);


        // Find the View that shows the Indian Center category
        ImageButton indianCenterImage = (ImageButton) findViewById(R.id.indianCenter);

        // Set a click listener on the View
        indianCenterImage.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the Indian Center view is clicked on.
            @Override
            public void onClick(View view) {
                Intent indianCenterIntent = new Intent(Sights.this, IndianCenter.class);
                startActivity(indianCenterIntent);
            }
        });

        // Find the View that shows the Old Cowtown category
        ImageButton oldCowtownImage = (ImageButton) findViewById(R.id.oldCowtown);

        // Set a click listener on the View
        oldCowtownImage.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the Old Cowtown view is clicked on.
            @Override
            public void onClick(View view) {
                Intent oldCowtownIntent = new Intent(Sights.this, OldCowtown.class);
                startActivity(oldCowtownIntent);
            }
        });
    }
}
