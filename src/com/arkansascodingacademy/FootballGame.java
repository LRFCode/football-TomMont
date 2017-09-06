package com.arkansascodingacademy;

public class FootballGame
{
    private Ball ball = new Ball();
    private Team homeTeam = new Team("Arkansas");
    private Team awayTeam = new Team("LSU");
    private Dice dice = new Dice();
    private Die specialTeamDie = new Die();
    private int down = 1;
    private int originalLineOfScrimage = 20;
    private int yardsToFirstDown = 10;


    public void playGame()
    {
        final int WINNING_SCORE = 28;
        boolean gameOver = false;

        while (!gameOver)
        {
            System.out.println(down + " Down");
            play();
            if (homeTeam.getScore() >= WINNING_SCORE)
            {
                gameOver = true;
            }
        }
    }

    public void play()
    {
        dice.roll();

        if (dice.getTotalValue() == 2)
        {
            System.out.println("Touchdown");
            //TODO
        } else if (dice.getTotalValue() == 3)
        {
            System.out.println("Interception 10 yards down field");
            //TODO
        } else if (dice.getTotalValue() == 5)
        {
            System.out.println("Quarterback sack lose 10 yards");
            ball.moveBackward(10);
            yardsToFirstDown += 10;
        } else if (dice.getTotalValue() == 7)
        {
            System.out.println("Incomplete Pass");

        } else if (dice.getTotalValue() == 9)
        {
            System.out.println("25 yard gain");
            ball.moveForward(25);
            yardsToFirstDown -= 25;
        } else if (dice.getTotalValue() == 10)
        {
            System.out.println("No gain on run");

        } else if (dice.getTotalValue() == 6)
        {
            System.out.println("5 yard gain");
            ball.moveForward(5);
            yardsToFirstDown -= 5;

        } else if (dice.getTotalValue() == 8)
        {
            System.out.println("5 yard gain");
            ball.moveForward(5);
            yardsToFirstDown -= 5;
        } else if (dice.getTotalValue() == 4)
        {
            System.out.println("20 yard gain on reverse");
            ball.moveForward(20);
            yardsToFirstDown -= 20;
        } else if (dice.getTotalValue() == 11)
        {
            System.out.println("Fumble lose ball");
            //TODO
        } else if (dice.getTotalValue() == 12)
        {
            System.out.println("30 yard gain");
            ball.moveForward(30);
            yardsToFirstDown -= 30;
        }

        if (yardsToFirstDown > 0)
        {
            down++;
        } else
        {
            down = 1;
            yardsToFirstDown = 10;
        }

        if (ball.getPosition() >= 100)
        {
            System.out.println("Touchdown");
            homeTeam.increaseScore(6);
        }

    }

}
