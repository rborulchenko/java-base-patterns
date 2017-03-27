package net.rborulchenko.creational.abstractFactory.GamingPC;

import net.rborulchenko.creational.abstractFactory.CPU;
import net.rborulchenko.creational.abstractFactory.GPU;
import net.rborulchenko.creational.abstractFactory.PCFactory;
import net.rborulchenko.creational.abstractFactory.RAM;

public class GamingPCFactory implements PCFactory {

    @Override
    public CPU createCPU() {
        return new IntelCPU();
    }

    @Override
    public GPU createGPU() {
        return new GeForceGPU();
    }

    @Override
    public RAM createRAM() {
        return new KorsairRAM();
    }
}
