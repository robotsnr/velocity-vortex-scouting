package com.example.jerry.velocityvortexscouting.javaclasses;

import android.support.annotation.NonNull;

import java.util.ArrayList;

/**
 * Created by Jerry on 5/29/2017.
 */

public class Team implements Comparable<Team>{

    private String teamName;
    private final int teamNumber;
    private ArrayList<IndivMatch> teamPerformance;

    //Constructors
    //Default
    public Team()
    {
        teamName = "";
        teamNumber = -1;
    }

    //Only teamNumber
    public Team(int teamNumberInput)
    {
        teamNumber = teamNumberInput;
    }

    //Has teamName and teamNumber
    public Team(int teamNumberInput, String teamNameInput)
    {
        teamNumber = teamNumberInput;
        teamName = teamNameInput;
    }

    //Has teamName, teamNumber and teamPerformance
    public Team(int teamNumberInput, String teamNameInput, ArrayList<IndivMatch> teamPerformanceInput)
    {
        teamNumber = teamNumberInput;
        teamName = teamNameInput;
        teamPerformance = teamPerformanceInput;
    }

    //Setters
    //This method sets the team name
    public void setTeamName(String inputTeamName)
    {
        teamName = inputTeamName;
    }

    //Getters
    //Gets the team name
    public String getTeamName()
    {
        return teamName;
    }

    //Gets the team number
    public int getTeamNumber()
    {
        return teamNumber;
    }

    //Compare to, if the team in parenthesis is greater than the one outside, returns 1
    //if the team in parenthesis is less than the one outside, returns -1, else returns 0
    public int compareTo(@NonNull Team o) {
        if(teamNumber>o.getTeamNumber())
            return 1;
        if(teamNumber<o.getTeamNumber())
            return -1;
        return 0;
    }
}
