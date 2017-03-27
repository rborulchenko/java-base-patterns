package net.rborulchenko.structural.decorator;

public class SimpleAthlete implements Athlete {
    @Override
    public void training() {
        System.out.println("Training 3 times at week...");
    }
}
