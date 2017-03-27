package net.rborulchenko.behavioral.strategy;

public class WorkStationPC implements PCType {
    @Override
    public void describe() {
        System.out.println("WorkStation computer for work at home.\n");
    }
}
