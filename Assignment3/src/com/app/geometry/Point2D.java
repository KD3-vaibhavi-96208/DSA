package com.app.geometry;

public class Point2D {
    private double x;
    private double y;

   
    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    
    public String getDetails() {
        return "Point (x=" + x + ", y=" + y + ")";
    }

    
    public boolean isEqual(Point2D anotherPoint) {
        return this.x == anotherPoint.x && this.y == anotherPoint.y;
    }

 
    public double calculateDistance(Point2D anotherPoint) {
        return Math.sqrt(
                Math.pow(this.x - anotherPoint.x, 2) +
                Math.pow(this.y - anotherPoint.y, 2)
        );
    }
}