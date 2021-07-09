package com.alex.patterns.compositor.example;

/* Leaf object that does not have any child */
public class CircleLeaf implements Graphic {

    @Override
    public void draw() {
        System.out.println("o");
    }
}
