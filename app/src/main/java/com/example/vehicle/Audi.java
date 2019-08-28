package com.example.vehicle;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Audi extends AppCompatActivity {
    ListView listview;
    CustomAdapter adapter;
    ArrayList arrayList = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.marutiactivity);
        listview = findViewById(R.id.listview);

        UserPojo userpojo1 = new UserPojo();
        userpojo1.setImage(R.drawable.a3);
        userpojo1.setCarname("A3");
        userpojo1.setCarprice("33.10L");
        userpojo1.setMileage("Mileage: \nDiesel  20.37kmpl");
        userpojo1.setShowroomprice("Showroom Price:");
        userpojo1.setModelName("Model Name:");
        arrayList.add(userpojo1);

        UserPojo userpojo2 = new UserPojo();
        userpojo2.setCarname("Q3");
        userpojo2.setCarprice("34.73L");
        userpojo2.setImage(R.drawable.q3);
        userpojo2.setMileage("Mileage: \nPetrol  16.9kmpl\nDiesel  16.28kmpl");
        userpojo2.setShowroomprice("Showroom Price:");
        userpojo2.setModelName("Model Name:");
        arrayList.add(userpojo2);

        UserPojo userpojo3 = new UserPojo();
        userpojo3.setCarname("A4");
        userpojo3.setCarprice("41.46L");
        userpojo3.setMileage("Mileage: \nPetrol  17.84kmpl\nDiesel  17.84kmpll");
        userpojo3.setShowroomprice("Showroom Price:");
        userpojo3.setModelName("Model Name:");
        userpojo3.setImage(R.drawable.a4);
        arrayList.add(userpojo3);

        UserPojo userpojo4 = new UserPojo();
        userpojo4.setCarname("Q5");
        userpojo4.setCarprice("55.27L");
        userpojo4.setMileage("Mileage: \nPetrol  12.44kmpl");
        userpojo4.setShowroomprice("Showroom Price:");
        userpojo4.setModelName("Model Name:");
        userpojo4.setImage(R.drawable.q5);
        arrayList.add(userpojo4);

        UserPojo userpojo5 = new UserPojo();
        userpojo5.setImage(R.drawable.a6);
        userpojo5.setCarname("A6");
        userpojo5.setCarprice("55.86L");
        userpojo5.setMileage("Mileage: \nDiesel  16.66kmpl");
        userpojo5.setShowroomprice("Showroom Price:");
        userpojo5.setModelName("Model Name:");
        arrayList.add(userpojo5);

        UserPojo userpojo6 = new UserPojo();
        userpojo6.setImage(R.drawable.a5);
        userpojo6.setCarname("A5");
        userpojo6.setCarprice("60.42L");
        userpojo6.setMileage("Mileage: \nPetrol  13.57kmpl\nDiesel  19.2kmpl");
        userpojo6.setShowroomprice("Showroom Price:");
        userpojo6.setModelName("Model Name:");
        arrayList.add(userpojo6);

        UserPojo userpojo7 = new UserPojo();
        userpojo7.setImage(R.drawable.tt);
        userpojo7.setCarname("TT");
        userpojo7.setCarprice("65.43L");
        userpojo7.setMileage("Mileage: \nPetrol  14.33kmpl");
        userpojo7.setShowroomprice("Showroom Price:");
        userpojo7.setModelName("Model Name:");
        arrayList.add(userpojo7);

        UserPojo userpojo8 = new UserPojo();
        userpojo8.setImage(R.drawable.q7);
        userpojo8.setCarname("Q7");
        userpojo8.setCarprice("73.73L");
        userpojo8.setMileage("Mileage: \nPetrol  11.68kmpl\nDiesel  14.75kmpl");
        userpojo8.setShowroomprice("Showroom Price:");
        userpojo8.setModelName("Model Name:");
        arrayList.add(userpojo8);

        UserPojo userpojo9 = new UserPojo();
        userpojo9.setImage(R.drawable.rs5);
        userpojo9.setCarname("RS5");
        userpojo9.setCarprice("1.11Cr");
        userpojo9.setMileage("Mileage: \nPetrol  11.05kmpl");
        userpojo9.setShowroomprice("Showroom Price:");
        userpojo9.setModelName("Model Name:");
        arrayList.add(userpojo9);

        UserPojo userpojo10 = new UserPojo();
        userpojo10.setImage(R.drawable.rs6);
        userpojo10.setCarname("RS6");
        userpojo10.setCarprice("1.59Cr");
        userpojo10.setMileage("Mileage: \nPetrol  10.42kmpl");
        userpojo10.setShowroomprice("Showroom Price:");
        userpojo10.setModelName("Model Name:");
        arrayList.add(userpojo10);

        UserPojo userpojo11 = new UserPojo();
        userpojo11.setImage(R.drawable.rs7sportsback);
        userpojo11.setCarname("RS7 Sportback");
        userpojo11.setCarprice("1.71Cr");
        userpojo11.setMileage("Mileage: \nPetrol  10.2kmpl");
        userpojo11.setShowroomprice("Showroom Price:");
        userpojo11.setModelName("Model Name:");
        arrayList.add(userpojo11);

        UserPojo userpojo12 = new UserPojo();
        userpojo12.setImage(R.drawable.r8);
        userpojo12.setCarname("R8");
        userpojo12.setCarprice("2.72Cr");
        userpojo12.setMileage("Mileage: \nPetrol  6.71kmpl");
        userpojo12.setShowroomprice("Showroom Price:");
        userpojo12.setModelName("Model Name:");
        arrayList.add(userpojo12);


        adapter = new CustomAdapter(this, R.layout.listitem, arrayList);
        listview.setAdapter(adapter);
    }
}
