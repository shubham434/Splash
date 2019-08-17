package com.team.alpha.app;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Nature extends AppCompatActivity {

    private ViewPager mSlideViewPager;
    private DataNature DataNature;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nature);

        mSlideViewPager = (ViewPager) findViewById(R.id.slideViewPager);

        DataNature = new DataNature(this);

        mSlideViewPager.setAdapter(DataNature);
    }
}
