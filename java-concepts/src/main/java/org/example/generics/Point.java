package org.example.generics;

class Point {
    private int x;
    private int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {

        if(this==obj) return true;
        if(obj==null || obj instanceof Point) {
            Point p=(Point)obj;
            return p.x==x && p.y==y;
        }
        return false;
    }

    @Override
    public int hashCode() {
        // complete the code here
        return x+y;
    }
}