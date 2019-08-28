package com.example.vehicle;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class History extends AppCompatActivity {
//    ListView listView;
//    ArrayList <String>arrayList;
//    SharedPreferences preferences=getSharedPreferences("Text",MODE_PRIVATE);
    TextView txtrtooffice1,txtvehiclename1,txtvehicleno1,txtexpiry1,txtinsurance1,txtownername1;
    String sm="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        txtexpiry1=findViewById(R.id.txtexpiry1);
        txtvehicleno1=findViewById(R.id.txtvehicleno1);
        txtvehiclename1=findViewById(R.id.txtvehiclename1);
        txtownername1=findViewById(R.id.txtownername1);
        txtrtooffice1=findViewById(R.id.txtrtooffice1);
        txtinsurance1=findViewById(R.id.txtfinance1);

        SharedPreferences sharedPreferences=getSharedPreferences("Text",MODE_PRIVATE);
         sm=sharedPreferences.getString("tt",null);
//        Toast.makeText(History.this,"a"+sm,Toast.LENGTH_SHORT).show();
       //     textView.setText(sm);
//        LocalBroadcastManager.getInstance(this).registerReceiver(mReceive,new IntentFilter("value"));
//        arrayList=new ArrayList<>();
//        listView=findViewById(R.id.list);
//
//        String sm=preferences.getString("text",null);
//        Log.d("1234",sm);
//        arrayList.add(sm);
//        ArrayAdapter arrayAdapter1=new ArrayAdapter(History.this,android.R.layout.simple_list_item_1,arrayList);
//        listView.setAdapter(arrayAdapter1);

        String[] temp1 = sm.split(Pattern.quote("["));
        String vechNo = temp1[0];
        String temp2 = temp1[1];
        Log.d("12345", "onReceive: vech no. "+vechNo);
        txtvehicleno1.setText(vechNo);


        String[] temp3 = temp2.split(Pattern.quote("]"));
        String rtoOfficeName = temp3[0];
        String temp4 = temp3[1];
        Log.d("12345", "onReceive: rto office "+rtoOfficeName);
        txtrtooffice1.setText(rtoOfficeName);



        String[] temp5 = temp4.split(":");
//        Log.d("12345", "onReceive: temp "+temp5[0]+" - "+temp5[1]+" - "+temp5[2]+" - "+temp5[3]+" - "+temp5[4]);

        String[] temp6 = temp5[1].split("-");

        String[] temp7 = temp6[1].split("\n");
        String ownerName = temp7[0];
        Log.d("12345", "onReceive: owner "+ownerName);
        txtownername1.setText(ownerName);

        String[] temp8 = temp5[2].split(Pattern.quote("\n"));
        String vehicleName = temp8[0];
        Log.d("12345", "onReceive: veh "+vehicleName);
        Log.d("12345", "onReceive: Motor "+temp8[1]);
        txtvehiclename1.setText(vehicleName);


        String[] temp9 = temp5[3].split("I");
        String expiryDate = temp9[0];

        Log.d("12345", "onReceive: expiry date "+expiryDate);
        txtexpiry1.setText(expiryDate);

        String[] temp11 = temp5[4].split("C");
        String insurance = temp11[0];
        Log.d("12345", "onReceive: finance "+insurance);
        txtinsurance1.setText(insurance);



    }

}
