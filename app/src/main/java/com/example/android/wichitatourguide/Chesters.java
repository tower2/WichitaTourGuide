package com.example.android.wichitatourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Chesters extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chesters);

        // Create Chester's information list and set String to ArrayList slot
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.chestera), getString(R.string.chesters_address),
                getString(R.string.chesters_phone_number), getString(R.string.chesters_website), R.drawable.chesters_interior));

        LocationAdapter adapter = new LocationAdapter(this, locations);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);


    }

}
