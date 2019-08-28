package com.example.vehicle;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class mahindra extends AppCompatActivity {
    ListView listview;
    CustomAdapter adapter;
    ArrayList arrayList=new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.marutiactivity);
        listview=findViewById(R.id.listview);

        UserPojo userpojo1 = new UserPojo();
        userpojo1.setImage(R.drawable.kuv100nxt);
        userpojo1.setCarname("KUV100 NXT");
        userpojo1.setCarprice("4.85L");
        userpojo1.setMileage("Mileage: \nPetrol  18.15kmpl\nDiesel  25.32kmpl");
        userpojo1.setShowroomprice("Showroom Price:");
        userpojo1.setModelName("Model Name:");
        arrayList.add(userpojo1);

        UserPojo userpojo2 = new UserPojo();
        userpojo2.setCarname("Verito Vibe");
        userpojo2.setCarprice("6.55L");
        userpojo2.setImage(R.drawable.veritovibe);
        userpojo2.setMileage("Mileage: \nDiesel  20.8kmpl");
        userpojo2.setShowroomprice("Showroom Price:");
        userpojo2.setModelName("Model Name:");
        arrayList.add(userpojo2);

        UserPojo userpojo3 = new UserPojo();
        userpojo3.setCarname("Thar");
        userpojo3.setCarprice("6.681L");
        userpojo3.setMileage("Mileage: \nDiesel  13kmpl");
        userpojo3.setShowroomprice("Showroom Price:");
        userpojo3.setModelName("Model Name:");
        userpojo3.setImage(R.drawable.thar);
        arrayList.add(userpojo3);

        UserPojo userpojo4 = new UserPojo();
        userpojo4.setCarname("Verito");
        userpojo4.setCarprice("7.46L");
        userpojo4.setMileage("Mileage: \nDiesel  21kmpl");
        userpojo4.setShowroomprice("Showroom Price:");
        userpojo4.setModelName("Model Name:");
        userpojo4.setImage(R.drawable.verito);
        arrayList.add(userpojo4);

        UserPojo userpojo5 = new UserPojo();
        userpojo5.setImage(R.drawable.e20plus);
        userpojo5.setCarname("e20 PLUS");
        userpojo5.setCarprice("7.51L");
        userpojo5.setMileage("Mileage: \nElectric 110km/full charge");
        userpojo5.setShowroomprice("Showroom Price:");
        userpojo5.setModelName("Model Name:");
        arrayList.add(userpojo5);

        UserPojo userpojo6 = new UserPojo();
        userpojo6.setImage(R.drawable.bolero);
        userpojo6.setCarname("Bolero");
        userpojo6.setCarprice("7.51L");
        userpojo6.setMileage("Mileage: \nPetrol  15.96kmpl\nDiesel  16.5kmpl");
        userpojo6.setShowroomprice("Showroom Price:");
        userpojo6.setModelName("Model Name:");
        arrayList.add(userpojo6);

        UserPojo userpojo7 = new UserPojo();
        userpojo7.setImage(R.drawable.xuv300);
        userpojo7.setCarname("XUV300");
        userpojo7.setCarprice("7.90L");
        userpojo7.setMileage("Mileage: \nPetrol  17kmpl\nDiesel  20kmpl");
        userpojo7.setShowroomprice("Showroom Price:");
        userpojo7.setModelName("Model Name:");
        arrayList.add(userpojo7);

        UserPojo userpojo8 = new UserPojo();
        userpojo8.setImage(R.drawable.nuvosport);
        userpojo8.setCarname("NuvoSport");
        userpojo8.setCarprice("7.97L");
        userpojo8.setMileage("Mileage: \nDiesel  17.4kmpl");
        userpojo8.setShowroomprice("Showroom Price:");
        userpojo8.setModelName("Model Name:");
        arrayList.add(userpojo8);

        UserPojo userpojo9 = new UserPojo();
        userpojo9.setImage(R.drawable.tuv300);
        userpojo9.setCarname("TUV300");
        userpojo9.setCarprice("8.44L");
        userpojo9.setMileage("Mileage: \nDiesel  18.49kmpl");
        userpojo9.setShowroomprice("Showroom Price:");
        userpojo9.setModelName("Model Name:");
        arrayList.add(userpojo9);

        UserPojo userpojo10 = new UserPojo();
        userpojo10.setImage(R.drawable.xylo);
        userpojo10.setCarname("Xylo");
        userpojo10.setCarprice("9.34L");
        userpojo10.setMileage("Mileage: \nDiesel  14.02kmpl");
        userpojo10.setShowroomprice("Showroom Price:");
        userpojo10.setModelName("Model Name:");
        arrayList.add(userpojo10);

        UserPojo userpojo11 = new UserPojo();
        userpojo11.setImage(R.drawable.marazzo);
        userpojo11.setCarname("Marazzo");
        userpojo11.setCarprice("9.99L");
        userpojo11.setMileage("Mileage: \nDiesel  17.6kmpl");
        userpojo11.setShowroomprice("Showroom Price:");
        userpojo11.setModelName("Model Name:");
        arrayList.add(userpojo11);

        UserPojo userpojo12 = new UserPojo();
        userpojo12.setImage(R.drawable.scorpio);
        userpojo12.setCarname("Scorpio");
        userpojo12.setCarprice("10.09L");
        userpojo12.setMileage("Mileage: \nDiesel  16.36kmpl");
        userpojo12.setShowroomprice("Showroom Price:");
        userpojo12.setModelName("Model Name:");
        arrayList.add(userpojo12);

        UserPojo userpojo13 = new UserPojo();
        userpojo13.setImage(R.drawable.alturas);
        userpojo13.setCarname("Alturas G4");
        userpojo13.setCarprice("26.95L");
        userpojo13.setMileage("Mileage: \nDiesel  12kmpl");
        userpojo13.setShowroomprice("Showroom Price:");
        userpojo13.setModelName("Model Name:");
        arrayList.add(userpojo13);

        UserPojo userpojo14 = new UserPojo();
        userpojo14.setImage(R.drawable.xuv500);
        userpojo14.setCarname("XUV500");
        userpojo14.setCarprice("12.79L");
        userpojo14.setMileage("Mileage: \nPetrol  11.1kmpl\nDiesel  15.1kmpl");
        userpojo14.setShowroomprice("Showroom Price:");
        userpojo14.setModelName("Model Name:");
        arrayList.add(userpojo14);


        adapter = new CustomAdapter(this,R.layout.listitem,arrayList);
        listview.setAdapter(adapter);

    }
}
