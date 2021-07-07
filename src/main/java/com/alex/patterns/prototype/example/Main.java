package com.alex.patterns.prototype.example;

public class Main {
    public static void main(String[] args) {
        SpecificCar car = new SpecificCar(120, 325);
        SpecificCar car1 = car.clone();
    }
}
