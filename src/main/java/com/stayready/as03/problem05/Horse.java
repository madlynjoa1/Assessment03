package com.stayready.as03.problem05;

public class Horse implements Animal {
    String movi="";
    Integer speed=0;
    String color="";

    @Override
    public String move() {
    return "gallop";

    }

    @Override
    public int getSpeed() {
        return 40;

    }

    @Override
    public String color() {
        return"brown";

    }
}
