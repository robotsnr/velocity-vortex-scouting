package com.example.jerry.velocityvortexscouting.javaclasses;

/**
 * Created by Jerry on 6/2/2017.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.example.jerry.velocityvortexscouting.R;

public class Adapter extends BaseAdapter{

    private  Context mContext;
    private  Button[] buttonsA;
    public Button currentButton;

    // 1
    public Adapter(Context context, Button[] b) {
        this.mContext = context;
        this.buttonsA = b;
    }

    // 2
    @Override
    public int getCount() {
        return buttonsA.length;
    }

    // 3
    @Override
    public long getItemId(int position) {
        return 0;
    }

    // 4
    @Override
    public Object getItem(int position) {
        return null;
    }

    // 5
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // 1
        currentButton = buttonsA[position];

        // 2
        if (convertView == null) {
            final LayoutInflater layoutInflater = LayoutInflater.from(mContext);
            convertView = layoutInflater.inflate(R.layout.linearlayout_button, null);
        }

        // 3
        currentButton = (Button)convertView.findViewById(R.id.buttonDisplay);
        currentButton.setText("Match " + (position/4+1) + " " + (position%4));



        // 4


        return convertView;
    }







}

