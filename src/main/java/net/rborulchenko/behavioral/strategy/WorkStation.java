package net.rborulchenko.behavioral.strategy;

public class WorkStation implements PCType {
    @Override
    public void describe() {
        System.out.println("WorkStation computer for work at home.\n");
    }
}
