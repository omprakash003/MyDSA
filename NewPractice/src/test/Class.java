package test;

public class Class {
    private static final float pi=3.14f;
    public static int Volume(int side){
        return side*side*side;
    }
    public static int Volume(int length,int height,int breadth){
        return length*breadth*height;
    }
    public static double Volume(int radius,int height){
        return pi*(radius*radius)*height;
    }

    public static void main(String[] args) {
        System.out.println(Volume(2,4,5));
    }
}
