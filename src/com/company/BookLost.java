package com.company;

public class BookLost extends Lost {
    private String att;

    public BookLost(String name,int date,String loc)
    {
        super(name,date,loc);
        att="B";
    }
}
