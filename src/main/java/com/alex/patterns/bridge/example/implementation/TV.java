package com.alex.patterns.bridge.example.implementation;

public class TV implements Device {

    @Override
    public void enable() {
        System.out.println("TV is on");
    }

    @Override
    public void disable() {
        System.out.println("TV is off");
    }
}
