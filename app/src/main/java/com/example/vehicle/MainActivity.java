package com.example.vehicle;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    TabLayout tablayout;
    ViewPager viewpager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tablayout=findViewById(R.id.tablayout);
        viewpager=findViewById(R.id.viewpager);

        tablayout.addTab(tablayout.newTab().setText("HOME"));
        tablayout.addTab(tablayout.newTab().setText("DISCOVER"));
        tablayout.addTab(tablayout.newTab().setText("MY PROFILE"));
        tablayout.setTabGravity(TabLayout.GRAVITY_FILL);








        MyAdapter adapter=new MyAdapter(getSupportFragmentManager(),tablayout.getTabCount());
        viewpager.setAdapter(adapter);

        viewpager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {
                tablayout.setScrollPosition(i,v,true);
            }

            @Override
            public void onPageSelected(int i) {

            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });


        tablayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Log.d("1234","onItemselected");
                viewpager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                Log.d("1234","onItemselected222222");

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                Log.d("1234","onItemselected3333333");

            }
        });




    }

}
