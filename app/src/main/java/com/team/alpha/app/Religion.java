package com.team.alpha.app;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Religion extends AppCompatActivity {

    private ViewPager mSlideViewPager;
    private DataReligion DataReligion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_religion);

        mSlideViewPager = (ViewPager) findViewById(R.id.slideViewPager);

        DataReligion = new DataReligion(this);

        mSlideViewPager.setAdapter(DataReligion);
    }
}
