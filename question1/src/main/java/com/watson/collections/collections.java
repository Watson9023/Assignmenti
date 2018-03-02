package com.watson.collections;

public class collections {

    private String meki;
    private String model;
    private int year;

    public void setVehicle(String meki,String model, int year)
    {
        this.meki = meki;
        this.model= model;
        this.year = year;
    }

    public void setMake(String meki)
    {
        this.meki = meki;
    }

    public void setModel(String model)
    {
        this.model= model;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public String getMeki()
    {
        return meki;
    }

    public String getModel()
    {
        return model;
    }

    public int getYear()
    {
        return year;
    }

    public String toString()
    {
        return "Make: " + getMeki() + "\nModel: " + getModel() + "\nYear: " + getYear();
    }
}
