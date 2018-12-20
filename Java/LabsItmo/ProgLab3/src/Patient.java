import java.util.ArrayList;

class Patient extends Person{
    int temperature = 37;

    Patient(){
        AskRandomNameOrSurname askname = new AskRandomNameOrSurname();
        super.name = askname.AskRandomName();
    }
    public void changetemperature(int temperature){
        this.temperature = temperature;
    }
    public void Say_Name(){
        System.out.print("Меня зовут ");
        System.out.println(super.name);
    }
    public void say_hello(){
        System.out.println("Здравствуйте доктор");
        System.out.println("Последные два дня у меня болит горло ");
    }
    public void say_WhatToDo(){
        System.out.println("Что мне делать");
    }

    public void buypreparetion(ArrayList<Lekarstvo> namepreparetions){
        Pharmacy pharmacy = new Pharmacy();

        System.out.println("Здравствуйте, мне нужни вот эти лекарство");
        String[] chek = pharmacy.buypreparetion(new pharmasist() , namepreparetions);
        System.out.println("--------Чек---------");
        for (String str : chek){
            System.out.println(str);
        }
        System.out.println("--------------------");
        System.out.println();
        System.out.println("Спасибо");
    }
}
