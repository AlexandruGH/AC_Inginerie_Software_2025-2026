package com.solid.s.good;

public class GoodEmployee {
    private String status;
    private String name;
    private int hours;

    public GoodEmployee(String status, String name, int hours){
        this.status = status;
        this.name = name;
        this.hours = hours;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public String toString(){
        return "GoodEmployee";
    }
}
