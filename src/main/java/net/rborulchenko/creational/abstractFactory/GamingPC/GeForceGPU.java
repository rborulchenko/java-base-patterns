package net.rborulchenko.creational.abstractFactory.GamingPC;

import net.rborulchenko.creational.abstractFactory.GPU;

public class GeForceGPU implements GPU {
    @Override
    public void printGraphicFrequency() {
        System.out.println("GeForce GPU frequency is 1260...");
    }
}
