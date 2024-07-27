package com.echem;

public class Truck implements Machine{

    @Override
    public String drive() {
        System.out.println("Truck drive");
        return "Truck drive";
    }

    @Override
    public String stop() {
        System.out.println("Truck stop");
        return "Truck stop";
    }

    @Override
    public String turnLeft() {
        System.out.println("Truck turn left");
        return "Truck turn left";
    }

    @Override
    public String turnRight() {
        System.out.println("Truck turn right");
        return "Truck turn right";
    }
}
