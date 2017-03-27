package net.rborulchenko.creational.abstractFactory;

public interface PCFactory {
    CPU createCPU();

    GPU createGPU();

    RAM createRAM();
}
