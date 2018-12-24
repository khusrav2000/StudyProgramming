class Patient extends Person{
    Patient(){
        MakeNewPerson newPatient = new MakeNewPerson();
        super.name = newPatient.getName();
        super.surname = newPatient.getSurname();
        super.temperature = newPatient.getTemperature();
        super.pressure = "120/70";
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
        System.out.println("Последные два дня у меня болит горло ");
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
}
