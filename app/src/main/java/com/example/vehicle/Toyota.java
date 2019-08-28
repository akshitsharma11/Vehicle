package com.example.vehicle;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Toyota extends AppCompatActivity {
    ListView listview;
    CustomAdapter adapter;
    ArrayList arrayList = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.marutiactivity);
        listview = findViewById(R.id.listview);

        UserPojo userpojo1 = new UserPojo();
        userpojo1.setImage(R.drawable.etios);
        userpojo1.setCarname("Etios Liva");
        userpojo1.setCarprice("6.62L");
        userpojo1.setMileage("Mileage: \nPetrol  18.16kmpl\nDiesel  23.59kmpl");
        userpojo1.setShowroomprice("Showroom Price:");
        userpojo1.setModelName("Model Name:");
        arrayList.add(userpojo1);

        UserPojo userpojo2 = new UserPojo();
        userpojo2.setCarname("Platinum Etios");
        userpojo2.setCarprice("7.04L");
        userpojo2.setImage(R.drawable.platinumetios);
        userpojo2.setMileage("Mileage: \nPetrol  16.78kmpl\nDiesel  23.59kmpl");
        userpojo2.setShowroomprice("Showroom Price:");
        userpojo2.setModelName("Model Name:");
        arrayList.add(userpojo2);

        UserPojo userpojo3 = new UserPojo();
        userpojo3.setCarname("Yaris");
        userpojo3.setCarprice("9.26L");
        userpojo3.setMileage("Mileage: \nPetrol  17.1kmpl");
        userpojo3.setShowroomprice("Showroom Price:");
        userpojo3.setModelName("Model Name:");
        userpojo3.setImage(R.drawable.yaris);
        arrayList.add(userpojo3);

        UserPojo userpojo4 = new UserPojo();
        userpojo4.setCarname("Innova Crysta");
        userpojo4.setCarprice("14.83L");
        userpojo4.setMileage("Mileage: \nPetrol  11.25kmpl\nDiesel  15.1kmpl");
        userpojo4.setShowroomprice("Showroom Price:");
        userpojo4.setModelName("Model Name:");
        userpojo4.setImage(R.drawable.innova);
        arrayList.add(userpojo4);

        UserPojo userpojo5 = new UserPojo();
        userpojo5.setImage(R.drawable.corollaatlis);
        userpojo5.setCarname("Corolla Altis");
        userpojo5.setCarprice("16.45L");
        userpojo5.setMileage("Mileage: \nPetrol  16.7kmpl\nDiesel  21.3kmpl");
        userpojo5.setShowroomprice("Showroom Price:");
        userpojo5.setModelName("Model Name:");
        arrayList.add(userpojo5);

        UserPojo userpojo6 = new UserPojo();
        userpojo6.setImage(R.drawable.fortuner);
        userpojo6.setCarname("Fortuner");
        userpojo6.setCarprice("27.55L");
        userpojo6.setMileage("Mileage: \nPetrol  10.01kmpl\nDiesel  14.24kmpl");
        userpojo6.setShowroomprice("Showroom Price:");
        userpojo6.setModelName("Model Name:");
        arrayList.add(userpojo6);

        UserPojo userpojo7 = new UserPojo();
        userpojo7.setImage(R.drawable.camry);
        userpojo7.setCarname("Camry");
        userpojo7.setCarprice("36.95L");
        userpojo7.setMileage("Mileage: \nPetrol  19.16kmpl");
        userpojo7.setShowroomprice("Showroom Price:");
        userpojo7.setModelName("Model Name:");
        arrayList.add(userpojo7);

        UserPojo userpojo8 = new UserPojo();
        userpojo8.setImage(R.drawable.landprado);
        userpojo8.setCarname("Land Cruiser Prado");
        userpojo8.setCarprice("96.18L");
        userpojo8.setMileage("Mileage: \nDiesel  11.13kmpl");
        userpojo8.setShowroomprice("Showroom Price:");
        userpojo8.setModelName("Model Name:");
        arrayList.add(userpojo8);

        UserPojo userpojo9 = new UserPojo();
        userpojo9.setImage(R.drawable.landcruiser);
        userpojo9.setCarname("Land Cruiser");
        userpojo9.setCarprice("1.47Cr");
        userpojo9.setMileage("Mileage: \nDiesel  11kmpl");
        userpojo9.setShowroomprice("Showroom Price:");
        userpojo9.setModelName("Model Name:");
        arrayList.add(userpojo9);

        UserPojo userpojo10 = new UserPojo();
        userpojo10.setImage(R.drawable.glanza);
        userpojo10.setCarname("Glanza");
        userpojo10.setCarprice("7.28L");
        userpojo10.setMileage("Mileage: \nPetrol  22.44kmpl");
        userpojo10.setShowroomprice("Showroom Price:");
        userpojo10.setModelName("Model Name:");
        arrayList.add(userpojo10);

        UserPojo userpojo11 = new UserPojo();
        userpojo11.setImage(R.drawable.prius);
        userpojo11.setCarname("Prius");
        userpojo11.setCarprice("45.27L");
        userpojo11.setMileage("Mileage: \nPetrol  23.91kmpl");
        userpojo11.setShowroomprice("Showroom Price:");
        userpojo11.setModelName("Model Name:");
        arrayList.add(userpojo11);


        adapter = new CustomAdapter(this, R.layout.listitem, arrayList);
        listview.setAdapter(adapter);
    }
}