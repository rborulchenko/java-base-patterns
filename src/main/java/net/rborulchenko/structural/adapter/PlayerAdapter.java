package net.rborulchenko.structural.adapter;

public class PlayerAdapter extends MP3Player implements Player {
    @Override
    public void play() {
        playMusic();
    }

    @Override
    public void pause() {
        pauseOnClick();
    }

    @Override
    public void record() {
        recordNoise();
    }
}
