package com.example.jerry.velocityvortexscouting.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.jerry.velocityvortexscouting.Activities.MakeNewCompetition;
import com.example.jerry.velocityvortexscouting.R;

public class TitleScreen extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title_screen);
    }

    /** Called when the user taps the Send button */
    public void startNewCompetition (View view) {
        Intent intent = new Intent(this, MakeNewCompetition.class);

        startActivity(intent);
    }
}
