
package ru.ifmo.se.lab4;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;

import static java.lang.Math.abs;

public class Doctor extends Person {
    Doctor(ResultSet st){
        try {
            super.name = st.getString("name");
            super.surname = st.getString("surname");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    ArrayList<Object> doctorsKnowAbout = new ArrayList<Object>();
    public void knowAboutDoctor(Object doctor){
        doctorsKnowAbout.add(doctor);
    }
    public void measure_temperature(Object patient){
        System.out.println("Сейчас мы провери вашу температуру");
        Thermometer thermometer = new Thermometer();
        Double patientTemperature = thermometer.measureTemperature(patient);
        toAppointTreatment(patient , patientTemperature);
    }
    public void toAppointTreatment(Object patient , Double patienTemperature){
        String sayAboutTemperature = null;
        if(patienTemperature >= 38.5) {
            sayAboutTemperature = "У вас очень высокая температура ";
        }
        else if(patienTemperature >= 38){
            sayAboutTemperature = "У вас высокая температура ";
        }
      
        System.out.println(sayAboutTemperature + patienTemperature + " Градуса");
        if(patienTemperature < 38) {
            sayPatientNormalTemperature(patient);

        }
        else toPrescribeMedications(patient);
    }
    public void toPrescribeMedications(Object patient){
        System.out.println("Сейчас я напишу вам несколько лекарство");
        Recipe recipe = new Recipe();
        ArrayList<Medicaments> assignMedicaments = getRandomMedicaments();
        System.out.println("------Список Лекарств------");
        for(int i = 0 ; i < assignMedicaments.size() ; i ++){
            Medicaments med = assignMedicaments.get(i);
            recipe.toPrescribeMedication(med);
            System.out.println(med);
        }
        System.out.println("----------------------------");
        System.out.println("Принимайте их три раза в день. Утром, в обеде и на ужине");
        System.out.println();
        givesRecipeToThePatient(patient , recipe);
    }
    public void givesRecipeToThePatient(Object patient , Object recipe){
        Patient pat = (Patient) patient;
        Recipe rec = (Recipe) recipe;
        pat.taken(rec);
    }
    public void sayPatientNormalTemperature(Object patient){
        System.out.println("У вас нормальная температура. Давайте измерим ваше давление");
        measure_Pressure(patient);
    }
    public void measure_Pressure(Object patient){
        Tonometer tonometer = new Tonometer();
        String pressure = tonometer.measurePressure(patient);
        System.out.println("У вас нормальная температура" + pressure);
        Doctor doc = (Doctor) doctorsKnowAbout.get(0);
        System.out.println("Идите к доктору " + doc.getName() + doc.getSurname());
    }
    public ArrayList<Medicaments> getRandomMedicaments(){
        Medicaments[] lekarstvos = Medicaments.values();
        Random rand = new Random();
        int randomnumber = abs(rand.nextInt()) % (lekarstvos.length - 1) + 1;
        ArrayList<Medicaments> assingnLekarstvos = new ArrayList<>();
        for(int i = 0 ; i < randomnumber ; i ++){
            int randlekarstv = abs(rand.nextInt()) % lekarstvos.length;
            assingnLekarstvos.add(lekarstvos[randlekarstv]);
        }
        return assingnLekarstvos;
    }
    public void askName(){
        System.out.println("Как вас зовут?");
    }
    public void sayHello(){
        System.out.println("Здравствуйте, чем могу помоч?");
    }
    public void sayName(){
        System.out.println("А меня зовут " + name);
    }
}
