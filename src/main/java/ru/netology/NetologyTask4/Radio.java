package ru.netology.NetologyTask4;


public class Radio {
    private int currentRadioStationNumber;

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }
    int currentVolume;


    public void setCurrentRadioStationNumber(int newRadioStationNumber) {
        if (newRadioStationNumber < 0 || newRadioStationNumber > 9) {
            return;
        }
        currentRadioStationNumber = newRadioStationNumber;
    }

    public void next() {
        if (currentRadioStationNumber < 9) {
            currentRadioStationNumber = currentRadioStationNumber + 1;
        } else {
            currentRadioStationNumber = 0;
        }
        setCurrentRadioStationNumber(currentRadioStationNumber);
    }

    public void prev() {
        if (currentRadioStationNumber > 0) {
            currentRadioStationNumber = currentRadioStationNumber - 1;
        } else {
            currentRadioStationNumber = 9;
        }
        setCurrentRadioStationNumber(currentRadioStationNumber);
    }



    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }


}
