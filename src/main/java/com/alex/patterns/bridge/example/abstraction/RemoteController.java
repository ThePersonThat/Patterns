package com.alex.patterns.bridge.example.abstraction;

import com.alex.patterns.bridge.example.implementation.Device;

public class RemoteController implements Remote {
    private Device device;

    public RemoteController(Device device) {
        this.device = device;
    }

    @Override
    public void powerOn() {
        device.enable();
    }

    @Override
    public void powerOff() {
        device.disable();
    }
}
