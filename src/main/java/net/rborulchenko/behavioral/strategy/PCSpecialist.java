package net.rborulchenko.behavioral.strategy;

public class PCSpecialist {
    private PCType type;

    public void setType(PCType type) {
        this.type = type;
    }

    public void buildPC() {
        System.out.println("Building...");

        type.describe();
    }

}
