package com.example.vehicle;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Hyundai extends AppCompatActivity {
    ListView listview;
    CustomAdapter adapter;
    ArrayList arrayList=new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.marutiactivity);
        listview=findViewById(R.id.listview);

        UserPojo userpojo1 = new UserPojo();
        userpojo1.setImage(R.drawable.verna);
        userpojo1.setCarname("Verna");
        userpojo1.setCarprice("8.80L");
        userpojo1.setMileage("Mileage: \nPetrol 17.4kmpl\nDiesel 24.75kmpl");
        userpojo1.setShowroomprice("Showroom Price:");
        userpojo1.setModelName("Model Name:");
        arrayList.add(userpojo1);

        UserPojo userpojo2 = new UserPojo();
        userpojo2.setCarname("Creta");
        userpojo2.setCarprice("9.60L");
        userpojo2.setImage(R.drawable.creata);
        userpojo2.setMileage("Mileage: \nPetrol 15.29kmpl\nDiesel 21.38kmpl");
        userpojo2.setShowroomprice("Showroom Price:");
        userpojo2.setModelName("Model Name:");
        arrayList.add(userpojo2);

        UserPojo userpojo3 = new UserPojo();
        userpojo3.setCarname("Elantra");
        userpojo3.setCarprice("13.81L");
        userpojo3.setMileage("Mileage: \nPetrol  14.59kmpl\nDiesel  22.54kmpl");
        userpojo3.setShowroomprice("Showroom Price:");
        userpojo3.setModelName("Model Name:");
        userpojo3.setImage(R.drawable.elantra);
        arrayList.add(userpojo3);

        UserPojo userpojo4 = new UserPojo();
        userpojo4.setCarname("Tucson");
        userpojo4.setCarprice("18.74L");
        userpojo4.setMileage("Mileage: \nPetrol  13.3kmpl\nDiesel  18.42kmpl");
        userpojo4.setShowroomprice("Showroom Price:");
        userpojo4.setModelName("Model Name:");
        userpojo4.setImage(R.drawable.tucson);
        arrayList.add(userpojo4);

        UserPojo userpojo5 = new UserPojo();
        userpojo5.setImage(R.drawable.venue);
        userpojo5.setCarname("Venue");
        userpojo5.setCarprice("6.50L");
        userpojo5.setMileage("Mileage: \nPetrol  18.2kmpl\nDiesel  23.7kmpl");
        userpojo5.setShowroomprice("Showroom Price:");
        userpojo5.setModelName("Model Name:");
        arrayList.add(userpojo5);

        UserPojo userpojo6 = new UserPojo();
        userpojo6.setImage(R.drawable.i20active);
        userpojo6.setCarname("i20 Active");
        userpojo6.setCarprice("7.78L");
        userpojo6.setMileage("Mileage: \nPetrol  17.19kmpl\nDiesel  21.19kmpl");
        userpojo6.setShowroomprice("Showroom Price:");
        userpojo6.setModelName("Model Name:");
        arrayList.add(userpojo6);

        UserPojo userpojo7 = new UserPojo();
        userpojo7.setImage(R.drawable.xcent);
        userpojo7.setCarname("Xcent");
        userpojo7.setCarprice("5.73L");
        userpojo7.setMileage("Mileage: \nPetrol  19.1kmpl\nDiesel  24.4kmpl");
        userpojo7.setShowroomprice("Showroom Price:");
        userpojo7.setModelName("Model Name:");
        arrayList.add(userpojo7);

        UserPojo userpojo8 = new UserPojo();
        userpojo8.setImage(R.drawable.grandi10);
        userpojo8.setCarname("Grand i10");
        userpojo8.setCarprice("5L");
        userpojo8.setMileage("Mileage: \nPetrol  19.77kmpl\nDiesel  24.95kmpl");
        userpojo8.setShowroomprice("Showroom Price:");
        userpojo8.setModelName("Model Name:");
        arrayList.add(userpojo8);

        UserPojo userpojo9 = new UserPojo();
        userpojo9.setImage(R.drawable.santro);
        userpojo9.setCarname("Santro");
        userpojo9.setCarprice("3.90L");
        userpojo9.setMileage("Mileage: \nPetrol  20.3kmpl");
        userpojo9.setShowroomprice("Showroom Price:");
        userpojo9.setModelName("Model Name:");
        arrayList.add(userpojo9);

        UserPojo userpojo10 = new UserPojo();
        userpojo10.setImage(R.drawable.eon);
        userpojo10.setCarname("Eon");
        userpojo10.setCarprice("3.37L");
        userpojo10.setMileage("Mileage: \nPetrol  21.1kmpl");
        userpojo10.setShowroomprice("Showroom Price:");
        userpojo10.setModelName("Model Name:");
        arrayList.add(userpojo10);

        UserPojo userpojo11 = new UserPojo();
        userpojo11.setImage(R.drawable.elitei20);
        userpojo11.setCarname("Elite i20");
        userpojo11.setCarprice("5.50L");
        userpojo11.setMileage("Mileage: \nPetrol  19.8kmpl\nDiesel  22.5kmpl");
        userpojo11.setShowroomprice("Showroom Price:");
        userpojo11.setModelName("Model Name:");
        arrayList.add(userpojo11);


        adapter = new CustomAdapter(this,R.layout.listitem,arrayList);
        listview.setAdapter(adapter);
    }
}
