package com.alex.patterns.decorator.example;

/* It must have the same interface decorated class has */
public abstract class DecoratorProgrammer implements Programmer {
    protected Programmer programmer;

    public DecoratorProgrammer(Programmer programmer) {
        this.programmer = programmer;
    }
}
