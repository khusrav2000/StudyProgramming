package ru.ifmo.se.lab4;
public class Thermometer {
    public Double measureTemperature(Object person){
        Person pers = (Person) person;
        return pers.getTemperature();
    }
}
