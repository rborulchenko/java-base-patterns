package net.rborulchenko.creational.abstractFactory.WorkstationPC;

import net.rborulchenko.creational.abstractFactory.CPU;
import net.rborulchenko.creational.abstractFactory.GPU;
import net.rborulchenko.creational.abstractFactory.PCFactory;
import net.rborulchenko.creational.abstractFactory.RAM;

public class WorkstationPCFactory implements PCFactory {
    @Override
    public CPU createCPU() {
        return new AmdCPU();
    }

    @Override
    public GPU createGPU() {
        return new RadeonGPU();
    }

    @Override
    public RAM createRAM() {
        return new KingstoneRAM();
    }
}
