package ru.ifmo.se.lab5;
public abstract class Person {
    String name;
    String lastname;
    String pressure;
    Double temperature;
    public String getName(){
        return name ;
    }
    public String getSurname(){
        return lastname;
    }
    public Double getTemperature(){
        return temperature;
    }
    public String getPressure(){
        return pressure;
    }
}
