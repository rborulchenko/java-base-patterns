package net.rborulchenko.basepatterns.structural.composite;

public class Developer implements Employee {
    @Override
    public void doJob() {
        System.out.println("Developer develops software...");
    }
}
