package com.test;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        System.out.println("initial position : \n");
        p1.show();
        p2.show();
        p1.deplace(5, 4);
        System.out.println("after moving p1 : ");
        p1.show();
        float distance = p1.distance(p2);
        System.out.println("distance btw p1 and p2 :" + distance);
        ArrayList<Point> vector = new ArrayList<>();
        vector.add(p1);
        vector.add(p2);
        vector.add(new Point(1,2));
        regression y = new regression(vector);
        y.showslope();
        y.showintercept();
        y.showcorrelation();
        System.out.println(y.predict_y(2));



    }
}

