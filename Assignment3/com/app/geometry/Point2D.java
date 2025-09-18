package com.app.geometry;

public class Point2D
{
    private double x;
    private double y;

    public Point2D(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public String getDetails()
    {
        return ("X" + x +  " Y"+ y );
    }

    public boolean isEqual(Point2D p)
    {
        return x == p.x && y == p.y;
    }

    public double calculateDistance(Point2D p) 
    {
        return Math.sqrt((x - p.x) * (x - p.x) + (y - p.y) * (y - p.y));
    }
}

