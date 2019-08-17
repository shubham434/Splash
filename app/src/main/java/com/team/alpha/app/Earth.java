package com.team.alpha.app;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Earth extends AppCompatActivity {

    private ViewPager mSlideViewPager;
    private DataEarth DataEarth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earth);

        mSlideViewPager = (ViewPager) findViewById(R.id.slideViewPager);

        DataEarth = new DataEarth(this);

        mSlideViewPager.setAdapter(DataEarth);
    }
}
