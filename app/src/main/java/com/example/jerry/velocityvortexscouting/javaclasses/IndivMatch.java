package com.example.jerry.velocityvortexscouting.javaclasses;

/**
 * Created by Jerry on 5/29/2017.
 */

class IndivMatch {

    //Remember these are individual contributions to the alliance
    private Team teamParticipating;
    private Boolean isRed;
    private Boolean isCorner;
    private int matchNum;
    private int autoBallsCenter;
    private int autoBallsCorner;
    private Boolean autoCornerPark;
    private Boolean autoCenterPark;
    private int autoBeacons;
    private int teleBallsCenter;
    private int teleBallsCorner;
    //0 is on the ground, 1 is high, 2 is capped
    private int capLevel;
    private int teleBeacons;

    //Constructors
    //Default constructor
    public IndivMatch()
    {
    }

    //Has teamParticipating, isRed, matchNum
    public IndivMatch(Team t, boolean r, int m)
    {
        teamParticipating = t;
        isRed = r;
        matchNum = m;
    }

    //Has everything
    public IndivMatch(Team t, boolean r, boolean i, int m, int aBCenter, int aBCorner, boolean aCenterP, boolean aCornerP, int aBeacons, int tBallsCenter, int tBallsCorner, int cL, int tBeacons)
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

    public void setAutoBallsCenter(int a)
    {
        autoBallsCenter = a;
    }

    public void setAutoBallsCorner(int a)
    {
        autoBallsCorner = a;
    }

    public void setAutoCornerPark(boolean a)
    {
        autoCornerPark  = a;
    }

    public void setAutoCenterPark(boolean a)
    {
        autoCenterPark = a;
    }

    public void setAutoBeacons(int a)
    {
        autoBeacons = a;
    }

    public void setTeleBallsCenter(int t)
    {
        teleBallsCenter = t;
    }

    public void setTeleBallsCorner(int t)
    {
        teleBallsCorner = t;
    }

    public void setCapLevel(int c)
    {
        capLevel = c;
    }
    public void setTeleBeacons(int t)
    {
        teleBeacons = t;
    }

    //Getters

    public Team getTeamParticipating()
    {
        return teamParticipating;
    }

    public Boolean getIsRed()
    {
        return isRed;
    }

    public Boolean getIsCorner()
    {
        return isCorner;
    }

    public int getMatchNum()
    {
        return matchNum;
    }

    public int getAutoBallsCenter()
    {
        return autoBallsCenter;
    }

    public int getAutoBallsCorner()
    {
        return autoBallsCorner;
    }

    public boolean getAutoCornerPark()
    {
        return autoCornerPark;
    }

    public boolean getAutoCenterPark()
    {
        return autoCenterPark;
    }

    public int getAutoBeacons()
    {
        return autoBeacons;
    }

    public int getTeleBallsCenter()
    {
        return teleBallsCenter;
    }

    public int getTeleBallsCorner()
    {
        return teleBallsCorner;
    }

    public int getCapLevel()
    {
        return capLevel;
    }
    public int getTeleBeacons()
    {
        return teleBeacons;
    }

    //Other Methods

}
