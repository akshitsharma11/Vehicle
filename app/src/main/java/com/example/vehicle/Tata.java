package com.example.vehicle;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Tata extends AppCompatActivity {
    ListView listview;
    CustomAdapter adapter;
    ArrayList arrayList = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.marutiactivity);
        listview = findViewById(R.id.listview);

        UserPojo userpojo1 = new UserPojo();
        userpojo1.setImage(R.drawable.nano);
        userpojo1.setCarname("Nano");
        userpojo1.setCarprice("2.47L");
        userpojo1.setMileage("Mileage: \nPetrol  21.9kmpl");
        userpojo1.setShowroomprice("Showroom Price:");
        userpojo1.setModelName("Model Name:");
        arrayList.add(userpojo1);

        UserPojo userpojo2 = new UserPojo();
        userpojo2.setCarname("Tiago");
        userpojo2.setCarprice("4.21L");
        userpojo2.setImage(R.drawable.tiago);
        userpojo2.setMileage("Mileage: \nPetrol  23.84kmpl\nDiesel  27.28kmpl");
        userpojo2.setShowroomprice("Showroom Price:");
        userpojo2.setModelName("Model Name:");
        arrayList.add(userpojo2);

        UserPojo userpojo3 = new UserPojo();
        userpojo3.setCarname("Bolt");
        userpojo3.setCarprice("5.03L");
        userpojo3.setMileage("Mileage: \nPetrol  17.57kmpl\nDiesel  22.95kmpl");
        userpojo3.setShowroomprice("Showroom Price:");
        userpojo3.setModelName("Model Name:");
        userpojo3.setImage(R.drawable.bolt);
        arrayList.add(userpojo3);

        UserPojo userpojo4 = new UserPojo();
        userpojo4.setCarname("Tigor");
        userpojo4.setCarprice("5.50L");
        userpojo4.setMileage("Mileage: \nPetrol  21kmpl\nDiesel  27.28kmpl");
        userpojo4.setShowroomprice("Showroom Price:");
        userpojo4.setModelName("Model Name:");
        userpojo4.setImage(R.drawable.tigor);
        arrayList.add(userpojo4);

        UserPojo userpojo5 = new UserPojo();
        userpojo5.setImage(R.drawable.zest);
        userpojo5.setCarname("Zest");
        userpojo5.setCarprice("5.62L");
        userpojo5.setMileage("Mileage: \nPetrol  17.57kmpl\nDiesel  22.49kmpl");
        userpojo5.setShowroomprice("Showroom Price:");
        userpojo5.setModelName("Model Name:");
        arrayList.add(userpojo5);

        UserPojo userpojo6 = new UserPojo();
        userpojo6.setImage(R.drawable.tiagonrg);
        userpojo6.setCarname("Tiago NRG");
        userpojo6.setCarprice("5.70L");
        userpojo6.setMileage("Mileage: \nPetrol  23.84kmpl\nDiesel  27.28kmpl");
        userpojo6.setShowroomprice("Showroom Price:");
        userpojo6.setModelName("Model Name:");
        arrayList.add(userpojo6);

        UserPojo userpojo7 = new UserPojo();
        userpojo7.setImage(R.drawable.tiagojtp);
        userpojo7.setCarname("Tiago JTP");
        userpojo7.setCarprice("6.39L");
        userpojo7.setMileage("Mileage: \nPetrol  23.84kmpl");
        userpojo7.setShowroomprice("Showroom Price:");
        userpojo7.setModelName("Model Name:");
        arrayList.add(userpojo7);

        UserPojo userpojo8 = new UserPojo();
        userpojo8.setImage(R.drawable.nexon);
        userpojo8.setCarname("Nexon");
        userpojo8.setCarprice("6.46L");
        userpojo8.setMileage("Mileage: \nPetrol  17.88kmpl\nDiesel  23.97kmpl");
        userpojo8.setShowroomprice("Showroom Price:");
        userpojo8.setModelName("Model Name:");
        arrayList.add(userpojo8);

        UserPojo userpojo9 = new UserPojo();
        userpojo9.setImage(R.drawable.tigorjtp);
        userpojo9.setCarname("Tigor JTP");
        userpojo9.setCarprice("7.49L");
        userpojo9.setMileage("Mileage: \nPetrol  15.87kmpl");
        userpojo9.setShowroomprice("Showroom Price:");
        userpojo9.setModelName("Model Name:");
        arrayList.add(userpojo9);

        UserPojo userpojo10 = new UserPojo();
        userpojo10.setImage(R.drawable.glanza);
        userpojo10.setCarname("Sumo Gold");
        userpojo10.setCarprice("7.50L");
        userpojo10.setMileage("Mileage: \nDiesel  15kmpl");
        userpojo10.setShowroomprice("Showroom Price:");
        userpojo10.setModelName("Model Name:");
        arrayList.add(userpojo10);

        UserPojo userpojo11 = new UserPojo();
        userpojo11.setImage(R.drawable.safaristorme);
        userpojo11.setCarname("Safari Storme");
        userpojo11.setCarprice("10.95L");
        userpojo11.setMileage("Mileage: \nDiesel  13.95kmpl");
        userpojo11.setShowroomprice("Showroom Price:");
        userpojo11.setModelName("Model Name:");
        arrayList.add(userpojo11);

        UserPojo userpojo12 = new UserPojo();
        userpojo12.setImage(R.drawable.harrier);
        userpojo12.setCarname("Harrier");
        userpojo12.setCarprice("12.71L");
        userpojo12.setMileage("Mileage: \nDiesel  17kmpl");
        userpojo12.setShowroomprice("Showroom Price:");
        userpojo12.setModelName("Model Name:");
        arrayList.add(userpojo12);

        UserPojo userpojo13 = new UserPojo();
        userpojo13.setImage(R.drawable.hexa);
        userpojo13.setCarname("Hexa");
        userpojo13.setCarprice("12.99L");
        userpojo13.setMileage("Mileage: 1\nDiesel  4.4kmpl");
        userpojo13.setShowroomprice("Showroom Price:");
        userpojo13.setModelName("Model Name:");
        arrayList.add(userpojo13);


        adapter = new CustomAdapter(this, R.layout.listitem, arrayList);
        listview.setAdapter(adapter);
    }
}
