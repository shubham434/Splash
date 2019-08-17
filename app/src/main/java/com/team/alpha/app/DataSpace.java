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

public class DataSpace extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public DataSpace(Context context){
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
            "THE HOTTEST PLANET IN OUR SOLAR SYSTEM IS 450° C.",
            "A FULL NASA SPACE SUIT COSTS $12,000,000.",
            "THERE MAY BE A PLANET MADE OUT OF DIAMONDS.",
            "THE FOOTPRINTS ON THE MOON WILL BE THERE FOR 100 MILLION YEARS.",
            "ONE DAY ON VENUS IS LONGER THAN ONE YEAR.",
            "IF TWO PIECES OF THE SAME TYPE OF METAL TOUCH IN SPACE THEY WILL PERMANENTLY BOND.",
            "THERE IS FLOATING WATER IN SPACE.",
            "THE SUN’S MASS TAKES UP 99.86% OF THE SOLAR SYSTEM.",
            "THERE IS A VOLCANO ON MARS THREE TIMES THE SIZE OF EVEREST.",
            "YOU CAN CRY IN SPACE BUT YOUR TEARS DON'T FALL.",
            "THE EARTH ROTATION IS GRADUALLY SLOWING",
            "THE EARTH IS THE DENSEST PLANET IN THE SOLAR SYSTEM"
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
