package com.example.vehicle;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Volkswagen extends AppCompatActivity {
    ListView listview;
    CustomAdapter adapter;
    ArrayList arrayList = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.marutiactivity);
        listview = findViewById(R.id.listview);

        UserPojo userpojo1 = new UserPojo();
        userpojo1.setImage(R.drawable.polo);
        userpojo1.setCarname("Polo");
        userpojo1.setCarprice("5.75L");
        userpojo1.setMileage("Mileage: \nPetrol  18.78kmpl\nDiesel  20.59kmpl");
        userpojo1.setShowroomprice("Showroom Price:");
        userpojo1.setModelName("Model Name:");
        arrayList.add(userpojo1);

        UserPojo userpojo2 = new UserPojo();
        userpojo2.setCarname("Ameo");
        userpojo2.setCarprice("5.87L");
        userpojo2.setImage(R.drawable.ameo);
        userpojo2.setMileage("Mileage: \nPetrol  19.44kmpl\nDiesel  21.66kmpl");
        userpojo2.setShowroomprice("Showroom Price:");
        userpojo2.setModelName("Model Name:");
        arrayList.add(userpojo2);

        UserPojo userpojo3 = new UserPojo();
        userpojo3.setCarname("Vento");
        userpojo3.setCarprice("8.68L");
        userpojo3.setMileage("Mileage: \nPetrol  16.29kmpl\nDiesel  22.27kmpl");
        userpojo3.setShowroomprice("Showroom Price:");
        userpojo3.setModelName("Model Name:");
        userpojo3.setImage(R.drawable.vento);
        arrayList.add(userpojo3);

        UserPojo userpojo4 = new UserPojo();
        userpojo4.setCarname("GTI");
        userpojo4.setCarprice("20L");
        userpojo4.setMileage("Mileage: \nPetrol  16.34kmpl");
        userpojo4.setShowroomprice("Showroom Price:");
        userpojo4.setModelName("Model Name:");
        userpojo4.setImage(R.drawable.gti);
        arrayList.add(userpojo4);

        UserPojo userpojo5 = new UserPojo();
        userpojo5.setImage(R.drawable.passat);
        userpojo5.setCarname("Passat");
        userpojo5.setCarprice("25.99L");
        userpojo5.setMileage("Mileage: \nDiesel  17.42kmpl");
        userpojo5.setShowroomprice("Showroom Price:");
        userpojo5.setModelName("Model Name:");
        arrayList.add(userpojo5);

        UserPojo userpojo6 = new UserPojo();
        userpojo6.setImage(R.drawable.tiguan);
        userpojo6.setCarname("Tiguan");
        userpojo6.setCarprice("28.06L");
        userpojo6.setMileage("Mileage: \nDiesel  17.06kmpl");
        userpojo6.setShowroomprice("Showroom Price:");
        userpojo6.setModelName("Model Name:");
        arrayList.add(userpojo6);

        adapter = new CustomAdapter(this, R.layout.listitem, arrayList);
        listview.setAdapter(adapter);
    }
}