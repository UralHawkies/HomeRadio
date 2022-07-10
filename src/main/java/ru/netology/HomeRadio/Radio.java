package ru.netology.HomeRadio;

public class Radio {
    private int currentVolume;
    private int channel;

    public int getChannel() {
        return channel;
    }

    public void setChannel(int newChannel) {
        if (newChannel < 0) {
            return;
        }
        if (newChannel > 9) {
            return;
        }
        channel = newChannel;
    }

    public void nextChannel() {
        if (channel < 9) {
            channel++;
        }
        if (channel == 9) {
            channel = 0;
        }
    }

    public void prevChannel() {
        if (channel > 0) {
            channel--;
        }
        if (channel == 0) {
            channel = 9;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }


}
