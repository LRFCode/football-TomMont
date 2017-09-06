package com.arkansascodingacademy;

import java.util.Random;

public class Die
{
    private int rolledNumber;
    private Random random = new Random();

    public Die()
    {
        roll();
    }

    public void roll()
    {
        rolledNumber = random.nextInt(6) + 1;
    }

    public int getValue()
    {
        return rolledNumber;
    }

}
