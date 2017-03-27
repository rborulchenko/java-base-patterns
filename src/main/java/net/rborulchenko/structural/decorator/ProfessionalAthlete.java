package net.rborulchenko.structural.decorator;

public class ProfessionalAthlete extends AthleteDecorator {
    ProfessionalAthlete(Athlete athlete) {
        super(athlete);
    }

    @Override
    public void training() {
        athlete.training();
        System.out.println("Have serious diet...");
    }
}
