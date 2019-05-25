package ru.ifmo.se.lab5;
import javax.print.Doc;
import java.util.*;

public class Pharmacy{
    Pharmasist pharmasist;
    //TODO: add field medicaments with type array
    Set<String> medicaments = new HashSet<>();

    Map<String , Double> price = new HashMap<>();

    String adress = new String();
    //String[] medicaments = {} ;
    /**public Map<String, Double> creatMap(){
        Map<String , Double> pr = new HashMap<>();
        pr.put("новокаин" , 123.2);
        pr.put("пирамидон" , 321.4);
        pr.put("стрептоцид" , 456.5);
        pr.put("Белосалик" , 132.0);
        pr.put("Декспантенол" , 433.4);
        pr.put("Бетагистин" , 700.8);
        pr.put("Быструмгель" , 455.2);
        pr.put("Детралекс" , 443.4);
        return pr;
    }**/
    public void setNameToPharmasist(String name , String lastname){
        pharmasist.name = name ;
        pharmasist.lastname = lastname;
    }
    public void setAdress(String adress){
        this.adress = adress;
    }
    Pharmacy(){
        pharmasist = new Pharmasist();
    }
    public void addMedicament(String name , Double price){
        medicaments.add(name);
        this.price.put(name , price);
    }
    public String[] buypreparetion(Object medicaments){
        ArrayList<Medicaments> namepreparetions = ((Recipe) medicaments).getMedicaments();
        System.out.println("Сейчас найду то что вам нужно");
        System.out.println("Вот ваши лекарство");
        CreatChek creatChek = new CreatChek();
        String[] chek = creatChek.creatChek(namepreparetions);
        pharmasist.pharmacistSayBye(creatChek.getTotalPrice());
        return chek;
    }

}
