package ru.ifmo.se.lab5;
public class Pharmasist extends Person {

    public void pharmacistSayHello(){
        System.out.println("Здравствуйте, Чем могу помоч");
    }
    public void pharmacistSayBye(Double totalPrice){
        System.out.print("С вас ");
        System.out.print(totalPrice);
        System.out.println(" Рублей");
        System.out.println("Ваш чек");
        System.out.println("Спасибо за покупку");
    }
}
