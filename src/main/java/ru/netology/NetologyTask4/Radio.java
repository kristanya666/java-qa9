package ru.netology.NetologyTask4;


public class Radio {
    private int currentRadioStationNumber;       //текущая радиостанция
    private int quantityOfRadioStations;        //количество радиостанций невключительно
    private int lastRadioStationNumber;         //последняя радиостанция
    private int firstRadioStationNumber = 0;    //первая радиостанция
    int currentVolume;                          //текущий уровень громкости


    public Radio(int quantityOfRadioStations) {
        this.quantityOfRadioStations = quantityOfRadioStations;
        this.lastRadioStationNumber = quantityOfRadioStations - 1;
    }


    public Radio() {
        this.quantityOfRadioStations = 10;
        this.lastRadioStationNumber = quantityOfRadioStations - 1;
        this.currentRadioStationNumber = getCurrentRadioStationNumber();
    }


    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }


    public void setCurrentRadioStationNumber(int newRadioStationNumber) {
        if (newRadioStationNumber < firstRadioStationNumber || newRadioStationNumber > lastRadioStationNumber) {
            return;
        }
        currentRadioStationNumber = newRadioStationNumber;
    }

    public void next() {
        if (currentRadioStationNumber < lastRadioStationNumber) {
            currentRadioStationNumber = currentRadioStationNumber + 1;
        } else {
            currentRadioStationNumber = 0;
        }
        setCurrentRadioStationNumber(currentRadioStationNumber);
    }

    public void prev() {
        if (currentRadioStationNumber > firstRadioStationNumber) {
            currentRadioStationNumber = currentRadioStationNumber - 1;
        } else {
            currentRadioStationNumber = lastRadioStationNumber;
        }
        setCurrentRadioStationNumber(currentRadioStationNumber);
    }


    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }


}
