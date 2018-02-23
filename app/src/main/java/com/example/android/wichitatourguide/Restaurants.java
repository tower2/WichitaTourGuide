package com.example.android.wichitatourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class Restaurants extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);

        // Find the View that shows the Chester's category
        ImageButton chestersImage = (ImageButton) findViewById(R.id.chesters);

        // Set a click listener on the View
        chestersImage.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the restaurant view is clicked on.
            @Override
            public void onClick(View view) {
                Intent chestersIntent = new Intent(Restaurants.this, Chesters.class);
                startActivity(chestersIntent);
            }
        });

        // Find the View that shows the Scotch & Sirloin category
        ImageButton scotchSirloinImage = (ImageButton) findViewById(R.id.scotchSirloin);

        // Set a click listener on the View
        scotchSirloinImage.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the sights view is clicked on.
            @Override
            public void onClick(View view) {
                Intent scotchSirloinIntent = new Intent(Restaurants.this, ScotchSirloin.class);
                startActivity(scotchSirloinIntent);
            }
        });
    }
}
