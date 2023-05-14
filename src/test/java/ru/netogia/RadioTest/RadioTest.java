package ru.netogia.RadioTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netogia.Radio;

public class RadioTest {

    @Test
    public void radioTest_1() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(5);

        int expected = 5;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioTest_15() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioTest_16() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioTestNext_2() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);

        radio.nextStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioTestNext_3() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);

        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioTestNext_4() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);

        radio.nextStation();

        int expected = 1;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioTestPrev_5() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);

        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioTestPrev_6() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);

        radio.prevStation();

        int expected = 8;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioTestPrev_7() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(6);

        radio.prevStation();

        int expected = 5;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioVolumeTest_8() {
        Radio radio = new Radio();

        radio.setCurrentRadioVolume(50);

        int expected = 50;
        int actual = radio.getCurrentRadioVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioVolumeTest_17() {
        Radio radio = new Radio();

        radio.setCurrentRadioVolume(101);

        int expected = 0;
        int actual = radio.getCurrentRadioVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioVolumeTest_18() {
        Radio radio = new Radio();

        radio.setCurrentRadioVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioUpVolumeTest_9() {
        Radio radio = new Radio();
        radio.setCurrentRadioVolume(99);

        radio.upVolume();

        int expected = 100;
        int actual = radio.getCurrentRadioVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioUpVolumeTest_10() {
        Radio radio = new Radio();
        radio.setCurrentRadioVolume(100);

        radio.upVolume();

        int expected = 0;
        int actual = radio.getCurrentRadioVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioUpVolumeTest_11() {
        Radio radio = new Radio();
        radio.setCurrentRadioVolume(0);

        radio.upVolume();

        int expected = 1;
        int actual = radio.getCurrentRadioVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioDownVolumeTest_12() {
        Radio radio = new Radio();
        radio.setCurrentRadioVolume(99);

        radio.downVolume();

        int expected = 98;
        int actual = radio.getCurrentRadioVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioUpVolumeTest_13() {
        Radio radio = new Radio();
        radio.setCurrentRadioVolume(100);

        radio.downVolume();

        int expected = 99;
        int actual = radio.getCurrentRadioVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioUpVolumeTest_14() {
        Radio radio = new Radio();
        radio.setCurrentRadioVolume(0);

        radio.downVolume();

        int expected = 100;
        int actual = radio.getCurrentRadioVolume();
        Assertions.assertEquals(expected, actual);
    }
}