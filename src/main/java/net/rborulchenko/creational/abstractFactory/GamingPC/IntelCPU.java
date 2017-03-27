package net.rborulchenko.creational.abstractFactory.GamingPC;

import net.rborulchenko.creational.abstractFactory.CPU;

public class IntelCPU implements CPU {
    @Override
    public void printCentralFrequency() {
        System.out.println("Intel CPU frequency is 3.7 Mhrz...");
    }
}
