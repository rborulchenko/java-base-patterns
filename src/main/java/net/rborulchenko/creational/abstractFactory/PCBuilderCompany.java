package net.rborulchenko.creational.abstractFactory;

import net.rborulchenko.creational.abstractFactory.WorkstationPC.WorkstationPCFactory;

public class PCBuilderCompany {
    public static void main(String[] args) {
        System.out.println("Building PC...");

        PCFactory factory = new WorkstationPCFactory();
        CPU cpu = factory.createCPU();
        GPU gpu = factory.createGPU();
        RAM ram = factory.createRAM();

        System.out.println("PC description...");

        cpu.printCentralFrequency();
        gpu.printGraphicFrequency();
        ram.printMemoryFrequency();
    }
}
