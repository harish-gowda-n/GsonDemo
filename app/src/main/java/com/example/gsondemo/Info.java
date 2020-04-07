package com.example.gsondemo;

import com.google.gson.annotations.SerializedName;

public class Info {
    private String firstName, lastName;
    private boolean isWorking;
    @SerializedName("years")
    private int experience;
    private Address address;
    private PhoneNos phoneNos[];
    Info(String firstName, String lastName, boolean isWorking, int experience, Address address,PhoneNos phoneNos[]){
        this.firstName = firstName;
        this.lastName = lastName;
        this.isWorking = isWorking;
        this.experience = experience;
        this.address = address;
        this.phoneNos = phoneNos;
    }
}
