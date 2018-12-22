import com.sun.deploy.net.proxy.pac.PACFunctions;

import java.util.ArrayList;
import java.util.Random;

import static java.lang.Math.abs;

public class Doctor extends Person {
    public void measure_temperature(Object patient){
        System.out.println("Сейчас мы провери ...");
        Thermometer thermometer = new Thermometer();
        Double patientTemperature = thermometer.measureTemperature(patient);
        toAppoinTreatment(patient , patientTemperature);
    }
    public void toAppoinTreatment(Object patient , Double patienTemperature){
        if(patienTemperature >= 38.5) {
            System.out.print("У вас очень высокая температура ");
            System.out.print(patienTemperature);
            System.out.println(" Градуса");
            toPrescribeMedications(patient);

        }
        else if(patienTemperature >= 36.9){
            System.out.print("У вас высокая температура ");
            System.out.print(patienTemperature);
            System.out.println(" Градуса");
            toPrescribeMedications(patient);
        }
        else{
            System.out.print("У вас температура номальная ");
            System.out.print(patienTemperature);
            System.out.println(" Градуса");
            sayPatientNormal();
        }
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
    public void sayPatientNormal(){
        System.out.println("Идит несколько дней отдохниые хорошо еште если не будеть улучшения потом приходите");
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
    public void AskName(){
        System.out.println("Как вас зовут?");
    }
}
