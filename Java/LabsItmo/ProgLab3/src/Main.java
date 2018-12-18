public class Main {
    public static void main(String[] args){
        Doctor doc = new Doctor();
        for(int i = 0 ; i < 1 ; i ++) {
            PrintNumber(i + 1);
            Patient pat = new Patient();
            pat.say_hello();
            doc.AskName();
            pat.Say_Name();
            doc.measure_temperature(pat);
            pat.say_WhatToDo();
            doc.toPrescribeMed(pat);
        }
    }
    public static void PrintNumber(int i){
        System.out.println();
        System.out.print("Пациент номер ");
        System.out.print(i);
        System.out.println(" на сегодня");
        System.out.println();
    }
}
