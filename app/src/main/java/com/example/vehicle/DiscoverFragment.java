package com.example.vehicle;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class DiscoverFragment extends Fragment {

    Button btnmaruti,btnrenault,btnaudi,btnford,btnfiat,btnmercedes,btntoyota,btnhyundai,btnmahindra,btntata,btnbmw,btnskoda,btnvolkwagen,btnmitsubishi,btnnisaan;

    public DiscoverFragment(){}

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootview= inflater.inflate(R.layout.fragmentdiscover,container,false);

        btnmaruti=rootview.findViewById(R.id.btnmaruti);
        btntoyota=rootview.findViewById(R.id.btntoyota);
        btnmahindra=rootview.findViewById(R.id.btnmahindra);
        btntata=rootview.findViewById(R.id.btntata);
        btnhyundai=rootview.findViewById(R.id.btnhyundai);
        btnford=rootview.findViewById(R.id.btnford);
        btnbmw=rootview.findViewById(R.id.btnbmw);
        btnskoda=rootview.findViewById(R.id.btnskoda);
        btnmercedes=rootview.findViewById(R.id.btnmercedes);
        btnaudi=rootview.findViewById(R.id.btnaudi);
        btnvolkwagen=rootview.findViewById(R.id.btnvolkswagen);
        btnfiat=rootview.findViewById(R.id.btnfiat);
        btnmitsubishi=rootview.findViewById(R.id.btnmitsubishi);
        btnnisaan=rootview.findViewById(R.id.btnnisaan);
        btnrenault=rootview.findViewById(R.id.btnrenault);

        btnmaruti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),maruti.class);
                startActivity(intent);
            }
        });
        btnhyundai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Hyundai.class);
                startActivity(intent);
            }
        });
        btnmahindra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),mahindra.class);
                startActivity(intent);
            }
        });
        btntoyota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Toyota.class);
                startActivity(intent);
            }
        });
        btntata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Tata.class);
                startActivity(intent);
            }
        });
        btnford.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Ford.class);
                startActivity(intent);
            }
        });
        btnbmw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),BMW.class);
                startActivity(intent);
            }
        });
        btnskoda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Skoda.class);
                startActivity(intent);
            }
        });
        btnmercedes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),MercedesBenz.class);
                startActivity(intent);
            }
        });
        btnvolkwagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Volkswagen.class);
                startActivity(intent);
            }
        });
        btnaudi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Audi.class);
                startActivity(intent);
            }
        });
        btnfiat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Fiat.class);
                startActivity(intent);
            }
        });
        btnmitsubishi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Mitsubishi.class);
                startActivity(intent);
            }
        });
        btnrenault.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Renault.class);
                startActivity(intent);
            }
        });
        btnnisaan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Nissan.class);
                startActivity(intent);
            }
        });
        return rootview;








    }
}
