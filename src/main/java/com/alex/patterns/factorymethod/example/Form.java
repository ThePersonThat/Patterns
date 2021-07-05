package com.alex.patterns.factorymethod.example;

/* Basic factory class (may contain business logic) */
public abstract class Form {
    /* some other fields */
    protected int height;
    protected int width;
    protected boolean isPopup;

    /* this is factory method creates objects in subclasses */
    abstract Button createButton();
}
