package com.alex.patterns.prototype.example;

public abstract class Car {
    /* some fields */
    private int speed;

    public Car(int speed) {
        this.speed = speed;
    }

    public Car(Car car) {
        this.speed = car.speed;
    }

    /* Method for cloning object. It can also be an interface*/
    public abstract Car clone();
}
