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

public class DataNational extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public DataNational (Context context){
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
            "India has the largest postal network in the world with over 1, 55,015 post offices. There is a floating post office in Dal Lake, Srinagar, was inaugurated in August 2011.",
            "Kumbh Mela gathering is visible from space. The 2011 Kumbh Mela was the largest gathering of people with over 75 million pilgrims. The gathering was so huge that the crowd was visible from space. ",
            "Bandra Worli Sealink has steel wires equal to the earth's circumference. It took a total of 2,57,00,000 man hours for completion and also weighs as much as 50,000 African elephants. A true engineering and architectural marvel. ",
            "At an altitude of 2,444 meters, the Chail Cricket Ground in Chail, Himachal Pradesh, is the highest in the world. It was built in 1893 and is a part of the Chail Military School. ",
            "In September 2009, India's ISRO Chandrayaan- 1 using its Moon Mineralogy Mapper detected water on the moon for the first time. ",
            "Elephants receive baths, massages and even food at the Punnathoor Cotta Elephant Yard Rejuvenation Centre in Kerala. Now that's a BIG step for the country. ",
            "Freddie Mercury and Ben Kingslay are both of indian descent. Freddie Mercury, the legendary singer of the rock band 'Queen' was born a Parsi with the name Farrokh Bulsara while the famous Oscar winning Hollywood star Ben Kingsley was born Krishna Pandit Bhanji.",
            "Mawsynram, a village on the Khasi Hills, Meghalaya, receives the highest recorded average rainfall in the world. Cherrapunji, also a part of Meghalaya, holds the record for the most rainfall in the calendar year of 1861.",
            "India recently overtook the European Union with production reaching over 132.4m tonnes in 2014.",
            "Rabindranath Tagore is credited not only for writing the Indian national anthem, Jana Gana Mana, but the Bangladeshi national anthem, Amar Sonar Bangla, as well. He was also offered knighthood by the British but refused the honour after the Jalianwala Bagh massacre.",
            "Initially, diamonds were only found in the alluvial deposits in Guntur and Krishna District of the Krishna River Delta. Until diamonds were found in Brazil during the 18th century, India led the world in diamond production.",
            "India has more than 450 actively spoken languages and 22 official ones."
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
