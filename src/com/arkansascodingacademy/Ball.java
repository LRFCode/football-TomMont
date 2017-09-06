package com.arkansascodingacademy;

public class Ball
{
    private int position = 20;

    public int getPosition()
    {
        return position;
    }

    public void moveForward(int yards)
    {
        position += yards;

    }

    public void moveBackward(int yards)
    {
        position -= yards;
    }

    public void printYardLine()
    {
        if (position < 50)
        {
            System.out.println("Team 1 " + position + " Yard Line");
        }
        else if (position == 50)
        {
            System.out.println(position + " Yard Line");
        }
        else //position > 50
        {
            System.out.println("Team 2 " + (100 - position) + " Yard Line");
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Testing Ball");

        Ball ball = new Ball();

        ball.printYardLine();
        ball.moveForward(30);
        ball.printYardLine();
        ball.moveBackward(20);
        ball.printYardLine();
        ball.moveForward(60);
        ball.printYardLine();
    }
}
