package ru.ifmo.se.lab5;
import java.sql.ResultSet;
import java.sql.SQLException;

class Patient extends Person{
    Patient(ResultSet st) throws SQLException {
        MakeNewPerson newPatient = new MakeNewPerson();
        super.name = st.getString("name");
        super.lastname = st.getString("surname");
        super.temperature = newPatient.getTemperature();
        super.pressure = "120/70";
    }
    public void sayName(){
        System.out.println(name);
    }
    Pharmacy pharmacy;
    public void setPharmacy(Object pharmacy){
        this.pharmacy = (Pharmacy) pharmacy;
    }
    public void Say_Name(){
        System.out.print("Меня зовут ");
        System.out.println(super.name);
    }
    public void say_hello(){
        System.out.println("Здравствуйте доктор");
    }
    public void say_WhatToDo(){
        System.out.println("Что мне делать");
    }

    public void taken(Object recipe){
        buypreparetion(recipe);
    }
    public void buypreparetion(Object recipe){
        System.out.println("Здравствуйте, мне нужни вот эти лекарство");
        String[] chek = pharmacy.buypreparetion(recipe);
        System.out.println("--------Чек---------");
        for (String str : chek){
            System.out.println(str);
        }
        System.out.println("--------------------");
        System.out.println();
        System.out.println("Спасибо");
    }
    public void toldAboutTheDisease(){
        System.out.println("Последние несколько дней я чувствую себя очень слабим я с трудом встаю с постели");
    }
}
