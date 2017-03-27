package net.rborulchenko.structural.decorator;

public class InternationalLevelAthlete extends AthleteDecorator {
    InternationalLevelAthlete(Athlete athlete) {
        super(athlete);
    }

    @Override
    public void training() {
        athlete.training();
        System.out.println("Dedicate whole life to sport...");
    }
}
