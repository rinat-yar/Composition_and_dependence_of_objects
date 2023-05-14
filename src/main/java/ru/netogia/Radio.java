package ru.netogia;

public class Radio {
    private int currentRadioStation;
    private int currentRadioVolume;
    private int maxStation;

    public Radio(){
        maxStation = 9;
    }

    public Radio(int stationsCount){
        maxStation = stationsCount -1;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > maxStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void nextStation() {
        if (currentRadioStation != maxStation) {
            currentRadioStation++;
        } else {
            currentRadioStation = 0;
        }
    }

    public void prevStation() {
        if (currentRadioStation != 0) {
            currentRadioStation--;
        } else {
            currentRadioStation = maxStation;
        }
    }

    public int getCurrentRadioVolume() {
        return currentRadioVolume;
    }

    public void setCurrentRadioVolume(int currentRadioVolume) {
        if (currentRadioVolume < 0) {
            return;
        }
        if (currentRadioVolume > 100) {
            return;
        }
        this.currentRadioVolume = currentRadioVolume;
    }

    public void upVolume() {
        if (currentRadioVolume != 100) {
            currentRadioVolume++;
        } else {
            currentRadioVolume = 0;
        }
    }

    public void downVolume() {
        if (currentRadioVolume != 0) {
            currentRadioVolume--;
        } else {
            currentRadioVolume = 100;
        }
    }
}