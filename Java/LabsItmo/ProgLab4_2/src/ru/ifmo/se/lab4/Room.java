package ru.ifmo.se.lab4;
public class Room {
    Doctor doctor;
    public void setDoctorForThisRoom(Object doctor){
        this.doctor = (Doctor) doctor;
    }
    public void enterTheRoom(Object patient){
        Patient pat = (Patient) patient;
        pat.say_hello();
        doctor.sayHello();
        pat.toldAboutTheDisease();
        doctor.askName();
        pat.sayName();
        doctor.sayName();
        doctor.measure_temperature(patient);
    }
}
