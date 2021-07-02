package com.alex.patterns.abstractfactory.example;

/*
* This is a interface abstract factory
* This interface has all the methods to create objects
* In this example it has the property to create Jeep and SportCar classes
*/
public interface CarsFactory {
    Jeep createJeep();
    SportCar createSportCar();
}
