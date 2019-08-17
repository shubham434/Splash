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

public class DataReligion extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public DataReligion(Context context){
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
            "#12",
            "#13"
    };

    public String[] slide_decs = {

            "Most Countries Have A Majority Religion.",
            "Hindus Are Highly Geographically Concentrated.",
            "Most People Are Part Of Religious Majorities In Their Countries.",
            "China Has Huge Population Of Religiously Unaffiliated.",
            "Hinduism is the 3rd largest religion in the world, after Christianity and Islam.",
            "Hinduism actually believes in only one god, but in many forms.",
            "India is a religiously pluralistic and multiethnic democracy – the largest in the world.",
            "India also has experienced “very high” levels of religion-related social hostilities in the past decade.",
            "108 is a sacred number in Hinduism and it is considered auspicious.",
            "Both male and female deities are worshipped with equal reverence in Hinduism.",
            "Om is actually believed to be the manifestation of consciousness in sound form.",
            "Buddhism and Sikhism were both derived from Hinduism.",
            "According to Hindus, the religion has no founder or origin."


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
