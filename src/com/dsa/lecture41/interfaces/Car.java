package com.dsa.lecture41.interfaces;

public class Car implements Brake, Engine, Media {
    @Override
    public void brake() {
        System.out.println("Braking Car");
    }

    @Override
    public void start() {
        System.out.println("Starting Car");
    }

    @Override
    public void stop() {
        System.out.println("Stopping Car");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating Car");
    }

}
