package net.rborulchenko.creational.abstractFactory.WorkstationPC;

import net.rborulchenko.creational.abstractFactory.GPU;

public class RadeonGPU implements GPU {
    @Override
    public void printGraphicFrequency() {
        System.out.println("Radeon GPU frequency is 960...");
    }
}
