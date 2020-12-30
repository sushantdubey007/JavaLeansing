package com.codewithsushant;

public class cir implements canvas{
    private double x,y,red;
    public cir(double x, double y, double red){
        this.x=x;
        this.y=y;
        this.red=red;
    }
    public void draw(){
        System.out.println("X1->"+x+"Y1->"+y+"red->"+red);
    }
}
