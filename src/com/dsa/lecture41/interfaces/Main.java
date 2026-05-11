package com.dsa.lecture41.interfaces;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//
//        car.accelerate();
//        car.start();
//        car.stop();
//
//        Media media = new Car();
//        media.stop();

        NiceCar car = new NiceCar();
        car.start();
        car.startMusic();

        car.upgradeEngine();
        car.start();
    }
}
