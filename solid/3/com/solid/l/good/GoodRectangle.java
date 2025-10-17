package com.solid.l.good;

public class GoodRectangle implements Shape{
    private int width;
    private int height;

    public GoodRectangle(int height, int width){
        this.height = height;
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int getArea() {
        return this.height * this.width;
    }
}
