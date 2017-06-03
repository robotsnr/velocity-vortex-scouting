package com.example.jerry.velocityvortexscouting.javaclasses;

/**
 * Created by Jerry on 6/2/2017.
 */

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

public class Adapter extends BaseAdapter {

    private  Context mContext;
    private  Button[] buttonsA;

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
        TextView dummyTextView = new TextView(mContext);
        dummyTextView.setText(String.valueOf(position));
        return dummyTextView;
    }

}

