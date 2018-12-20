import java.util.ArrayList;
import java.util.Random;

import static java.lang.Math.abs;

public class Doctor extends Person {
    public void measure_temperature(Object patient){
        System.out.println("Сейчас мы провери ...");
        //Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int valuetemperatute = abs(rand.nextInt()) % 4 + 37;
        Patient pat = (Patient) patient;
        pat.changetemperature(valuetemperatute);
        SayAboutTemperature(valuetemperatute);
    }
    public void SayAboutTemperature(int valuetemperature){
        if(valuetemperature >= 39) {
            System.out.print("У вас очень высокая температура ");
            System.out.print(valuetemperature);
            System.out.println(" Градуса");

        }
        else if(valuetemperature == 38){
            System.out.print("У вас высокая температура ");
            System.out.print(valuetemperature);
            System.out.println(" Градуса");
        }
        else{
            System.out.print("У вас температура номальная ");
            System.out.print(valuetemperature);
            System.out.println(" Градуса");
        }
    }
    public void toPrescribeMed(Object patient){
        System.out.println("Сейчас я напишу вам несколько лекарство");
        ArrayList<Lekarstvo> assignLekarstvos = getRundomLekarstvs();
        System.out.println("------Список Лекарств------");
        for(int i = 0 ; i < assignLekarstvos.size() ; i ++){
            System.out.println(assignLekarstvos.get(i));
        }
        System.out.println("----------------------------");
        System.out.println("Принимайте их три раза в день. Утром, в обеде и на ужине");
        System.out.println();
        Patient pat = (Patient) patient;
        pat.buypreparetion(assignLekarstvos);
    }
    public void sayPatientNormal(){
        System.out.println("Идит несколько дней отдохниые хорошо еште если не будеть улучшения потом приходите");
    }
    public void AskName(){
        System.out.println("Как вас зовут?");
    }
    public ArrayList<Lekarstvo> getRundomLekarstvs(){
        Lekarstvo[] lekarstvos = Lekarstvo.values();
        Random rand = new Random();
        int randomnumber = abs(rand.nextInt()) % (lekarstvos.length - 1) + 1;
        ArrayList<Lekarstvo> assingnLekarstvos = new ArrayList<>();
        for(int i = 0 ; i < randomnumber ; i ++){
            int randlekarstv = abs(rand.nextInt()) % lekarstvos.length;
            assingnLekarstvos.add(lekarstvos[randlekarstv]);
        }
        return assingnLekarstvos;
    }
}
