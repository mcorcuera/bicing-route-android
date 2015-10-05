package com.bicing.models;

import com.google.maps.model.LatLng;

/**
 * Created by mikcorlej on 4/10/15.
 */
public class Station {

    public enum Type {
        NORMAL,
        ELECTRIC
    }

    private int id;
    private String name;
    private String address;
    private LatLng location;
    private int bikes;
    private int spots;
    private boolean available;
    private Type type;
}


