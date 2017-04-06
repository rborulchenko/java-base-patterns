package net.rborulchenko.structural.adapter;

public class MusicRunner {
    public static void main(String[] args) {
        Player player = new PlayerAdapter();

        player.play();
        player.pause();
        player.record();
    }
}
