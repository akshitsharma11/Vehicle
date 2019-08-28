package com.example.vehicle;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Skoda extends AppCompatActivity {
    ListView listview;
    CustomAdapter adapter;
    ArrayList arrayList = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.marutiactivity);
        listview = findViewById(R.id.listview);

        UserPojo userpojo1 = new UserPojo();
        userpojo1.setImage(R.drawable.rapid);
        userpojo1.setCarname("Rapid");
        userpojo1.setCarprice("8L");
        userpojo1.setMileage("Mileage: \nPetrol  15.41kmpl\nDiesel  21.13kmpl");
        userpojo1.setShowroomprice("Showroom Price:");
        userpojo1.setModelName("Model Name:");
        arrayList.add(userpojo1);

        UserPojo userpojo2 = new UserPojo();
        userpojo2.setCarname("Octavia");
        userpojo2.setCarprice("15.99L");
        userpojo2.setImage(R.drawable.octavia);
        userpojo2.setMileage("Mileage: \nPetrol  16.7kmpl\nDiesel  21kmpl");
        userpojo2.setShowroomprice("Showroom Price:");
        userpojo2.setModelName("Model Name:");
        arrayList.add(userpojo2);

        UserPojo userpojo3 = new UserPojo();
        userpojo3.setCarname("Superb");
        userpojo3.setCarprice("25.98L");
        userpojo3.setMileage("Mileage: \nPetrol  14.12kmpl\nDiesel  18.35kmpl");
        userpojo3.setShowroomprice("Showroom Price:");
        userpojo3.setModelName("Model Name:");
        userpojo3.setImage(R.drawable.superb);
        arrayList.add(userpojo3);

        UserPojo userpojo4 = new UserPojo();
        userpojo4.setCarname("Kodiaq");
        userpojo4.setCarprice("7.82L");
        userpojo4.setMileage("Mileage: \nDiesel  16.25kmpl");
        userpojo4.setShowroomprice("Showroom Price:");
        userpojo4.setModelName("Model Name:");
        userpojo4.setImage(R.drawable.kodiaq);
        arrayList.add(userpojo4);


        adapter = new CustomAdapter(this, R.layout.listitem, arrayList);
        listview.setAdapter(adapter);
    }
}
