package com.malarska;

public class Example1 {
    public static void main(String[] args) {
        Square<Integer>  integerSquare = new Square<>(15);
        System.out.println("int square area: "+ integerSquare.getSurfaceArea());

        Square<Float> floatSquare = new Square<>(5.7f);
        System.out.println("float square area: "+floatSquare.getSurfaceArea());
    }
}
