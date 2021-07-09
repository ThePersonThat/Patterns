package com.alex.patterns.decorator.example;

public class Main {
    public static void main(String[] args) {
        Programmer programmer = new JavaProgrammer();

        /* add the current programmer the new ability */
        ProgrammerWithGit programmerWithGit = new ProgrammerWithGit(programmer);

        programmerWithGit.writeCode();
    }
}
