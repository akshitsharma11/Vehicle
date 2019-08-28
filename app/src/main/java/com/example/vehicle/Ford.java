package com.example.vehicle;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Ford extends AppCompatActivity {
    ListView listview;
    CustomAdapter adapter;
    ArrayList arrayList = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.marutiactivity);
        listview = findViewById(R.id.listview);

        UserPojo userpojo1 = new UserPojo();
        userpojo1.setImage(R.drawable.freestyle);
        userpojo1.setCarname("Freestyle");
        userpojo1.setCarprice("5.43L");
        userpojo1.setMileage("Mileage: \nPetrol  19kmpl\nDiesel  24.4kmpl");
        userpojo1.setShowroomprice("Showroom Price:");
        userpojo1.setModelName("Model Name:");
        arrayList.add(userpojo1);

        UserPojo userpojo2 = new UserPojo();
        userpojo2.setCarname("Aspire");
        userpojo2.setCarprice("5.55L");
        userpojo2.setImage(R.drawable.aspire);
        userpojo2.setMileage("Mileage: \nPetrol  20kmpl\nDiesel  26.1kmpl");
        userpojo2.setShowroomprice("Showroom Price:");
        userpojo2.setModelName("Model Name:");
        arrayList.add(userpojo2);

        UserPojo userpojo3 = new UserPojo();
        userpojo3.setCarname("Figo");
        userpojo3.setCarprice("5.82L");
        userpojo3.setMileage("Mileage: \nPetrol  18.15kmpl\nDiesel  25.64kmpl");
        userpojo3.setShowroomprice("Showroom Price:");
        userpojo3.setModelName("Model Name:");
        userpojo3.setImage(R.drawable.figo);
        arrayList.add(userpojo3);

        UserPojo userpojo4 = new UserPojo();
        userpojo4.setCarname("EcoSport");
        userpojo4.setCarprice("7.82L");
        userpojo4.setMileage("Mileage: \nPetrol  18.1kmpl\nDiesel  23kmpl");
        userpojo4.setShowroomprice("Showroom Price:");
        userpojo4.setModelName("Model Name:");
        userpojo4.setImage(R.drawable.ecosprt);
        arrayList.add(userpojo4);

        UserPojo userpojo5 = new UserPojo();
        userpojo5.setImage(R.drawable.endevaour);
        userpojo5.setCarname("Endevaour");
        userpojo5.setCarprice("28.19L");
        userpojo5.setMileage("Mileage: \nDiesel  12.62kmpl");
        userpojo5.setShowroomprice("Showroom Price:");
        userpojo5.setModelName("Model Name:");
        arrayList.add(userpojo5);

        adapter = new CustomAdapter(this, R.layout.listitem, arrayList);
        listview.setAdapter(adapter);
    }
}