package com.company;

public class TV {
    private boolean on;
    private int channel;

    public TV(int channel) {
        this.channel = channel;
    }

//behavior
    public void turnOn() {
        this.on = true;
    }

    public void turnOff() {
        this.on = false;
    }

    public void increaseChannel() {
        this.channel++;
    }

//getters and setters
    public int getChannel() {
        return channel;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }


}
