package net.rborulchenko.basepatterns.structural.composite;

public class Company {
    public static void main(String[] args) {
        DevelopmentManager manager = new DevelopmentManager();

        Employee developer = new Developer();
        Employee tester = new Tester();

        manager.add(developer);
        manager.add(tester);

        manager.doJob();
    }
}
