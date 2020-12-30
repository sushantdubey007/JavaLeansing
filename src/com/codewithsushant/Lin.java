package com.codewithsushant;

public class Lin implements canvas{
    int x1,x2,y1,y2;
    public Lin(int x1, int x2, int y1, int y2){
        this.x1=x1;
        this.x2=x2;
        this.y1=y1;
        this.y2=y2;
    }
    public void draw(){
        System.out.println("Draw line between x1->"+x1+"y1->"+y1+"x2->"+x2+"y2->"+y2);
    }
}
