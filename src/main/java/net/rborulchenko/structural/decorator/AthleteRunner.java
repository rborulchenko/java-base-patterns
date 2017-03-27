package net.rborulchenko.structural.decorator;

public class AthleteRunner {
    public static void main(String[] args) {
        System.out.println("\nSimple Athlete...");
        Athlete simpleAthlete = new SimpleAthlete();
        simpleAthlete.training();

        System.out.println("\nProfessional Athlete...");
        Athlete professionalAthlele = new ProfessionalAthlete(new SimpleAthlete());
        professionalAthlele.training();

        System.out.println("\nInternational Level Athlete...");
        Athlete internationalLevelAthlete = new InternationalLevelAthlete(new ProfessionalAthlete(new SimpleAthlete()));
        internationalLevelAthlete.training();
    }
}