package net.rborulchenko.behavioral.strategy;

public class ServerPC implements PCType {
    @Override
    public void describe() {
        System.out.println("Server machine for heavy calculating.\n");
    }
}
