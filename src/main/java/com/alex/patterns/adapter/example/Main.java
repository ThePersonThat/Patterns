package com.alex.patterns.adapter.example;

public class Main {
    public static void main(String[] args) {
        /* it works fine */
        MusicSender musicSender = new MusicSender();
        musicSender.send();

        /* using adapter */
        Sender sender = new AdapterVideoToMusic(new VideoSender());
        sender.send();
    }
}
