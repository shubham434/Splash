package com.team.alpha.app;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Sports extends AppCompatActivity {

    private ViewPager mSlideViewPager;
    private DataSports DataSports;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports);

        mSlideViewPager = (ViewPager) findViewById(R.id.slideViewPager);

        DataSports = new DataSports(this);

        mSlideViewPager.setAdapter(DataSports);
    }
}
