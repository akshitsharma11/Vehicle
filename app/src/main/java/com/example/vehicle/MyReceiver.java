package com.example.vehicle;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.telephony.SmsMessage;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {
    private static final String SMS_RECEIVED = "android.provider.Telephony.SMS_RECEIVED";
    private static final String TAG = "SmsBroadcastReceiver";
    String msg, phoneNo,m1,m2;
    int i;


    @Override
    public void onReceive(Context context, Intent intent) {

        phoneNo="+917738299899";
        m1="VK-VAAHAN";
        m2="VM-VAAHAN";
        Bundle bundle = intent.getExtras();
        SmsMessage[] smsm = null;
        String sms_str = "";
        if (bundle != null) {
            // Get the SMS message
            Object[] pdus = (Object[]) bundle.get("pdus");
            smsm = new SmsMessage[pdus.length];
            for ( i = 0; i < smsm.length; i++) {
                smsm[i] = SmsMessage.createFromPdu((byte[]) pdus[i]);
//                sms_str += "Sent From: " + smsm[i].getOriginatingAddress();
//                sms_str += "\r\nMessage: ";
                sms_str += smsm[i].getMessageBody().toString();
                sms_str += "\r\n";
            }


//dont delete this toast sa,ple
//            if(smsm[i-1].getOriginatingAddress().equals(m1)||smsm[i-1].getOriginatingAddress().equals(m2)){
//                Toast.makeText(context,"Message:"+sms_str,Toast.LENGTH_LONG).show();
            if(smsm[i-1].getOriginatingAddress().equals(m1)||smsm[i-1].getOriginatingAddress().equals(m2)){
                Intent intent1=new Intent("value").putExtra("s",sms_str);
                LocalBroadcastManager.getInstance(context).sendBroadcast(intent1);
//                Intent intent1=new Intent(context,smsread.class);
//                intent1.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                intent1.putExtra("s",sms_str);
//                context.startActivity(intent1);
            }






        }
    }
}
