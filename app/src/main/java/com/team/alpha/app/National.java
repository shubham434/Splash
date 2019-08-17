package com.team.alpha.app;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class National extends AppCompatActivity {
    private ViewPager mSlideViewPager;
    private DataNational DataNational;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_national);

        mSlideViewPager = (ViewPager) findViewById(R.id.slideViewPager);

        DataNational= new DataNational(this);

        mSlideViewPager.setAdapter(DataNational);
    }
}
