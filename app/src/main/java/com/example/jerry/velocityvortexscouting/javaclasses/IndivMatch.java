package com.example.jerry.velocityvortexscouting.javaclasses;

/**
 * Created by Jerry on 5/29/2017.
 */

class IndivMatch {

    //Remember these are individual contributions to the alliance
    Team teamParticipating;
    Boolean isRed;
    Boolean isCorner;
    int matchNum;
    int autoBallsCenter;
    int autoBallsCorner;
    Boolean autoCornerPark;
    Boolean autoCenterPark;
    int autoBeacons;
    int teleBallsCenter;
    int teleBallsCorner;
    //0 is on the ground, 1 is high, 2 is capped
    int capLevel;
    int teleBeacons;

    //Constructors
    //Default constructor
    IndivMatch()
    {
    }

    //Has teamParticipating, isRed, matchNum
    IndivMatch(Team t, boolean r, int m)
    {
        teamParticipating = t;
        isRed = r;
        matchNum = m;
    }

    //Has everything
    IndivMatch(Team t, boolean r, boolean i, int m, int aBCenter, int aBCorner, boolean aCenterP, boolean aCornerP, int aBeacons, int tBallsCenter, int tBallsCorner, int cL, int tBeacons)
    {
        teamParticipating = t;
        isRed = r;
        isCorner = i;
        matchNum = m;
        autoBallsCenter = aBCenter;
        autoBallsCorner = aBCorner;
        autoCornerPark = aCornerP;
        autoCenterPark = aCenterP;
        autoBeacons = aBeacons;
        teleBallsCenter = tBallsCenter;
        teleBallsCorner = tBallsCorner;
        capLevel = cL;
        teleBeacons = tBeacons;
    }

    //Setters
    public void setTeamParticipating(Team s)
    {
        teamParticipating = s;
    }

    public void setIsRed(Boolean i)
    {
        isRed = i;
    }

    public void setIsCorner(Boolean i)
    {
        isCorner = i;
    }

    public void setMatchNum(int m)
    {
        matchNum = m;
    }
   /* int autoBallsCenter;
    int autoBallsCorner;
    Boolean autoCornerPark;
    Boolean autoCenterPark;
    int autoBeacons;
    int teleBallsCenter;
    int teleBallsCorner;
    //0 is on the ground, 1 is high, 2 is capped
    int capLevel;
    int teleBeacons;*/
    //Getters

}
