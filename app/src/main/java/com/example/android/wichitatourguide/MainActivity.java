package com.example.android.wichitatourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the Restaurant category
        ImageButton restaurantImage = (ImageButton) findViewById(R.id.restaurant);

        // Set a click listener on the View
        restaurantImage.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the restaurant view is clicked on.
            @Override
            public void onClick(View view) {
                Intent restaurantIntent = new Intent(MainActivity.this, Restaurants.class);
                startActivity(restaurantIntent);
            }
        });

        // Find the View that shows the Sights category
        ImageButton sightsImage = (ImageButton) findViewById(R.id.sights);

        // Set a click listener on the View
        sightsImage.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the sights view is clicked on.
            @Override
            public void onClick(View view) {
                Intent sightsIntent = new Intent(MainActivity.this, Sights.class);
                startActivity(sightsIntent);
            }
        });
    }

}
