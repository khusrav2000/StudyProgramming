package ru.ifmo.se.lab5;
public class Tonometer {
    public String measurePressure(Object patient){
        Patient pat = (Patient) patient;
        return pat.getPressure();
    }
}
