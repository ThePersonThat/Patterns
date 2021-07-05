package com.alex.patterns.factorymethod.example;

/* interface implementation */
public class LinuxButton implements Button {

    @Override
    public void onClick() {
        System.out.println("Detected Linux button click");
    }
}
