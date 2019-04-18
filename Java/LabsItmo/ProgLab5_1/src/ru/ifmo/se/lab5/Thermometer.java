package ru.ifmo.se.lab5;
public class Thermometer {
    public Double measureTemperature(Object person){
        Person pers = (Person) person;
        return pers.getTemperature();
    }
}
