package com.test;

public class Point {
    private float x;
    private float y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void deplace(float dx, float dy) {
        x += dx;
        y += dy;
    }

    public float distance(Point p) {
        float x1 = (this.x - p.getX()) * (this.x - p.getX());
        float y1 = (this.y - p.getY()) * (this.y - p.getY());
        float d = (float) Math.sqrt((x1 + y1));
        return d;
    }

    public void show() {
        System.out.println("(" + this.x + "," + this.y + ")");
    }

}
