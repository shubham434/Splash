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

public class DataRecords extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public DataRecords(Context context){
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
            "Former president of Liberia Charles King holds the Guinness World record for the most fraudulent election ever having won the 1927 election with 234,000 votes in a country of 15,000 voters. ",
            "An airplane crashed into the Empire State Building in 1945. Among other damages, plane parts severed the cables for an elevator and the woman (Betty Lou Oliver) inside fell over 70 stories. She lived and holds the world record for the longest survived elevator fall. ",
            "Iran tried to get into the Guinness book of world records by making the world's largest sandwich. But people started eating it before it could be officially measured so they failed. ",
            " The world record for the largest number ever counted to belongs to Jeremy Harper. He streamed the entire process online and raised money for charity. He reached 1,000,000. It took him 3 months. ",
            "The sixth sick sheik's sixth sheep's sick is listed by the Guinness Book of Records as the hardest tongue twister in the world. ",
            "Thomas Silverstein holds the world record for being isolated from the rest of the world. He has been in solitary confinement since 1983 and is still going. ",
            "The world record for long-distance archery is held by a guy named Matt Stutzman with no arms. ",
            "In 1983, hundreds of workers broke a world record by building a 3 bedroom home in just 3 hours. It was later sold to buyers who weren't told about home's origin. The home was an instant nightmare: uneven slab, burst pipes, flawed roof, mismatched paint, buckled walls, crooked doors, faulty sewer, etc. ",
            "On January 22, 1943, the temperature in Spearfish, South Dakota, changed from -4°F to 45°F in just two minutes, setting a world record. This was caused by a Chinook wind, which increased the temperature eventually up to 54°F before dying down, dropping the temperature back to -4°F. ",
            "Jonathan Lee Riches got the Guinness world record for having filed the highest number of lawsuits in the world. When he heard of this, he sued the Guinness Book of World Records.!!!",
            "Belgium beat Iraq to get the world record for having no government for the longest time (250 days in 2011). ",
            "Eminem set the world record with 1560 words in 6 min 4 seconds and averaging 4.28 words per second in his single - Rap God."
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
