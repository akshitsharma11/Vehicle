package com.example.vehicle;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.Toolbar;

import java.util.ArrayList;

public class maruti extends AppCompatActivity {
    ListView listView;
    CustomAdapter adapter;
    ArrayList arrayList=new ArrayList<>();
    Toolbar toolbar;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.marutiactivity);

      /*
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View v) {
        Intent intent= new Intent(maruti.this, DiscoverFragment.class);
        startActivity(intent);
       }
      });
      */



      //  mToolbar = (Toolbar) findViewById(R.id.toolbar);
      //  setSupportActionBar(mToolbar);
       // getSupportActionBar().setDisplayHomeAsUpEnabled(true);
       // getSupportActionBar().setDisplayShowHomeEnabled(true);
      //  getSupportActionBar().setTitle("MyTitle");


        listView = findViewById(R.id.listview);



        UserPojo userpojo1 = new UserPojo();
        userpojo1.setImage(R.drawable.altok10);
        userpojo1.setCarname("Alto K10");
        userpojo1.setCarprice("3.56L");
        userpojo1.setMileage("Mileage: \nPetrol  24.07kmpl");
        userpojo1.setShowroomprice("Showroom Price:");
        userpojo1.setModelName("Model Name:");
        arrayList.add(userpojo1);

        UserPojo userpojo2 = new UserPojo();
        userpojo2.setCarname("Vitara Brezza");
        userpojo2.setCarprice("7.84L");
        userpojo2.setImage(R.drawable.vitarabreza);
        userpojo2.setMileage("Mileage: \nDiesel  24.29kmpl");
        userpojo2.setShowroomprice("Showroom Price:");
        userpojo2.setModelName("Model Name:");
        arrayList.add(userpojo2);

        UserPojo userpojo3 = new UserPojo();
        userpojo3.setCarname("Celerio");
        userpojo3.setCarprice("4.36L");
        userpojo3.setMileage("Mileage: \nPetrol  23.1kmpl");
        userpojo3.setShowroomprice("Showroom Price:");
        userpojo3.setModelName("Model Name:");
        userpojo3.setImage(R.drawable.celerio);
        arrayList.add(userpojo3);

        UserPojo userpojo4 = new UserPojo();
        userpojo4.setCarname("Ignis");
        userpojo4.setCarprice("4.75L");
        userpojo4.setMileage("Mileage: \nPetrol  20.89kmpl");
        userpojo4.setShowroomprice("Showroom Price:");
        userpojo4.setModelName("Model Name:");
        userpojo4.setImage(R.drawable.ignis);
        arrayList.add(userpojo4);

        UserPojo userpojo5 = new UserPojo();
        userpojo5.setImage(R.drawable.swift);
        userpojo5.setCarname("Swift");
        userpojo5.setCarprice("4.99L");
        userpojo5.setMileage("Mileage: \nPetrol  22kmpl\nDiesel  28.4kmpl");
        userpojo5.setShowroomprice("Showroom Price:");
        userpojo5.setModelName("Model Name:");
        arrayList.add(userpojo5);

        UserPojo userpojo6 = new UserPojo();
        userpojo6.setImage(R.drawable.baleno);
        userpojo6.setCarname("Baleno");
        userpojo6.setCarprice("5.54L");
        userpojo6.setMileage("Mileage: \nPetrol  21.4kmpl\nDiesel  27.39kmpl");
        userpojo6.setShowroomprice("Showroom Price:");
        userpojo6.setModelName("Model Name:");
        arrayList.add(userpojo6);

        UserPojo userpojo7 = new UserPojo();
        userpojo7.setImage(R.drawable.dzire);
        userpojo7.setCarname("Dzire");
        userpojo7.setCarprice("5.69L");
        userpojo7.setMileage("Mileage: \nPetrol  22kmpl\nDiesel  28.4kmpl");
        userpojo7.setShowroomprice("Showroom Price:");
        userpojo7.setModelName("Model Name:");
        arrayList.add(userpojo7);

        UserPojo userpojo8 = new UserPojo();
        userpojo8.setImage(R.drawable.ciaz);
        userpojo8.setCarname("Ciaz");
        userpojo8.setCarprice("8.19L");
        userpojo8.setMileage("Mileage: \nPetrol  21.56kmpl\nDiesel  28.09kmpl");
        userpojo8.setShowroomprice("Showroom Price:");
        userpojo8.setModelName("Model Name:");
        arrayList.add(userpojo8);

        UserPojo userpojo9 = new UserPojo();
        userpojo9.setImage(R.drawable.wagonr);
        userpojo9.setCarname("Wagon R");
        userpojo9.setCarprice("4.29L");
        userpojo9.setMileage("Mileage: \nPetrol  22.5kmpl");
        userpojo9.setShowroomprice("Showroom Price:");
        userpojo9.setModelName("Model Name:");
        arrayList.add(userpojo9);

        UserPojo userpojo10 = new UserPojo();
        userpojo10.setImage(R.drawable.omni);
        userpojo10.setCarname("Omni");
        userpojo10.setCarprice("3.01L");
        userpojo10.setMileage("Mileage: \nPetrol  16.8kmpl");
        userpojo10.setShowroomprice("Showroom Price:");
        userpojo10.setModelName("Model Name:");
        arrayList.add(userpojo10);

        UserPojo userpojo11 = new UserPojo();
        userpojo11.setImage(R.drawable.eeco);
        userpojo11.setCarname("Eeco");
        userpojo11.setCarprice("3.61L");
        userpojo11.setMileage("Mileage: \nPetrol  16.2kmpl");
        userpojo11.setShowroomprice("Showroom Price:");
        userpojo11.setModelName("Model Name:");
        arrayList.add(userpojo11);

        UserPojo userpojo12 = new UserPojo();
        userpojo12.setImage(R.drawable.celeriox);
        userpojo12.setCarname("Celerio X");
        userpojo12.setCarprice("4.78L");
        userpojo12.setMileage("Mileage: \nPetrol  23.1kmpl");
        userpojo12.setShowroomprice("Showroom Price:");
        userpojo12.setModelName("Model Name:");
        arrayList.add(userpojo12);


        adapter = new CustomAdapter(this,R.layout.listitem,arrayList);
        listView.setAdapter(adapter);
    }
}
