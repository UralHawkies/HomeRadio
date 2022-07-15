package ru.netology.HomeRadio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldIncreaseVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(5);
        volume.increaseVolume();

        int expected = 6;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolumeIfMax() {
        Radio volume = new Radio();

        volume.setCurrentVolume(100);
        volume.increaseVolume();

        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(5);
        volume.decreaseVolume();

        int expected = 4;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolumeIfMin() {
        Radio volume = new Radio();

        volume.setCurrentVolume(0);
        volume.decreaseVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToNextChannel() {
        Radio wave = new Radio();

        wave.setChannel(5);
        wave.nextChannel();

        int expected = 6;
        int actual = wave.getChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToPrevChannel() {
        Radio wave = new Radio();

        wave.setChannel(5);
        wave.prevChannel();

        int expected = 4;
        int actual = wave.getChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToMinWhenIncreaseMax() {
        Radio wave = new Radio();

        wave.setChannel(9);
        wave.nextChannel();

        int expected = 0;
        int actual = wave.getChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToMaxWhenDecreaseMin() {
        Radio wave = new Radio();

        wave.setChannel(0);
        wave.prevChannel();

        int expected = 9;
        int actual = wave.getChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnCorrectChannelIfUnderMin() {
        Radio wave = new Radio();

        wave.setChannel(-5);
        wave.nextChannel();

        int expected = 1;
        int actual = wave.getChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnCorrectChannelIfAboveMax() {
        Radio wave = new Radio();

        wave.setChannel(15);
        wave.prevChannel();

        int expected = 9;
        int actual = wave.getChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnCorrectVolumeIfUnderMin() {
        Radio volume = new Radio();

        volume.setCurrentVolume(-5);
        volume.decreaseVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnCorrectVolumeIfAboveMax() {
        Radio volume = new Radio();

        volume.setCurrentVolume(115);
        volume.increaseVolume();

        int expected = 1;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToNextChannelParam(){
        Radio wave = new Radio(50);

        wave.setChannel(25);
        wave.nextChannel();

        int expected = 26;
        int actual = wave.getChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToPrevChannelParam() {
        Radio wave = new Radio(50);

        wave.setChannel(25);
        wave.prevChannel();

        int expected = 24;
        int actual = wave.getChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnCorrectChannelIfAboveMaxParam() {
        Radio wave = new Radio(50);

        wave.setChannel(75);
        wave.nextChannel();

        int expected = 1;
        int actual = wave.getChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnCorrectChannelIfUnderMinParam(){
        Radio wave = new Radio(50);

        wave.setChannel(-15);
        wave.prevChannel();

        int expected = 49;
        int actual = wave.getChannel();

        Assertions.assertEquals(expected, actual);
    }
}
