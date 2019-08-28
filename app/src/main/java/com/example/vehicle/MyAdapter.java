package com.example.vehicle;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyAdapter extends FragmentPagerAdapter {

    //private Context mycontext;
    int totaltabs;

    public MyAdapter(FragmentManager fm,int totaltabs) {
        super(fm);
       // mycontext=context;
        this.totaltabs=totaltabs;
    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0:
                HomeFragment home=new HomeFragment();
                return home;
            case 1:
                DiscoverFragment discover=new DiscoverFragment();
                return discover;
            case 2:
                MyProfileFragment MyProfile=new MyProfileFragment();
                return MyProfile;
        }

        return null;

    }

    @Override
    public int getCount() {
        return totaltabs;
    }
}
