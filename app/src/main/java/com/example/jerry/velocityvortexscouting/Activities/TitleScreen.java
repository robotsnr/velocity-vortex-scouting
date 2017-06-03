package com.example.jerry.velocityvortexscouting.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.jerry.velocityvortexscouting.Activities.MakeNewCompetition;
import com.example.jerry.velocityvortexscouting.R;
import com.example.jerry.velocityvortexscouting.javaclasses.Competition;

import java.util.ArrayList;

public class TitleScreen extends AppCompatActivity {

    public static int currentCompetitionIndex = -1;
    public static ArrayList<Competition> competitions = new ArrayList<>();
    public static Competition currentCompetition = new Competition();

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
