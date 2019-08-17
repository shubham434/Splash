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

public class DataNature extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public DataNature(Context context){
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
            "There are 12 times more trees on Earth than stars in the Milky Way.",
            "Pineapples take two years to grow",
            "Pluto hasn’t made a full orbit around the sun since it was discovered in 1930",
            "Dolphins will talk to one another over the phone and can even recognize each other’s voice.",
            "A cockroach can live for up to several weeks without a head.",
            "Venezuela’s Lake Maracaibo has the most lightning on the planet. There are 150 nights of lightning per year, 10 hours a day and approximately 280 times per hour.",
            "Artificial vanilla flavour is created from extract from beavers bums.",
            "Unborn Tiger Sharks eat each other’s embryos.",
            "USA   bought Alaska from Russia for 2 cents an acre.",
            "Venus is the only planet that rotates clockwise.",
            "The first domain name ever registered was ”symbolics.com” .",
            "The Meganeura dragonfly lived 300 million years ago and was no small pest. It had a wingspan measuring over 2 feet wide."




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
