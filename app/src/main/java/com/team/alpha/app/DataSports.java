package com.team.alpha.app;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DataSports extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public DataSports(Context context){
        this.context = context;
    }

    public String[] slide_Headings = {
            "#1",
            "#2",
            "#3",
            "#4",
            "#5",
            "#6",
            "#7",
            "#8",
            "#9",
            "#10",
            "#11",
            "#12"
    };

    public String[] slide_decs = {
            "Spalding basketball has a lifespan of 10,000 bounces.The average lifespan of a Spalding basketball is 10,000 bounces. That means that, for recreational use, a basketball should last between 4-5 years.",
            "Greece is the only country to have participated in every Olympics under its own flag.",
            "The two golf balls Alan Shephard hit on the moon with a six-iron (one that went into a crater another that “sailed for miles and miles”) are still there.",
            "The highest number of runs scored in an over is not 36. It’s 77.it is bowled by RH Vance. ",
            "On 12 th January 1964, Indian spinner Bapu Nadkarni bowled 21 consecutive maiden overs vs England at Chennai. His figures were 32-27-5-0 ",
            "The longest tennis match in history took place at Wimbledon 2010, a match that lasted 11 hours and 5 minutes. ",
            "The grass at Wimbledon was kept two inches long until 1949 when an English player was bitten by a snake.",
            "India’s “Indian Premier League” /“IPL”-Cricket  is the second-richest sports league after the “National Basket Ball Association” /“NBA” of the United States of America/USA, according to Forbes agazine.",
            "The oldest cricketer to have ever played for England was Wilfred Rhodes. His last match was on 12th April 1930 when he was 52 years old.",
            "The 5 Olympic rings represent the 5 major regions of the world - Africa, the Americas, Asia, Europe and Oceania, and every national flag in the world includes one of the 5 colours",
            "Sachin Tendulkar fielded for Pakistan once,India and Pakistan were playing an exhibition match where Imran Khan's team was short on fielders. It was then that a 13-year-old Sachin was asked to field for Pakistan.",
            "Major Dhyan Chand(Hockey player) has a statue with 4 hands and 4 sticks in Austria "
    };

    @Override
    public int getCount() {
        return slide_Headings.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == (RelativeLayout) o ;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout,container,false);

        TextView slideHeading = (TextView) view.findViewById(R.id.slide_head);
        TextView slidedesc = (TextView) view.findViewById(R.id.slide_desc);

        slideHeading.setText(slide_Headings[position]);
        slidedesc.setText(slide_decs[position]);

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        container.removeView((RelativeLayout)object);

    }
}
