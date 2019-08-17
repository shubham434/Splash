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

public class DataAnimal extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public DataAnimal(Context context){
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
            " The heart of a shrimp is located in its head.",
            "A snail can sleep for three years.",
            "The fingerprints of a koala are so indistinguishable from humans that they have on occasion been confused at a crime scene.",
            "It is possible to hypnotize a frog by placing it on its back and gently stroking its stomach.",
            "Nearly three percent of the ice in Antarctic glaciers is penguin urine.",
            "Bats always turn left when leaving a cave.",
            "Frogs cannot vomit. If one absolutely has to, then it will vomit its entire stomach. ",
            "THE PEACOCK MANTIS SHRIMP CAN THROW A PUNCH AT 50 MPH, ACCELERATING QUICKER THAN A .22-CALIBER BULLET.",
            "CAPUCHIN MONKEYS PEE ON THEIR HANDS TO WASH THEIR FEET.",
            "SEA OTTERS HOLD HANDS WHILE THEY'RE SLEEPING SO THEY DON'T DRIFT APART.",
            "ANIMAL BEHAVIORISTS HAVE CONCLUDED THAT CATS DON'T MEOW AS A WAY TO COMMUNICATE WITH EACH OTHER. IT'S A METHOD THEY USE FOR GETTING ATTENTION FROM HUMANS.",
            "IN 1924, A LABRADOR RETRIEVER WAS SENTENCED TO LIFE WITHOUT PAROLE AT EASTERN STATE PENITENTIARY FOR KILLING THE GOVERNOR'S CAT."






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
