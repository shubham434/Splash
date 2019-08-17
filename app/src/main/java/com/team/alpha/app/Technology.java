package com.team.alpha.app;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Technology extends AppCompatActivity {

    private ViewPager mSlideViewPager;
    private DataTechnology DataTechnology;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technology);

        mSlideViewPager = (ViewPager) findViewById(R.id.slideViewPager);

        DataTechnology = new DataTechnology(this);

        mSlideViewPager.setAdapter(DataTechnology);
    }
}
