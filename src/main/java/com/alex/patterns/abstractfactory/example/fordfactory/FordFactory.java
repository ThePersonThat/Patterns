package com.alex.patterns.abstractfactory.example.fordfactory;

import com.alex.patterns.abstractfactory.example.Jeep;
import com.alex.patterns.abstractfactory.example.SportCar;
import com.alex.patterns.abstractfactory.example.CarsFactory;

/*
 * This is a specific implementation of the abstract factory
 * must implements all "object creation" methods for its own objects
 */
public class FordFactory implements CarsFactory {
    @Override
    public Jeep createJeep() {
        return new FordJeep();
    }

    @Override
    public SportCar createSportCar() {
        return new FordSportCar();
    }
}
