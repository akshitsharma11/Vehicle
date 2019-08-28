package com.example.vehicle;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MercedesBenz extends AppCompatActivity {
    ListView listview;
    CustomAdapter adapter;
    ArrayList arrayList = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.marutiactivity);
        listview = findViewById(R.id.listview);

        UserPojo userpojo1 = new UserPojo();
        userpojo1.setImage(R.drawable.gla);
        userpojo1.setCarname("GLA");
        userpojo1.setCarprice("32.33L");
        userpojo1.setMileage("Mileage: \nPetrol  13.7kmpl\nDiesel  17.9kmpl");
        userpojo1.setShowroomprice("Showroom Price:");
        userpojo1.setModelName("Model Name:");
        arrayList.add(userpojo1);

        UserPojo userpojo2 = new UserPojo();
        userpojo2.setCarname("A-Class");
        userpojo2.setCarprice("27.83L");
        userpojo2.setImage(R.drawable.aclass);
        userpojo2.setMileage("Mileage: \nPetrol  15.5kmpl\nDiesel  18.5kmpl");
        userpojo2.setShowroomprice("Showroom Price:");
        userpojo2.setModelName("Model Name:");
        arrayList.add(userpojo2);

        UserPojo userpojo3 = new UserPojo();
        userpojo3.setCarname("B-Class");
        userpojo3.setCarprice("29.87L");
        userpojo3.setMileage("Mileage: \nPetrol  14.8kmpl");
        userpojo3.setShowroomprice("Showroom Price:");
        userpojo3.setModelName("Model Name:");
        userpojo3.setImage(R.drawable.bclass);
        arrayList.add(userpojo3);

        UserPojo userpojo4 = new UserPojo();
        userpojo4.setCarname("CLA");
        userpojo4.setCarprice("31.72L");
        userpojo4.setMileage("Mileage: \nPetrol  15.04kmpl\nDiesel  17.9kmpl");
        userpojo4.setShowroomprice("Showroom Price:");
        userpojo4.setModelName("Model Name:");
        userpojo4.setImage(R.drawable.cla);
        arrayList.add(userpojo4);

        UserPojo userpojo5 = new UserPojo();
        userpojo5.setImage(R.drawable.cclass);
        userpojo5.setCarname("C-Class");
        userpojo5.setCarprice("40.02L");
        userpojo5.setMileage("Mileage: \nDiesel  12.06kmpl");
        userpojo5.setShowroomprice("Showroom Price:");
        userpojo5.setModelName("Model Name:");
        arrayList.add(userpojo5);

        UserPojo userpojo6 = new UserPojo();
        userpojo6.setImage(R.drawable.glc);
        userpojo6.setCarname("GLC");
        userpojo6.setCarprice("50.41L");
        userpojo6.setMileage("Mileage: \nPetrol  11.5kmpl\nDiesel  17.9kmpl");
        userpojo6.setShowroomprice("Showroom Price:");
        userpojo6.setModelName("Model Name:");
        arrayList.add(userpojo6);

        UserPojo userpojo7 = new UserPojo();
        userpojo7.setImage(R.drawable.cclasscabriolet);
        userpojo7.setCarname("C-Class Cabriolet");
        userpojo7.setCarprice("65.25L");
        userpojo7.setMileage("Mileage: \nPetrol  19.2kmpl\nDiesel  12.1kmpl");
        userpojo7.setShowroomprice("Showroom Price:");
        userpojo7.setModelName("Model Name:");
        arrayList.add(userpojo7);

        UserPojo userpojo8 = new UserPojo();
        userpojo8.setImage(R.drawable.gle);
        userpojo8.setCarname("GLE");
        userpojo8.setCarprice("66.55L");
        userpojo8.setMileage("Mileage: \nPetrol  9.7kmpl\nDiesel  17.9kmpl");
        userpojo8.setShowroomprice("Showroom Price:");
        userpojo8.setModelName("Model Name:");
        arrayList.add(userpojo8);

        UserPojo userpojo9 = new UserPojo();
        userpojo9.setImage(R.drawable.eclassallterrain);
        userpojo9.setCarname("E-Class All Terrain");
        userpojo9.setCarprice("75L");
        userpojo9.setMileage("Mileage: \nDiesel  12.06kmpl");
        userpojo9.setShowroomprice("Showroom Price:");
        userpojo9.setModelName("Model Name:");
        arrayList.add(userpojo9);

        UserPojo userpojo10 = new UserPojo();
        userpojo10.setImage(R.drawable.sclass);
        userpojo10.setCarname("S-Class");
        userpojo10.setCarprice("1.33Cr");
        userpojo10.setMileage("Mileage: \nPetrol  7.81kmpl\nDiesel  13.5kmpl");
        userpojo10.setShowroomprice("Showroom Price:");
        userpojo10.setModelName("Model Name:");
        arrayList.add(userpojo10);

        UserPojo userpojo11 = new UserPojo();
        userpojo11.setImage(R.drawable.gclass);
        userpojo11.setCarname("G-Class");
        userpojo11.setCarprice("2.19Cr");
        userpojo11.setMileage("Mileage: \nPetrol  8kmpl");
        userpojo11.setShowroomprice("Showroom Price:");
        userpojo11.setModelName("Model Name:");
        arrayList.add(userpojo11);

        UserPojo userpojo12 = new UserPojo();
        userpojo12.setImage(R.drawable.cclasscoupe);
        userpojo12.setCarname("C-Coupe");
        userpojo12.setCarprice("75L");
        userpojo12.setMileage("Mileage: \nPetrol  14.49kmpl");
        userpojo12.setShowroomprice("Showroom Price:");
        userpojo12.setModelName("Model Name:");
        arrayList.add(userpojo12);


        adapter = new CustomAdapter(this, R.layout.listitem, arrayList);
        listview.setAdapter(adapter);
    }
}
