package com.alex.patterns.abstractfactory;

import com.alex.patterns.abstractfactory.fordfactory.FordFactory;

public class Main {
    public static void main(String[] args) {
        /* creation one of the factories */
        CarsFactory factory = new FordFactory();

        /* creation car as you want */
        SportCar sportCarFord = factory.createSportCar();

        /* ... */
    }
}
