package com.example.gsondemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Gson g = new Gson();
        Address address = new Address("Bengaluru", "Karnataka", 560057);
        PhoneNos phoneNos[] = new PhoneNos[2];
        PhoneNos p1 = new PhoneNos("reception", "64-344-123");
        PhoneNos p2 = new PhoneNos("office", "123-456-78");
        phoneNos[0] = p1;
        phoneNos[1] = p2;
        Info in = new Info("Jain", "Fet", false, 15, address, phoneNos);
        String out = g.toJson(in);
    }
}
