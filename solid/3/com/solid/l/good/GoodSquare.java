package com.solid.l.good;

public class GoodSquare implements Shape{
    private int side;

    public GoodSquare(int side){
        this.side = side;
    }

    public int getSide(){
        return this.side;
    }

    public void setSide(int side){
        this.side = side;
    }

    @Override
    public int getArea() {
        return this.side * this.side;
    }
}
