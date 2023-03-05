package com.malarska;

public class Square<T extends Number> {
    private T wall;

    public Square(T wall) {
        this.wall = wall;
    }

    public T getWall() {
        return wall;
    }

    public void setWall(T wall) {
        this.wall = wall;
    }

    @Override
    public String toString() {
        return "Square{" +
                "wall=" + wall +
                '}';
    }

    public double getSurfaceArea(){
        double wall = this.wall.doubleValue();
        return wall*wall;
    }
}
