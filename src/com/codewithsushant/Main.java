package com.codewithsushant;

public class Main {

    public static void main(String[] args) {
        double x,y,red;
        x=10.5;
        y=25.6;
        red=2.5;
        canvas c = new cir(x,y,red);
        canvas r = new rect(10.5,11.4,2.5,6.6);
        canvas l = new Lin(0,0,10,10);
        c.draw();
        r.draw();
        l.draw();
    }
}
