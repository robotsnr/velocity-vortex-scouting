package com.example.jerry.velocityvortexscouting.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.jerry.velocityvortexscouting.R;
import com.example.jerry.velocityvortexscouting.javaclasses.Competition;
import com.example.jerry.velocityvortexscouting.Activities.CompetitionMainScreen;
import java.util.ArrayList;

public class MakeNewCompetition extends TitleScreen {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_new_competition);

    }

    public void onPressCreateCompetition(View view){

        EditText compName = (EditText) findViewById(R.id.competitionNameInput);
        EditText numberOfMatches = (EditText) findViewById(R.id.competitionNumberOfMatchesInput);

        String compNameString = compName.getText().toString();
        int numberOfMatchesInt = Integer.parseInt(numberOfMatches.getText().toString());

        currentCompetitionIndex = competitions.size();
        competitions.add(new Competition(compNameString,numberOfMatchesInt));
        currentCompetition = competitions.get(currentCompetitionIndex);

        Intent intent = new Intent(this, CompetitionMainScreen.class);
        startActivity(intent);
    }
}
