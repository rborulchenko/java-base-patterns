package net.rborulchenko.creational.builder;

public class Architect {
    private EdificeBuilder builder;

    public void setBuilder(EdificeBuilder builder) {
        this.builder = builder;
    }

    public Edifice buildEdifice() {
        builder.createEdifice();

        builder.buildAddress();
        builder.buildClassification();
        builder.buildPrice();

        return builder.getEdifice();
    }
}
