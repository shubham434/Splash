package com.team.alpha.app;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class records extends AppCompatActivity {

    private ViewPager mSlideViewPager;
    private DataRecords DataRecords;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_records);

        mSlideViewPager = (ViewPager) findViewById(R.id.slideViewPager);

        DataRecords= new DataRecords(this);

        mSlideViewPager.setAdapter(DataRecords);
    }
}
