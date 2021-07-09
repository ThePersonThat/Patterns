package com.alex.patterns.decorator.example;

/* add new ability to a programmer is using git */
public class ProgrammerWithGit extends DecoratorProgrammer {

    public ProgrammerWithGit(Programmer programmer) {
        super(programmer);
    }

    private void commit() {
        System.out.println("The code was commit");
    }

    @Override
    public void writeCode() {
        commit();
    }
}
