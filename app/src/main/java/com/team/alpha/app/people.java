package com.team.alpha.app;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class people extends AppCompatActivity {

    private ViewPager mSlideViewPager;
    private DataPeople DataPeople;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_people);

        mSlideViewPager = (ViewPager) findViewById(R.id.slideViewPager);

        DataPeople = new DataPeople(this);

        mSlideViewPager.setAdapter(DataPeople);
    }
}
