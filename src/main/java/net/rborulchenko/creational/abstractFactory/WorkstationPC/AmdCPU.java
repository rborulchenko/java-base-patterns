package net.rborulchenko.creational.abstractFactory.WorkstationPC;

import net.rborulchenko.creational.abstractFactory.CPU;

public class AmdCPU implements CPU {
    @Override
    public void printCentralFrequency() {
        System.out.println("AMD frequency is 4.0 Mhrz...");
    }
}
