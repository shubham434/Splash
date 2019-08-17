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

public class DataFood extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public DataFood (Context context){
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
            "#13",
            "#14",
            "#15"
    };

    public String[] slide_decs = {
            "Apples are made of 25% air, which is why they float.",
            "Avocado has highest protein content of all fruit.",
            "Almonds are a member of the peach family.",
            "A bunch of bananas is called a hand.",
            "Noodles were invented in China, not Italy.",
            "Potatoes can absorb and reflect Wi-fi signals.",
            "Ripe cranberries will bounce like rubber balls.",
            "Grapes will explode if you put them in the microwave.",
            "Honey is made from nectar and bee vomit.",
            "An average ear of corn has an even number of rows, usually 16.",
            "Apples belong to the rose family, as do pears and plums.",
            "Chocolate was once used as currency.",
            "Coconut water can be used as blood plasma.",
            " McDonald's sells 75 hamburgers every second of every day.",
            "One of the most hydrating foods to eat is the cucumber, which is 96% water."
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
