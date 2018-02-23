package com.example.android.wichitatourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by jermainegoins on 7/20/17.
 */

public class LocationAdapter extends ArrayAdapter<Location> {

    // Reference ID for background color for this list of words
    private int mColorReferenceID;

    public LocationAdapter(Context context, ArrayList<Location> locations) {
        super(context, 0, locations);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the object located at this position in the list
        Location currentLocation = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView facilityTextView = (TextView) listItemView.findViewById(R.id.facility_name_text_view);

        // Get the version name from the current Facility object and
        // set this text on the name TextView
        facilityTextView.setText(currentLocation.getmFacilityName());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address_text_view);

        // Get the version number from the current Address object and
        // set this text on the number TextView
        addressTextView.setText(currentLocation.getmAddress());

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView phoneNumberTextView = (TextView) listItemView.findViewById(R.id.phone_number_text_view);

        // Get the version name from the current object and
        // set this text on the name TextView
        phoneNumberTextView.setText(currentLocation.getmPhoneNumber());

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView websiteTextView = (TextView) listItemView.findViewById(R.id.website_text_view);

        // Get the version name from the current object and
        // set this text on the name TextView
        websiteTextView.setText(currentLocation.getmWebsite());

        // Find the ImageView in the list_item.xml layout with the ID version_image
        ImageView defaultImageView = (ImageView) listItemView.findViewById(R.id.picture_image_view);

        // Verifies if currentLocation has an image in it.
        if (currentLocation.hasImage()) {

            // Get the version image from the current object and
            // set this image on the image ImageView
            defaultImageView.setImageResource(currentLocation.getImageResourceID());

            //Make sure image is VISIBLE
            defaultImageView.setVisibility(View.VISIBLE);

            // Return the whole list item layout (containing 2 TextViews and an ImageView) so that it can be shown in the ListView

        } else {
            // Removes the ImageView
            defaultImageView.setVisibility(View.GONE);
        }

        // Return the whole list layout so that it can be shown in the ListView (includes 2 TextViews)
        return listItemView;
    }
}

