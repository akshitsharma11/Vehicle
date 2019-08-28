package com.example.vehicle;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.regex.Pattern;

public class MyProfileFragment extends Fragment {
    EditText name,number,email;
    Button uodate;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;
    SharedPreferences sharedPreferen;
public MyProfileFragment(){}

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootview= inflater.inflate(R.layout.fragementmyprofile,container,false);
        name=rootview.findViewById(R.id.edtname);
        number=rootview.findViewById(R.id.edtnumber);
        email=rootview.findViewById(R.id.edtemail);
        uodate=rootview.findViewById(R.id.btn_update);
        firebaseDatabase=FirebaseDatabase.getInstance();
        databaseReference=firebaseDatabase.getReference("User Info");
        sharedPreferen=getActivity().getSharedPreferences("vehicledata", Context.MODE_PRIVATE);
        Boolean st=sharedPreferen.getBoolean("status",false);
        if(st.equals(true)) {
            String fnami = sharedPreferen.getString("name", null);
            String fnumi = sharedPreferen.getString("number", null);
            String femi = sharedPreferen.getString("email", null);
            name.setText(fnami);
            number.setText(fnumi);
            email.setText(femi);
        }


        uodate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fname=name.getText().toString();
                String fnum=number.getText().toString();
                String fem=email.getText().toString();
                String id=databaseReference.push().getKey();
                if (isValidEmailId(fem.trim())&&fnum.length()==10){
                vehiclepojo vehiclepoj=new vehiclepojo();
                vehiclepoj.setEmail(fem);
                vehiclepoj.setName(fname);
                vehiclepoj.setNumber(fnum);
                SharedPreferences.Editor editor=sharedPreferen.edit();
                editor.putString("name",fname);
                editor.putString("number",fnum);
                editor.putString("email",fem);
                editor.putBoolean("status",true);
                editor.commit();



                databaseReference.child(id).setValue(vehiclepoj);
                Toast.makeText(getActivity(),"Profile Updated",Toast.LENGTH_SHORT).show();
            }
                else{
                    Toast.makeText(getActivity(),"Email and Number are not valid",Toast.LENGTH_SHORT).show();
                }
            }
        });
        return rootview;
    }
//    public void onclick(View view){
//    switch (view.getId()){
//        case R.id.edtname:
//            if(name.getText().toString().isEmpty())
//                Toast.makeText(getActivity(), "Name not be empty", Toast.LENGTH_SHORT).show();
//            else
//                Toast.makeText(getActivity(), "Valid Name", Toast.LENGTH_SHORT).show();
//            break;
//        case R.id.edtemail:
//            if (isValidEmailId(email.getText().toString().trim()))
//                Toast.makeText(getActivity(), "Valid id", Toast.LENGTH_SHORT).show();
//            else
//                Toast.makeText(getActivity(), "Invalid id", Toast.LENGTH_SHORT).show();
//
//            break;
//        case R.id.edtnumber:
//            if (number.getText().toString().length()==10)
//                Toast.makeText(getActivity(), "Valid number", Toast.LENGTH_SHORT).show();
//            else
//                Toast.makeText(getActivity(), "Invalid Number", Toast.LENGTH_SHORT).show();
//
//    }
//    }
    private boolean isValidEmailId(String email) {

        return Pattern.compile("^(([\\w-]+\\.)+[\\w-]+|([a-zA-Z]{1}|[\\w-]{2,}))@"
                + "((([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                + "[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\."
                + "([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                + "[0-9]{1,2}|25[0-5]|2[0-4][0-9])){1}|"
                + "([a-zA-Z]+[\\w-]+\\.)+[a-zA-Z]{2,4})$").matcher(email).matches();
    }




}

