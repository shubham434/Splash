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

public class DataEarth extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public DataEarth (Context context){
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
            "If you could separate the Earth out into piles of material, you’d get 32.1 % iron, 30.1% oxygen, 15.1% silicon, and 13.9% magnesium. Of course, most of this iron is actually located at the core of the Earth. If you could actually get down and sample the core, it would be 88% iron. And if you sampled the Earth’s crust, you’d find that 47% of it is oxygen.",
            "When charged particles from the solar wind become trapped in Earth's magnetic field, they collide with air molecules above our planet's magnetic poles. These air molecules then begin to glow and are known as the aurorae, or the Northern and Southern Lights.",
            "Earth's rotation is gradually slowing. This deceleration is happening almost imperceptibly, at approximately 17 milliseconds per hundred years, although the rate at which it occurs is not perfectly uniform.",
            "A glass bottle made in our time will take nearly 4000 years to decompose.",
            "American companies alone use enough paper to encircle the earth 3 times.",
            "The longest mountain range on Earth, the Mid-Pacific Range, is under the ocean – and it comprises 23% of the Earths total surface!",
            "Hot Springs under the ocean with temperatures of 650 degrees Fahrenheit, hot enough to melt lead, is teeming with Life! Because of this, we are now rethinking the conditions where life can flourish.",
            "By the year 2030, we might only have 10% of Rainforests left and it can all disappear in a hundred years. 70% of our world’s plant and animal species live in forests.",
            "The water pressure at the deepest point of the ocean can be compared to a human being trying to hold 50 jumbo jets! ",
            "We have explored more of Space than our terrestrial oceans.",
            "If the entire world’s Ice melted, our sea levels will rise by 66 meters.",
            "Coral Reefs comprise only 0.5% of the ocean floor but more than 90% of our marine animals depend on them for one reason or another.We have already destroyed 27% of our coral reefs which is home to 25% of our marine life."
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
