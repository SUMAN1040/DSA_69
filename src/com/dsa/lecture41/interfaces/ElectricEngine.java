package com.dsa.lecture41.interfaces;

public class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Electric Engine Start");
    }

    @Override
    public void stop() {
        System.out.println("Electric Engine Stop");
    }

    @Override
    public void accelerate() {
        System.out.println("Power Engine Accelerate");
    }
}
