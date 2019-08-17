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

public class DataTechnology extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public DataTechnology (Context context){
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
            "If you remove all the empty space between all the atoms of earth, The earth could be a lot smaller may be equal to a size of a grain.",
            "The world's first webpage went live on 6th august 1991, It outlined how to create Web pages and explained more about hypertext. you can access the website by going to http://info.cern.ch.",
            "If you wish to have your picture captured by the worlds first camera then you will need to stay still for 8 hours.",
            "The cheapest microscope costs 50 cents to $1 with the magnification power of 140X. Yes, you read it right 140X magnifying power for ~50 cents. This microscope is made of paper and other cheap materials. It is called “Foldscope”.",
            "Seven people can restart the internet. These seven people have a key and if they decide to use it from a secure location, they can restart the internet.",
            "There are 6.8 billion people on the planet and 4 billion of them use a mobile phone. Only 3.5 billion of them use a toothbrush.",
            "Inside original Macintosh case you will find 47 signatures for each members of Apple's macintosh division as of 1982.",
            "A teaspoon of neutron star would weigh about 10 million tons. Neutron stars are very very dense.",
            "Of the 60 billion emails that are sent on a daily basis, 97 percent are considered spam.",
            "Bill Gates house was designed using a macintosh computer",
            "If you were to have your picture taken by the very first camera, you'd need to sit still for 8 hours",
            "Although GPS is free to use, it costs $2 million per day to operate. the money comes from American tax revenue."
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
