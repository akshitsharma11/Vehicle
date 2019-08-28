package com.example.vehicle;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.nio.BufferUnderflowException;

public class HomeFragment extends Fragment{

    Button btnRCsearch,btnhistory,btnsettings;


    public HomeFragment(){}

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootview=inflater.inflate(R.layout.fragmenthome,container,false);

        btnRCsearch=rootview.findViewById(R.id.btnRCsearch);
        btnhistory=rootview.findViewById(R.id.btnhistory);
        btnsettings=rootview.findViewById(R.id.btnsettings);

        btnRCsearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),secondactivity.class);
                startActivity(intent);
            }
        });
        btnhistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(getActivity(),History.class);
                startActivity(intent1);
            }
        });
        btnsettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_SEND);
                i.setType("text/plain");
                i.putExtra(Intent.EXTRA_SUBJECT,"Vehicle App");
                String message = "\n Get this awesome vehicle recognition app \n https://drive.google.com/file/d/1Yu3BRgkK3i2g1G5I6VmuMZYkLL6IxOYs/view?usp=sharing \n";
                i.putExtra(Intent.EXTRA_TEXT,message);
                startActivity(Intent.createChooser(i,"select option to share"));
            }
        });
        return rootview;


    }

}
