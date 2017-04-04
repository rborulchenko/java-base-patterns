package net.rborulchenko.creational.builder;

public class ResidentialEdifice extends EdificeBuilder {
    @Override
    public void buildAddress() {
        edifice.setAddress("Lyudviha Svobody Ave");
    }

    @Override
    public void buildClassification() {
        edifice.setClassification(Classification.RESIDENTIAL);
    }

    @Override
    public void buildPrice() {
        edifice.setPrice(35_000);
    }
}
