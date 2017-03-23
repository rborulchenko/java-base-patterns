package net.rborulchenko.behavioral.strategy;

public class GamePC implements PCType {
    @Override
    public void describe() {
        System.out.println("Game computer for playing games.\n");
    }
}
