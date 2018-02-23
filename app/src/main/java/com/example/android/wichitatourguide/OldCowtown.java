package com.example.android.wichitatourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class OldCowtown extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_old_cowtown);


        // Create Scotch & Sirloin information list and set String to ArrayList slot
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.cowtown), getString(R.string.cowtown_address),
                getString(R.string.cowtown_phone_number), getString(R.string.cowtown_website), R.drawable.cowtown_image));

        LocationAdapter adapter = new LocationAdapter(this, locations);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
