package net.rborulchenko.creational.builder;

public class BuildEdificeRunner {
    public static void main(String[] args) {
        Architect architect = new Architect();
        architect.setBuilder(new IndustrialEdifice());

        System.out.println(architect.buildEdifice());
    }
}
