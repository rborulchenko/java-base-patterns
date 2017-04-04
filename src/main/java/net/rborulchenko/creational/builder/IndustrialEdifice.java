package net.rborulchenko.creational.builder;

public class IndustrialEdifice extends EdificeBuilder {
    @Override
    public void buildAddress() {
        edifice.setAddress("Moskovs'kyi Ave");
    }

    @Override
    public void buildClassification() {
        edifice.setClassification(Classification.INDUSTRIAL);
    }

    @Override
    public void buildPrice() {
        edifice.setPrice(450_000);
    }
}
