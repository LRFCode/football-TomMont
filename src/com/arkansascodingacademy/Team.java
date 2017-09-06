package com.arkansascodingacademy;

public class Team
{
    private final String name;
    private int score;

    public Team(String name)
    {
        this.name = name;
    }

    public int getScore()
    {
        return score;
    }

    public void increaseScore(int points)
    {
        score += points;
    }

    public void printScore()
    {
        System.out.println(name + " has " + score + " points");
    }

    public static void main(String[] args)
    {
       Team team = new Team("River Blades");
       team.printScore();

       team.increaseScore(40);
       team.printScore();
    }
}
