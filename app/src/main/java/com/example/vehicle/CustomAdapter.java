package com.example.vehicle;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context context;
    int resource;
    ArrayList<UserPojo> arrayList;

    public CustomAdapter(Context context, int resource, ArrayList<UserPojo> arrayList) {
        super(context, resource,arrayList);
        this.context=context;
        this.resource=resource;
        this.arrayList=arrayList;

    }


    @Override
    public View getView(int position,  View convertView, ViewGroup parent) {
        LayoutInflater inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=inflater.inflate(resource,null,false);
        ImageView imageview=view.findViewById(R.id.carimage);
        TextView textViewname=view.findViewById(R.id.carname);
        TextView textViewmodelname=view.findViewById(R.id.txtmodelname);
        TextView textViewshowroomprice=view.findViewById(R.id.txtshowroomprice);
        TextView textViewprice=view.findViewById(R.id.txtprice);
        TextView textViewmileage=view.findViewById(R.id.carmileage);

        UserPojo userpojo=arrayList.get(position);
        imageview.setImageResource(userpojo.getImage());
        textViewmodelname.setText(userpojo.getModelName());
        textViewname.setText(userpojo.getCarname());
        textViewprice.setText(userpojo.getCarprice());
        textViewshowroomprice.setText(userpojo.getShowroomprice());
        textViewmileage.setText(userpojo.getMileage());

        return view;
    }
}
