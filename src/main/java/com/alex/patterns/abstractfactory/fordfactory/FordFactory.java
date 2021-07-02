package com.alex.patterns.abstractfactory.fordfactory;

import com.alex.patterns.abstractfactory.Jeep;
import com.alex.patterns.abstractfactory.SportCar;
import com.alex.patterns.abstractfactory.CarsFactory;

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
