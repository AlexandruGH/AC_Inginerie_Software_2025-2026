package com.solid.l.good;

import com.solid.l.bad.BadRectangle;
import com.solid.l.bad.BadSquare;

public class GoodGraphicsService {
    public void checkForArea(Shape shape) {
        int height = 29;
        int width = 40;

        int side = 20;

        if (shape instanceof GoodSquare) {
            ((GoodSquare)shape).setSide(side);
            verify(shape, side, "Square");
        } else if (shape instanceof GoodRectangle){
            ((GoodRectangle)shape).setHeight(height);
            ((GoodRectangle)shape).setWidth(width);
            verify(shape, width, height, "Rectangle");
        }
    }

    private void verify(Shape shape, int width, int height, String entity) {
        if (shape.getArea() == (width * height)) {
            System.out.println("Great " + entity + " you got there!");
        } else {
            System.out.println("Well, not a " + entity + ".");
        }
    }

    private void verify(Shape shape, int side, String entity) {
        if (shape.getArea() == (side * side)) {
            System.out.println("Great " + entity + " you got there!");
        } else {
            System.out.println("Well, not a " + entity + ".");
        }
    }

}
