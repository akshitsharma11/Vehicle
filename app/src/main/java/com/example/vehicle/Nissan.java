package com.example.vehicle;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Nissan extends AppCompatActivity {
    ListView listview;
    CustomAdapter adapter;
    ArrayList arrayList = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.marutiactivity);
        listview = findViewById(R.id.listview);

        UserPojo userpojo1 = new UserPojo();
        userpojo1.setImage(R.drawable.micraactive);
        userpojo1.setCarname("Micra Active");
        userpojo1.setCarprice("5.25L");
        userpojo1.setMileage("Mileage: \nPetrol  19.21kmpl");
        userpojo1.setShowroomprice("Showroom Price:");
        userpojo1.setModelName("Model Name:");
        arrayList.add(userpojo1);

        UserPojo userpojo2 = new UserPojo();
        userpojo2.setCarname("Micra");
        userpojo2.setCarprice("6.63L");
        userpojo2.setImage(R.drawable.micra);
        userpojo2.setMileage("Mileage: \nPetrol  19.15kmpl\nDiesel  23.19kmpl");
        userpojo2.setShowroomprice("Showroom Price:");
        userpojo2.setModelName("Model Name:");
        arrayList.add(userpojo2);

        UserPojo userpojo3 = new UserPojo();
        userpojo3.setCarname("Sunny");
        userpojo3.setCarprice("6.99L");
        userpojo3.setMileage("Mileage: \nPetrol  16.95kmpl\nDiesel  22.71kmpl");
        userpojo3.setShowroomprice("Showroom Price:");
        userpojo3.setModelName("Model Name:");
        userpojo3.setImage(R.drawable.sunny);
        arrayList.add(userpojo3);

        UserPojo userpojo4 = new UserPojo();
        userpojo4.setCarname("Kicks");
        userpojo4.setCarprice("9.55L");
        userpojo4.setMileage("Mileage: \nPetrol  14.23kmpl\nDiesel  19.66kmpl");
        userpojo4.setShowroomprice("Showroom Price:");
        userpojo4.setModelName("Model Name:");
        userpojo4.setImage(R.drawable.kicks);
        arrayList.add(userpojo4);

        UserPojo userpojo5 = new UserPojo();
        userpojo5.setImage(R.drawable.terrano);
        userpojo5.setCarname("Terrano");
        userpojo5.setCarprice("10L");
        userpojo5.setMileage("Mileage: \nPetrol  13.2kmpl\nDiesel  19.8kmpl");
        userpojo5.setShowroomprice("Showroom Price:");
        userpojo5.setModelName("Model Name:");
        arrayList.add(userpojo5);

        UserPojo userpojo6 = new UserPojo();
        userpojo6.setImage(R.drawable.nisaangtr);
        userpojo6.setCarname("GT-R");
        userpojo6.setCarprice("2.12Cr");
        userpojo6.setMileage("Mileage: \nPetrol  9.0kmpl");
        userpojo6.setShowroomprice("Showroom Price:");
        userpojo6.setModelName("Model Name:");
        arrayList.add(userpojo6);

        adapter = new CustomAdapter(this, R.layout.listitem, arrayList);
        listview.setAdapter(adapter);
    }
    }
