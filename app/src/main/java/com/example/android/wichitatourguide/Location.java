package com.example.android.wichitatourguide;

/**
 * Created by jermainegoins on 7/20/17.
 */

public class Location {


    // Set Image resource ID to -1 when an image is not necessary
    private static final int NO_IMAGE_PROVIDED = -1;
    // Facility name
    private String mFacilityName;
    // Address of facility
    private String mAddress;
    // Phone of facility
    private String mPhoneNumber;
    // Web address
    private String mWebsite;
    // Image resource ID for the word
    private int mImageResourceID = NO_IMAGE_PROVIDED;



    /*
        Create a new Location object

        @param mFacilityName is the provided name for the facility inputted

        @param mAddress is the address associated with the facility

        @param imageResourceId is the drawable resource ID for the image asset

     */

    public Location(String mFacilityName, int mImageResourceID) {
        this.mFacilityName = mFacilityName;
        this.mImageResourceID = mImageResourceID;
    }

    public Location(String mFacilityName, String mAddress, String mPhoneNumber, String mWebsite, int mImageResourceID) {
        this.mFacilityName = mFacilityName;
        this.mAddress = mAddress;
        this.mPhoneNumber = mPhoneNumber;
        this.mWebsite = mWebsite;
        this.mImageResourceID = mImageResourceID;
    }

    // Facility name provided
    public String getmFacilityName() {

        return mFacilityName;
    }

    // Address provided by facility
    public String getmAddress() {
        return mAddress;
    }

    // Phone number provided by the facility
    public String getmPhoneNumber() {
        return mPhoneNumber;
    }

    // Website associated with facility
    public String getmWebsite() {
        return mWebsite;
    }

    // Image resource ID for the facility
    public int getImageResourceID() {

        return mImageResourceID;
    }

    // Imagine resource ID for the word
    public boolean hasImage() {
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }
}


