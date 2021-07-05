package com.alex.patterns.factorymethod.example;

/* Specific implementation of the factory */
public class LinuxForm extends Form {

    @Override
    Button createButton() {
        return new LinuxButton();
    }
}
