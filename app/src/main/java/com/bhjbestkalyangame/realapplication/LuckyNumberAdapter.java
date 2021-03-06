package com.bhjbestkalyangame.realapplication;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;
import java.util.Random;

import static android.media.CamcorderProfile.get;


class LuckyNumberAdapter extends BaseAdapter {

        Context mContext;
        List<String> values;
        int j = 0;

    public LuckyNumberAdapter(Context mContext, List<String> values) {
        this.mContext = mContext;
        this.values = values;
    }

    @Override
    public int getCount() {
        return values.size()+1;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        j = i+1;

        if(view == null){
            view = mInflater.inflate(R.layout.lucky_number_item, null);
            TextView LuckyNumber = view.findViewById(R.id.luckynumber_textview);
            TextView mGessNumber = view.findViewById(R.id.luckynumber_gess_number);
            if(i != values.size()) {


               // LinearLayout mLayout = view.findViewById(R.id.lucky_background);
                mGessNumber.setText("Super No. " + j);
                LuckyNumber.setText(values.get(i));

              //Random rnd = new Random();
             // int currentStrokeColor = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
            //            LuckyNumber.setTextColor(currentStrokeColor);
           //            mLayout.setBackgroundColor(currentStrokeColor);

            }else{
                mGessNumber.setText("End");
                LuckyNumber.setText("...");
            }

        }else{
            TextView LuckyNumber = view.findViewById(R.id.luckynumber_textview);
            TextView mGessNumber = view.findViewById(R.id.luckynumber_gess_number);
            if(i != values.size()) {


                // LinearLayout mLayout = view.findViewById(R.id.lucky_background);
                mGessNumber.setText("Super No. " + j);
                LuckyNumber.setText(values.get(i));

                //Random rnd = new Random();
                // int currentStrokeColor = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
                //            LuckyNumber.setTextColor(currentStrokeColor);
                //            mLayout.setBackgroundColor(currentStrokeColor);

            }else{
                mGessNumber.setText("End");
                LuckyNumber.setText("...");
            }
        }



        return view;

    }
}
