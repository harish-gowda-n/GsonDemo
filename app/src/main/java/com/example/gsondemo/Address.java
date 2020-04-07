package com.example.gsondemo;

import com.google.gson.annotations.SerializedName;

public class Address {
    private String city, state;
    @SerializedName("postalCode")
    private int pincode;
    Address(String city, String state, int pincode){
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }
}
