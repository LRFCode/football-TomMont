package com.arkansascodingacademy;

public class Dice
{
    private Die die1 = new Die();
    private Die die2 = new Die();

    public void roll()
    {
        die1.roll();
        die2.roll();
    }

    public int getTotalValue()
    {
        return die1.getValue() + die2.getValue();
    }

}
