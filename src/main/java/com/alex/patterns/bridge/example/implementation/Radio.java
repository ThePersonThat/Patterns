package com.alex.patterns.bridge.example.implementation;

public class Radio implements Device {

    @Override
    public void enable() {
        System.out.println("Radio is on");
    }

    @Override
    public void disable() {
        System.out.println("Radio if off");
    }
}
