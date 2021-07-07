package com.alex.patterns.adapter.example;

public class AdapterVideoToMusic implements Sender {
    private VideoSender adapte;

    public AdapterVideoToMusic(VideoSender sender) {
        this.adapte = sender;
    }

    @Override
    public void send() {
        adapte.sendVideo();
    }
}
