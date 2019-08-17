package com.team.alpha.app;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Human_body extends AppCompatActivity {

    private ViewPager mSlideViewPager;
    private DataBody DataBody;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_human_body);

        mSlideViewPager = (ViewPager) findViewById(R.id.slideViewPager);

        DataBody= new DataBody(this);

        mSlideViewPager.setAdapter(DataBody);
    }
}
