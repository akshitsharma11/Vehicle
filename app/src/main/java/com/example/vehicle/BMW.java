package com.example.vehicle;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class BMW extends AppCompatActivity {
    ListView listview;
    CustomAdapter adapter;
    ArrayList arrayList = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.marutiactivity);
        listview = findViewById(R.id.listview);

        UserPojo userpojo1 = new UserPojo();
        userpojo1.setImage(R.drawable.x1);
        userpojo1.setCarname("X1");
        userpojo1.setCarprice("35.19L");
        userpojo1.setMileage("Mileage: \nPetrol  20.68kmpl\nDiesel  20.68kmpl");
        userpojo1.setShowroomprice("Showroom Price:");
        userpojo1.setModelName("Model Name:");
        arrayList.add(userpojo1);

        UserPojo userpojo2 = new UserPojo();
        userpojo2.setCarname("3 Series");
        userpojo2.setCarprice("39.80L");
        userpojo2.setImage(R.drawable.seies3);
        userpojo2.setMileage("Mileage: \nPetrol  16.05kmpl\nDiesel  22.69kmpl");
        userpojo2.setShowroomprice("Showroom Price:");
        userpojo2.setModelName("Model Name:");
        arrayList.add(userpojo2);

        UserPojo userpojo3 = new UserPojo();
        userpojo3.setCarname("3 Series GT");
        userpojo3.setCarprice("47.69L");
        userpojo3.setMileage("Mileage: \nPetrol  15.34kmpl\nDiesel  21.76kmpl");
        userpojo3.setShowroomprice("Showroom Price:");
        userpojo3.setModelName("Model Name:");
        userpojo3.setImage(R.drawable.series3gt);
        arrayList.add(userpojo3);

        UserPojo userpojo4 = new UserPojo();
        userpojo4.setCarname("5 Series");
        userpojo4.setCarprice("5.50L");
        userpojo4.setMileage("Mileage: \nPetrol  15.56kmpl\nDiesel  18.59kmpl");
        userpojo4.setShowroomprice("Showroom Price:");
        userpojo4.setModelName("Model Name:");
        userpojo4.setImage(R.drawable.series5);
        arrayList.add(userpojo4);

        UserPojo userpojo5 = new UserPojo();
        userpojo5.setImage(R.drawable.x3);
        userpojo5.setCarname("X3");
        userpojo5.setCarprice("55.98L");
        userpojo5.setMileage("Mileage: \nPetrol  13.32kmpl\nDiesel  16.4kmpl");
        userpojo5.setShowroomprice("Showroom Price:");
        userpojo5.setModelName("Model Name:");
        arrayList.add(userpojo5);

        UserPojo userpojo6 = new UserPojo();
        userpojo6.setImage(R.drawable.x4);
        userpojo6.setCarname("X4");
        userpojo6.setCarprice("60.60L");
        userpojo6.setMileage("Mileage: \nPetrol  13.32kmpl\nDiesel  16.4kmpl");
        userpojo6.setShowroomprice("Showroom Price:");
        userpojo6.setModelName("Model Name:");
        arrayList.add(userpojo6);

        UserPojo userpojo7 = new UserPojo();
        userpojo7.setImage(R.drawable.series6);
        userpojo7.setCarname("6 Series GT");
        userpojo7.setCarprice("63.90L");
        userpojo7.setMileage("Mileage: \nPetrol  15.63kmpl");
        userpojo7.setShowroomprice("Showroom Price:");
        userpojo7.setModelName("Model Name:");
        arrayList.add(userpojo7);

        UserPojo userpojo8 = new UserPojo();
        userpojo8.setImage(R.drawable.x5);
        userpojo8.setCarname("X5");
        userpojo8.setCarprice("69.40L");
        userpojo8.setMileage("Mileage: \nPetrol  15.97kmpl\nDiesel  15.97kmpl");
        userpojo8.setShowroomprice("Showroom Price:");
        userpojo8.setModelName("Model Name:");
        arrayList.add(userpojo8);

        UserPojo userpojo9 = new UserPojo();
        userpojo9.setImage(R.drawable.m2);
        userpojo9.setCarname("M2");
        userpojo9.setCarprice("81.80L");
        userpojo9.setMileage("Mileage: \nPetrol  9.4kmpl");
        userpojo9.setShowroomprice("Showroom Price:");
        userpojo9.setModelName("Model Name:");
        arrayList.add(userpojo9);

        UserPojo userpojo10 = new UserPojo();
        userpojo10.setImage(R.drawable.m5);
        userpojo10.setCarname("M5");
        userpojo10.setCarprice("1.44Cr");
        userpojo10.setMileage("Mileage: \nPetrol  13kmpl");
        userpojo10.setShowroomprice("Showroom Price:");
        userpojo10.setModelName("Model Name:");
        arrayList.add(userpojo10);

        UserPojo userpojo11 = new UserPojo();
        userpojo11.setImage(R.drawable.i8);
        userpojo11.setCarname("i8");
        userpojo11.setCarprice("2.62Cr");
        userpojo11.setMileage("Mileage: \nPetrol  47.45kmpl");
        userpojo11.setShowroomprice("Showroom Price:");
        userpojo11.setModelName("Model Name:");
        arrayList.add(userpojo11);

        UserPojo userpojo12 = new UserPojo();
        userpojo12.setImage(R.drawable.z4);
        userpojo12.setCarname("Z4");
        userpojo12.setCarprice("64.90L");
        userpojo12.setMileage("Mileage: \nPetrol  14.37 kmpl");
        userpojo12.setShowroomprice("Showroom Price:");
        userpojo12.setModelName("Model Name:");
        arrayList.add(userpojo12);




        adapter = new CustomAdapter(this, R.layout.listitem, arrayList);
        listview.setAdapter(adapter);
    }
}
