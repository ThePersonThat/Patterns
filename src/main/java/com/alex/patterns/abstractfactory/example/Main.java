package com.alex.patterns.abstractfactory.example;

import com.alex.patterns.abstractfactory.example.CarsFactory;
import com.alex.patterns.abstractfactory.example.SportCar;
import com.alex.patterns.abstractfactory.example.fordfactory.FordFactory;

public class Main {
    public static void main(String[] args) {
        /* creation one of the factories */
        CarsFactory factory = new FordFactory();

        /* creation car as you want */
        SportCar sportCarFord = factory.createSportCar();

        /* ... */
    }
}
