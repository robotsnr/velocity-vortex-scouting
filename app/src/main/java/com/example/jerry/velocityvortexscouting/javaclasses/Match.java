package com.example.jerry.velocityvortexscouting.javaclasses;

import java.lang.reflect.Array;

/**
 * Created by Jerry on 5/29/2017.
 */

class Match {

    //Instance variables
    IndivMatch indivMatches[] = new IndivMatch[4];
    Team teamsInMatch[] = new Team[4];
    int matchNum;

    //Constructors
    //Default constructor
    Match()
    {
    }

    //Only matchNum
    Match(int matchNumInput)
    {
        matchNum = matchNumInput;
    }

    //MatchNum and indivMatches
    Match(int matchNumInput, IndivMatch[] inputIndivMatches)
    {
        matchNum = matchNumInput;
        indivMatches = inputIndivMatches;
        for(int i = 0; i<teamsInMatch.length; i++)
        {
            teamsInMatch[i] = indivMatches.getTeam();
        }
    }

    //Setters
    //Set the indivMatch of a match, index 0-3 is the index in the match
    public void setIndivMatch(int index, IndivMatch inputIndivMatch)
    {
        indivMatches[index] = inputIndivMatch;
    }

    //Getters
    //Gets the match number
    public int getMatchNum() {
        return matchNum;
    }

    //Gets the teams in match (array)
    public Team[] getTeamsInMatch(){
        return teamsInMatch;
    }
}

