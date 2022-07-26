package com.company;

public class CardLost extends Lost{
    private String att;

    public CardLost(String name,int date,String loc)
    {
        super(name,date,loc);
        att="c";
    }
}
