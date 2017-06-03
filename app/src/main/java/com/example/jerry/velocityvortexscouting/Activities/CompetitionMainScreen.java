package com.example.jerry.velocityvortexscouting.Activities;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.example.jerry.velocityvortexscouting.R;
import com.example.jerry.velocityvortexscouting.javaclasses.Adapter;
import com.example.jerry.velocityvortexscouting.javaclasses.Competition;

import java.util.ArrayList;

import static android.R.interpolator.linear;

public class CompetitionMainScreen extends MakeNewCompetition {


    Button[] buttonsA = new Button[5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_competition_main_screen);

        String competition_name = currentCompetition.getCompetitionName();

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(competition_name);

        GridView gridView = (GridView)findViewById(R.id.gridview);
        Adapter adapter = new Adapter(this, buttonsA);
        gridView.setAdapter(adapter);
        //addButtons();


    }

    public void addButtons()
    {

        TableLayout tableLayout = new TableLayout(this);

        for (int i = 0; i < 3; i++) {

            TableRow row = new TableRow(this);

            for (int j = 0; j < 4; j++) {
                Button btnTag = new Button(this);
                btnTag.setLayoutParams(new Toolbar.LayoutParams(Toolbar.LayoutParams.WRAP_CONTENT, Toolbar.LayoutParams.WRAP_CONTENT));
                btnTag.setText("Button " + (j + 1 + (i * 4)));
                btnTag.setId(j + 1 + (i * 4));

                row.addView(btnTag);

            }

            tableLayout.addView(row);
        }
    }



}
