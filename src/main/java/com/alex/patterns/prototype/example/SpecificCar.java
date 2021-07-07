package com.alex.patterns.prototype.example;

public class SpecificCar extends Car {
    private int weight;

    public SpecificCar(int speed, int weight) {
        super(speed);
        this.weight = weight;
    }

    public SpecificCar(SpecificCar car) {
        super(car);
        this.weight = car.weight;
    }

    /* implementation of clone. This is method can be more complex: recursive cloning sub-objects and etc */
    @Override
    public SpecificCar clone() {
        return new SpecificCar(this);
    }
}
