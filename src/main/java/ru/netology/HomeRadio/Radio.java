package ru.netology.HomeRadio;

public class Radio {
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    private int channel;
    private int amountChannel = 10;
    private int minChannel = 0;
    private int maxChannel = amountChannel - 1;

    public Radio() {
    }

    public Radio(int amountChannel) {
        maxChannel = amountChannel - 1;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int newChannel) {
        if (newChannel < minChannel) {
            return;
        }
        if (newChannel > maxChannel) {
            return;
        }
        channel = newChannel;
    }

    public void nextChannel() {
        if (channel < maxChannel) {
            channel++;
        }
        if (channel == maxChannel) {
            channel = minChannel;
        }
    }

    public void prevChannel() {
        if (channel > minChannel) {
            channel--;
        }
        if (channel == minChannel) {
            channel = maxChannel;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }
}
