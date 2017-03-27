package net.rborulchenko.structural.decorator;

abstract class AthleteDecorator implements Athlete{
    Athlete athlete;

    AthleteDecorator(Athlete athlete) {
        this.athlete = athlete;
    }
}
