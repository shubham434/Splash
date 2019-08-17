package com.team.alpha.app;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Space extends AppCompatActivity {

    private ViewPager mSlideViewPager;
    private DataSpace DataSpace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_space);

        mSlideViewPager = (ViewPager) findViewById(R.id.slideViewPager);

        DataSpace = new DataSpace(this);

        mSlideViewPager.setAdapter(DataSpace);
    }
}
