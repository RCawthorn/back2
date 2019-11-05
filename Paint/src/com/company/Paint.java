package com.company;

public class Paint {
    public void addToScreen(Shape shape) {

        shape.draw();


    }
    public static void main(String[] args) {
        Paint application = new Paint();
        application.addToScreen (new rect());
        application.addToScreen(new circle());
    }
}

class rect implements Shape{
    public void draw(){
        //draw rectangle
        System.out.println("This is a Triangle");
    }
}

class circle implements Shape{
    public void draw(){
        //draw a circle
    }
}

