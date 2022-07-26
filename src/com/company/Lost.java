package com.company;

public class Lost {
    private String name;
    private int date;
    private String loc;

    public Lost(String name,int date,String loc)
    {
        this.name=name;
        this.date=date;
        this.loc=loc;
    }

    public String getName()
    {
        return name;
    }

    public int getDate()
    {
        return date;
    }

    public String getLoc()
    {
        return loc;
    }


}
