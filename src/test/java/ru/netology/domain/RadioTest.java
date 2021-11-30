package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void shouldCreate() {
        Radio radio = new Radio();
        assertNull(radio.name);
        assertEquals(0, radio.currentRadioStation);
        assertEquals(0, radio.currentVolume);
    }
    @Test
    public void shouldChangeRadioStation(){
        Radio radio = new Radio();
        assertNull(radio.name);
        assertEquals(0, radio.currentRadioStation);
        radio.currentRadioStation = 9;
        assertEquals(9, radio.currentRadioStation);
    }
    @Test
    public void increaseRadioStation() {
        Radio radio = new Radio();
        assertNull(radio.name);
        if (radio.currentRadioStation < 10) {
            radio.currentRadioStation = radio.currentRadioStation + 1;
        }
    }
    @Test
    public void lastRadioStationNext() {
        Radio radio = new Radio();
        assertNull(radio.name);
        if (radio.currentRadioStation == 9) {
            radio.currentRadioStation = 0;
        }
        assertEquals(0, radio.currentRadioStation);
    }
    @Test
    public void firstRadioStationPrev() {
        Radio radio = new Radio();
        assertNull(radio.name);
        if (radio.currentRadioStation == 0) {
            radio.currentRadioStation = 9;
        }
        assertEquals(9, radio.currentRadioStation);
    }
    @Test
    public void shouldChangeVolume() {
        Radio radio = new Radio();
        assertNull(radio.name);
        assertEquals(0, radio.currentVolume);
        radio.currentVolume = radio.currentVolume + 1;
        assertEquals(1, radio.currentVolume);
    }
    @Test
    public void increaseVolume() {
        Radio radio = new Radio();
        assertNull(radio.name);
        if (radio.currentVolume < 10) {
            radio.currentVolume = radio.currentVolume + 1;
        }
    }
}