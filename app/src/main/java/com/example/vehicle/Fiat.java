package com.example.vehicle;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Fiat extends AppCompatActivity {
    ListView listview;
    CustomAdapter adapter;
    ArrayList arrayList = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.marutiactivity);
        listview = findViewById(R.id.listview);

        UserPojo userpojo1 = new UserPojo();
        userpojo1.setImage(R.drawable.puntoevo);
        userpojo1.setCarname("Punto Eva");
        userpojo1.setCarprice("4.88L");
        userpojo1.setMileage("Mileage: \nPetrol  15.4kmpl\nDiesel  20kmpl");
        userpojo1.setShowroomprice("Showroom Price:");
        userpojo1.setModelName("Model Name:");
        arrayList.add(userpojo1);

        UserPojo userpojo2 = new UserPojo();
        userpojo2.setCarname("Linea Classic");
        userpojo2.setCarprice("6.58L");
        userpojo2.setImage(R.drawable.lineaclassic);
        userpojo2.setMileage("Mileage: \nPetrol  14.9kmpl");
        userpojo2.setShowroomprice("Showroom Price:");
        userpojo2.setModelName("Model Name:");
        arrayList.add(userpojo2);

        UserPojo userpojo3 = new UserPojo();
        userpojo3.setCarname("Urban Cross");
        userpojo3.setCarprice("6.84L");
        userpojo3.setMileage("Mileage: \nPetrol  17.1kmpl\nDiesel  20kmpl");
        userpojo3.setShowroomprice("Showroom Price:");
        userpojo3.setModelName("Model Name:");
        userpojo3.setImage(R.drawable.urbancross);
        arrayList.add(userpojo3);

        UserPojo userpojo4 = new UserPojo();
        userpojo4.setCarname("Avventura");
        userpojo4.setCarprice("7.18L");
        userpojo4.setMileage("Mileage: \nPetrol  17.1kmpl\nDiesel  20.5kmpl");
        userpojo4.setShowroomprice("Showroom Price:");
        userpojo4.setModelName("Model Name:");
        userpojo4.setImage(R.drawable.avventura);
        arrayList.add(userpojo4);

        UserPojo userpojo5 = new UserPojo();
        userpojo5.setImage(R.drawable.linea);
        userpojo5.setCarname("Linea");
        userpojo5.setCarprice("7.19L");
        userpojo5.setMileage("Mileage: \nPetrol  14.55kmpl\nDiesel  20.4kmpl");
        userpojo5.setShowroomprice("Showroom Price:");
        userpojo5.setModelName("Model Name:");
        arrayList.add(userpojo5);

        UserPojo userpojo6 = new UserPojo();
        userpojo6.setImage(R.drawable.abarthpunto);
        userpojo6.setCarname("Abarth Punto");
        userpojo6.setCarprice("9.74L");
        userpojo6.setMileage("Mileage: \nPetrol  16.3kmpl");
        userpojo6.setShowroomprice("Showroom Price:");
        userpojo6.setModelName("Model Name:");
        arrayList.add(userpojo6);


        adapter = new CustomAdapter(this, R.layout.listitem, arrayList);
        listview.setAdapter(adapter);
    }
}
