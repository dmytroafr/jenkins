package com.echem;

public class Car implements Machine{
    @Override
    public String drive() {
        System.out.println("car drive");
        return "car drive";
    }

    @Override
    public String stop() {
        System.out.println("car stop");
        return "car stop";
    }

    @Override
    public String turnLeft() {
        System.out.println("car turn left");
        return "car turn left";
    }

    @Override
    public String turnRight() {
        System.out.println("car turn right");
        return "car turn right";
    }
}
