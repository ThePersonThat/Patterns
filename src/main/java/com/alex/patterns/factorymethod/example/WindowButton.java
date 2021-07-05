package com.alex.patterns.factorymethod.example;

/* interface implementation */
public class WindowButton implements Button {

    @Override
    public void onClick() {
        System.out.println("Detected Windows button click");
    }
}
