package com.example.jerry.velocityvortexscouting.javaclasses;

import java.util.ArrayList;

/**
 * Created by Jerry on 5/29/2017.
 */

public class Competition {

    //Instant variables
    private String competitionName;
    private ArrayList<Team> listTeams;
    private ArrayList<Match> listMatches;

    //Default constructor
    Competition()
    {
        competitionName = "";
        listTeams = new ArrayList<Team>(0);
        listMatches = new ArrayList<Match>(0);
    }

    //Constructor with name, teams and matches (used to open already finished competitions)
    Competition(String competitionNameInput, ArrayList<Team> listTeamsInput, ArrayList<Match> listMatchesInput)
    {
        competitionName = competitionNameInput;
        listTeams = listTeamsInput;
        listMatches = listMatchesInput;
    }

    //Constructor with name and number of matches (used to start new competition)
    Competition(String competitionNameInput, int numMatches)
    {
        competitionName = competitionNameInput;
        listMatches = new ArrayList<Match>(numMatches);
    }

    //Setters
    //Setter to set competition name
    public void setCompetitionName(String competitionNameInput)
    {
        competitionName = competitionNameInput;
    }

    //Getters
    //Getter to get number of matches
    public int getNumMatches()
    {
        return listMatches.size();
    }

    //Get competition name
    public String getCompetitionName()
    {
        return competitionName;
    }

    //General methods
    public void compileTeamList()
    {
        ArrayList listOfTeams = new ArrayList<Team>(0);
        for (Match m : listMatches)
        {
            for(Team t : m.getTeamsInMatch())
            {
                if(findTeamBinary(t,listOfTeams)==-1)
                {
                    listOfTeams.add(findTeamBinary(t,listOfTeams),t);
                }
            }
        }
    }

    private int findTeamBinary(Team key, ArrayList <Team> data)
    {
        int low = 0;
        int high = data.size() - 1;
        while(high >= low)
        {
            int middle = (low + high) / 2;
            if(data.get(middle).compareTo(key)==0)
                return middle;
            if(data.get(middle).compareTo(key)==-1)
                low = middle + 1;
            if(data.get(middle).compareTo(key)==1)
                high = middle - 1;
        }
        return -1;
    }

}