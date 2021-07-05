package com.alex.patterns.builder.example;

public class Main {
    public static void main(String[] args) {
        ComplextClass dc = new ComplextClass.Builder()
                .setAge(10)
                .setAddress("Some Address")
                .setPrice(100)
                .build();
    }
}
