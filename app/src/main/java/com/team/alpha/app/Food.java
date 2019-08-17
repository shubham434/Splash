package com.team.alpha.app;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Food extends AppCompatActivity {

    private ViewPager mSlideViewPager;
    private DataFood DataFood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        mSlideViewPager = (ViewPager) findViewById(R.id.slideViewPager);

        DataFood = new DataFood(this);

        mSlideViewPager.setAdapter(DataFood);
    }
}
