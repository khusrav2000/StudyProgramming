package ru.ifmo.se.lab5;
import java.util.ArrayList;

import static java.lang.Math.round;

public class CreatChek {
    Double totalPrice = new Double(0);
    public String[] creatChek(ArrayList<Medicaments> preparetions){
        String[] chek = new String[preparetions.size() + 1];
        for(int i = 0 ; i < preparetions.size(); i ++) {
            Double price = preparetions.get(i).getPrice();
            totalPrice += price;
            chek[i] = makeChekRow(preparetions.get(i).toString() , price);
        }
        totalPrice = totalPrice * 10.0;
        totalPrice = round(totalPrice) / 10.0;
        chek[preparetions.size()] = makeChekRow("Итого:" , totalPrice);
        return chek;
    }
    public String makeChekRow(String namepreparetion , Double price){
        String chekRow = namepreparetion;
        for(int i = 0 ; i < 20 - namepreparetion.length() ; i ++)
            chekRow += " ";
        chekRow += price.toString();
        return chekRow;
    }
    public Double getTotalPrice(){
        return totalPrice;
    }
}
