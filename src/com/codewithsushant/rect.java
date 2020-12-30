package com.codewithsushant;

public class rect implements canvas{
    private double x1,y1,x2,y2;
    public rect(double x1, double y1, double x2, double y2){
        this.x1=x1;
        this.x2=x2;
        this.y1=y1;
        this.y2=y2;
    }
    public void draw(){
        System.out.println("x1->"+x1+"y1->"+y1+"x2->"+x2+"y2->"+y2);
    }
}
