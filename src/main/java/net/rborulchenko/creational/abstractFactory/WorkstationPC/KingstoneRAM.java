package net.rborulchenko.creational.abstractFactory.WorkstationPC;

import net.rborulchenko.creational.abstractFactory.RAM;

public class KingstoneRAM implements RAM {
    @Override
    public void printMemoryFrequency() {
        System.out.println("Kingstone RAM frequency is 2400...");
    }
}
