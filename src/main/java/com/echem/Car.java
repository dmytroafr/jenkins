package com.echem;

public class Car implements Machine{
    @Override
    public String drive() {
        return "car drive";
    }

    @Override
    public String stop() {
        return "car stop";
    }

    @Override
    public String turnLeft() {
        return "car turn left";
    }

    @Override
    public String turnRight() {
        return "car turn right";
    }
}
