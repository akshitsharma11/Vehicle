package com.example.vehicle;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class secondactivity extends AppCompatActivity implements ActivityCompat.OnRequestPermissionsResultCallback{
    //EditText edtvehicleno;
   // ImageButton searchbutton;
    //String text;

//    private SmsBroadcastReceiver smsBroadcastReceiver;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        setContentView(R.layout.secondactivty);
        super.onCreate(savedInstanceState);



    }

  //  searchbutton=findViewById(R.id.searchbutton);

    EditText edtvehicleno;
    ImageButton searchbutton;
    String text;


    public void checkPermission(View view){



        Log.d("1234","here1");

        int permissionCheck = ContextCompat.checkSelfPermission(this, Manifest.permission.SEND_SMS);

        if (permissionCheck== PackageManager.PERMISSION_GRANTED ){

            sendMsg();
        }else {
                ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.SEND_SMS,
                        },0);
               // ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_PHONE_STATE}, 0);
            }
            }

           // sendMsg();

//            Bundle extras = getIntent().getExtras();
//
//            if (extras != null) {
//                String address = extras.getString("MessageNumber");
//                String message = extras.getString("Message");
//              //  searchbutton=findViewById(R.id.searchbutton);
//
//              //  edtvehicleno=findViewById(R.id.edtvehicleno);
//                //TextView messageField = (TextView) findViewById(R.id.msg);
//               // text=edtvehicleno.getText().toString();
//
//
//               // edtvehicleno.setText("Messsage : "+ message);
//               // edtvehicleno.setText("VHN"+text);
//            }
//
//
//        }else {
//            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.SEND_SMS,
//                    Manifest.permission.READ_PHONE_STATE,Manifest.permission.READ_SMS},0);
//            // ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_PHONE_STATE}, 0);
//        }
//




    private void sendMsg() {
        edtvehicleno = findViewById(R.id.edtvehicleno);

        text = edtvehicleno.getText().toString().toUpperCase();
        Log.d("1234", "Here3 in send msg");
if (text.isEmpty()){
    Toast.makeText(this, "Enter Vehicle No.", Toast.LENGTH_LONG).show();
}
else {
    String phoneNumber = "7738299899";
    String Message = "VAHAN" + " " + text;
    Log.d("1234", "Here4 in send msg");

    SmsManager smsManager = SmsManager.getDefault();
    smsManager.sendTextMessage(phoneNumber, null, Message, null, null);

//        Toast.makeText(this, "Message Sent", Toast.LENGTH_LONG).show();
    //       edtvehicleno.setText(null);

    Intent intent = new Intent(secondactivity.this, smsread.class);
    startActivity(intent);
}
        edtvehicleno.setText(null);

    }



    /*    String phoneNumber = "7976305988";
       String Message="hiii";
        // String Message = "VHN"+text;
        SmsManager smsManager  = SmsManager.getDefault();
        smsManager.sendTextMessage(phoneNumber,null,Message,null,null);

        Toast.makeText(this,"Message Sent",Toast.LENGTH_LONG).show();

        */



    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode) {
            case 0:
                if ((grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED)) {

                    sendMsg();
                } else {
                    Toast.makeText(this, "You Dont have permission for this", Toast.LENGTH_SHORT).show();
                }
                break;
        }}}

//
//    }
//}
