package net.rborulchenko.creational.builder;

public abstract class EdificeBuilder {
    Edifice edifice;

    public Edifice getEdifice() {
        return edifice;
    }

    public void createEdifice() {
        edifice = new Edifice();
    }

    public abstract void buildAddress();

    public abstract void buildClassification();

    public abstract void buildPrice();
}
