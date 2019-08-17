package com.team.alpha.app;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Animal extends AppCompatActivity {

    private ViewPager mSlideViewPager;
    private DataAnimal DataAnimal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal);

        mSlideViewPager = (ViewPager) findViewById(R.id.slideViewPager);

        DataAnimal = new DataAnimal(this);

        mSlideViewPager.setAdapter(DataAnimal);

    }
}
