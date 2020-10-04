package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {


    @Test
    void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(3);
        radio.increaseVolume();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(3);
        radio.decreaseVolume();
        assertEquals(2, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolumeFromMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolumeToMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolumeToAnyValue() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolumeUnderMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        radio.increaseStation();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    void shouldPreviousStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        radio.decreaseStation();
        assertEquals(2, radio.getCurrentStation());
    }

    @Test
    public void shouldSetDesiredStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldDecreaseStationToMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.decreaseStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseStationToMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.increaseStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetDesiredAnyStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(27);
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldSetDesiredAnyStationMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }
}