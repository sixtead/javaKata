package com.codewars.sixtead.kyu6;

public class TortoiseRacing {

    public static int[] race(int v1, int v2, int g) {
        int time;
        int hours;
        int minutes;
        int seconds;

        time = (int) ((double) g * 3600 / (v2 - v1));

        hours = time / 3600;
        minutes = (time - hours * 3600) / 60;
        seconds = time - hours * 3600 - minutes * 60;

        return new int[] {hours, minutes, seconds};
    }
}