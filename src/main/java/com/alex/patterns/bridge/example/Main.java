package com.alex.patterns.bridge.example;

import com.alex.patterns.bridge.example.abstraction.RemoteController;
import com.alex.patterns.bridge.example.implementation.Device;
import com.alex.patterns.bridge.example.implementation.TV;

public class Main {
    public static void main(String[] args) {
        Device tv = new TV();
        RemoteController controller = new RemoteController(tv);

        controller.powerOn();
    }
}
