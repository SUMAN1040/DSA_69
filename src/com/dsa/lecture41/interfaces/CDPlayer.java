package com.dsa.lecture41.interfaces;

public class CDPlayer implements Media{

    @Override
    public void start() {
        System.out.println("Rock music");
    }

    @Override
    public void stop() {
        System.out.println("Music stop");
    }
}
