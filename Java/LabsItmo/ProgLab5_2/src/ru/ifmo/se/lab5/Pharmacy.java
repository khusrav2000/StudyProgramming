package ru.ifmo.se.lab5;
import java.util.ArrayList;

public class Pharmacy{
    Pharmasist pharmasist;
    //TODO: add field medicaments with type array
    Pharmacy(){
        pharmasist = new Pharmasist();
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
