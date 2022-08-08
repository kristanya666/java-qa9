package ru.netology.NetologyTask4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    @Test
    public void shouldCheckOverRadioStationNumber() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(33);

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCheckOverRadioStationNumberTwo() {
        Radio radio = new Radio(30);

        radio.setCurrentRadioStationNumber(33);

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCheckNegativeRadioStationNumber() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(-2);

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldCheckNegativeRadioStationNumberTwo() {
        Radio radio = new Radio(30);

        radio.setCurrentRadioStationNumber(-2);

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldNextRadioLimit() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(9);
        radio.next();

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioLimitTwo() {
        Radio radio = new Radio(30);

        radio.setCurrentRadioStationNumber(29);
        radio.next();

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldNextRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(3);
        radio.next();

        int expected = 4;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStationTwo() {
        Radio radio = new Radio(30);

        radio.setCurrentRadioStationNumber(3);
        radio.next();

        int expected = 4;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldPrevRadioLimit() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioLimitTwo() {
        Radio radio = new Radio(30);

        radio.setCurrentRadioStationNumber(0);
        radio.prev();

        int expected = 29;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldPrevRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(6);
        radio.prev();

        int expected = 5;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStationTwo() {
        Radio radio = new Radio(30);

        radio.setCurrentRadioStationNumber(6);
        radio.prev();

        int expected = 5;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.currentVolume = 5;
        radio.increaseVolume();

        int expected = 6;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseLimitVolume() {
        Radio radio = new Radio();

        radio.currentVolume = 100;
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.currentVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();

        radio.currentVolume = 3;
        radio.decreaseVolume();

        int expected = 2;
        int actual = radio.currentVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseLimitVolume() {
        Radio radio = new Radio();

        radio.currentVolume = 0;
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.currentVolume;
        Assertions.assertEquals(expected, actual);
    }
}
