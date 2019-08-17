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

public class DataPeople extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public DataPeople(Context context){
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
            "The people who give the best advice are usually the ones with the most problems.",
            "The way a person treats restaurant staff reveals a lot about their character.",
            "People who have a strong sense of guilt are better at understanding other people’s thoughts and feelings.",
            "Men are not funnier than women: they just make more jokes, not caring whether other people like their humor or not.",
            "Good morning and good night text messages activate the part of the brain responsible for happiness.",
            "When you hold the hand of a loved one, you feel pain less keenly and worry less.",
            "Doing things that scare you will make you happier.",
            "People who speak two languages may unconsciously shift their personalities when they switch from one language to another.",
            "Intelligent people tend to have less friends than the average person. The smarter the person is, the more selective they become.",
            "People look more attractive when they speak about the things they are really interested in.",
            "Marrying your best friend eliminates the risk of divorce by over 70%, and this marriage is more likely to last a lifetime.",
            "Women generally prefer men with deep husky voices because they seem more confident and not aggressive."

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
