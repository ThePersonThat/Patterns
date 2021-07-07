package com.alex.patterns.adapter.example;


/* Implementation of sender */
public class MusicSender implements Sender {
    @Override
    public void send() {
        System.out.println("Music is sent");
    }
}
