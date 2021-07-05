package com.alex.patterns.factorymethod.example;

/* Specific implementation of the factory */
public class WindowsForm extends Form {
    @Override
    Button createButton() {
        return new WindowButton();
    }
}
