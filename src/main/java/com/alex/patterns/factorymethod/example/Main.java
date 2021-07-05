package com.alex.patterns.factorymethod.example;

public class Main {
    public static void main(String[] args) {
        Form form = getForm();
        Button button = form.createButton();

        button.onClick();
    }

    private static Form getForm() {
        String os = System.getProperty("os.name");

        if (os.equals("Linux")) {
            return new LinuxForm();
        }
        else if(os.equals("Windows")) {
            return new WindowsForm();
        }
        else {
            throw new RuntimeException("Unknown OS!");
        }
    }
}
