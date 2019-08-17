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

public class DataBody extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public DataBody(Context context){
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
            "Our ears never stop hearing, even when we sleep. Our brain just ignores incoming sounds",
            "Our nose is our personal air-conditioning system: it warms cold air, cools hot air and filters impurities.",
            "Our eyes are always the same size from birth but our nose and ears never stop growing.",
            " we burn more calories while sleeping than we do when watching television.",
            " The colder the room you sleep in, the better the chances are that you'll have a bad dream. ",
            " The Romans used to clean and whiten their teeth with urine.",
            " A condition called synesthesia can cause senses to overlap. In other words, some people can taste words or hear colours.",
            " The brain continues to send out electric wave signals until approximately 37 hours after death.",
            "Men listen with the left side of the brain and women use both sides of the brain.",
            "Men listen with the left side of the brain and women use both sides of the brain.",
            "It's impossible to sneeze with your eyes open.",
            "A human being can look forward to having sex an average of 2,580 times with five different partners."

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
