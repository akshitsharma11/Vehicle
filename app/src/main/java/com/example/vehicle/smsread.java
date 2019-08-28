package com.example.vehicle;

import android.Manifest;
import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class smsread extends AppCompatActivity {
   // TextView txtmessage;
    TextView txtvehicleno,txtrtooffice,txtownername,txtvehiclename,txtexpiry,txtfinance,txtinsuranc;
    ProgressDialog progressdialog;

    private static final int MY_PERMISSIONS_REQUEST_RECEIVE_SMS = 0;
//    ArrayList<String>arrayList=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.smsreadactivity);
        LocalBroadcastManager.getInstance(this).registerReceiver(mReceiver,new IntentFilter("value"));


        //txtmessage=findViewById(R.id.txtmessage);
        txtvehicleno=findViewById(R.id.txtvehicleno);
        txtrtooffice=findViewById(R.id.txtrtooffice);
        txtownername=findViewById(R.id.txtownername);
        txtvehiclename=findViewById(R.id.txtvehiclename);
        txtexpiry=findViewById(R.id.txtexpiry);
        txtfinance=findViewById(R.id.txtfinance);
      //
        //  txtinsurance=findViewById(R.id.txtinsurance);

        progressdialog=new ProgressDialog(this);
        progressdialog.setTitle("Please wait...");
        progressdialog.setCancelable(false);
        progressdialog.show();
//        Intent intent=getIntent();
//
//        String sms=intent.getStringExtra("s");
//        txt.setText(sms);




        if (ContextCompat.checkSelfPermission(this, Manifest.permission.RECEIVE_SMS)!= PackageManager.PERMISSION_GRANTED)
        {
            if (ActivityCompat.shouldShowRequestPermissionRationale(this,Manifest.permission.RECEIVE_SMS))
            {

            }else {
                ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.RECEIVE_SMS},MY_PERMISSIONS_REQUEST_RECEIVE_SMS);
            }

        }


    }//onCreate

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {

        switch(requestCode)
        {
            case MY_PERMISSIONS_REQUEST_RECEIVE_SMS:
            {
                if (grantResults.length>0 && grantResults[0]==PackageManager.PERMISSION_GRANTED){
                    Toast.makeText(this,"Thanks For Permitting",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(this,"Please Permit for the permssions",Toast.LENGTH_SHORT).show();
                }

            }

        }


    }

private BroadcastReceiver mReceiver=new BroadcastReceiver() {
    @Override
    public void onReceive(Context context, Intent intent1) {
        String receive=intent1.getStringExtra("s");
        SharedPreferences sharedPreferences=getSharedPreferences("Text",MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString("tt",receive);
        editor.commit();
//        SharedPreferences preferences=getSharedPreferences("Text",MODE_PRIVATE);
//        SharedPreferences.Editor editor=preferences.edit();
//        editor.putString("text",receive);
//        editor.commit();
//         arrayList.add(receive);
//        Intent intent2=new Intent("arr").putExtra("array",arrayList);
//        LocalBroadcastManager.getInstance(context).sendBroadcast(intent2);


        //        code to separate relevant info from the received message
        String[] temp1 = receive.split(Pattern.quote("["));
        String vechNo = temp1[0];
        String temp2 = temp1[1];
        Log.d("12345", "onReceive: vech no. "+vechNo);
        txtvehicleno.setText(vechNo);


        String[] temp3 = temp2.split(Pattern.quote("]"));
        String rtoOfficeName = temp3[0];
        String temp4 = temp3[1];
        Log.d("12345", "onReceive: rto office "+rtoOfficeName);
        txtrtooffice.setText(rtoOfficeName);



        String[] temp5 = temp4.split(":");
//        Log.d("12345", "onReceive: temp "+temp5[0]+" - "+temp5[1]+" - "+temp5[2]+" - "+temp5[3]+" - "+temp5[4]);

        String[] temp6 = temp5[1].split("-");

        String[] temp7 = temp6[1].split("\n");
        String ownerName = temp7[0];
        Log.d("12345", "onReceive: owner "+ownerName);
        txtownername.setText(ownerName);

        String[] temp8 = temp5[2].split(Pattern.quote("\n"));
        String vehicleName = temp8[0];
        Log.d("12345", "onReceive: veh "+vehicleName);
        Log.d("12345", "onReceive: Motor "+temp8[1]);
        txtvehiclename.setText(vehicleName);


        String[] temp9 = temp5[3].split("I");
        String expiryDate = temp9[0];

        Log.d("12345", "onReceive: expiry date "+expiryDate);
        txtexpiry.setText(expiryDate);

        String[] temp11 = temp5[4].split("C");
        String insurance = temp11[0];
        Log.d("12345", "onReceive: finance "+insurance);
        txtfinance.setText(insurance);




    //    Toast.makeText(smsread.this,"here",Toast.LENGTH_SHORT).show();

        Log.d("1234",receive);
      //  txtdetails.setText(intent1.getStringExtra("s"));
     //   txtmessage.setText(receive);
        progressdialog.cancel();
        Log.d("1234",receive);

    //    Toast.makeText(smsread.this,"here1234",Toast.LENGTH_SHORT).show();
    }
};
}
