package net.rborulchenko.creational.builder;

public class Edifice {
    private String address;
    private Classification classification;
    private int price;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Classification getClassification() {
        return classification;
    }

    public void setClassification(Classification classification) {
        this.classification = classification;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Building{" +
                "address='" + address + '\'' +
                ", classification=" + classification +
                ", price=" + price +
                '}';
    }
}
