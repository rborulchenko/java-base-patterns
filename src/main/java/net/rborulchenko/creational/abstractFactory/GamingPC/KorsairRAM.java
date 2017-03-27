package net.rborulchenko.creational.abstractFactory.GamingPC;

import net.rborulchenko.creational.abstractFactory.RAM;

public class KorsairRAM implements RAM {
    @Override
    public void printMemoryFrequency() {
        System.out.println("Korsair RAM frequency is 2133...");
    }
}
