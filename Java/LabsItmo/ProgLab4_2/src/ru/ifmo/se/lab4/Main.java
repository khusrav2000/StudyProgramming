package ru.ifmo.se.lab4;
import java.sql.*;
import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    private static Connection connection;
    private static void connectToDatabase(){
        try{
            connection = DriverManager.getConnection(DB_URL , DB_login , DB_password);
        }catch (Exception e){
            System.out.println("Не удаётся соединится с базой");
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        connectToDatabase();
        //Doctor doc1 = new Doctor("Ганнибал" , "Лектор");
        //Doctor doc2 = new Doctor("Григори" , "Хаус");
        //doc1.knowAboutDoctor(doc2);
        //Room room = new Room();
        //room.setDoctorForThisRoom(doc1);
        PersonnelDepartment personnelDepartment = new PersonnelDepartment();
        Orderly orderly = new Orderly();
        AddDiseases addDiseases = new AddDiseases();
        for(int i = 0 ; i < 10 ; i ++) {
            System.out.println("1: Принять Поциента");
            System.out.println("2: Добавить доктора");
            System.out.println("3: Я доктор и Хочу принят пациента");
            System.out.println("4: Добавить болезни");

            int answer = scan.nextInt();
            switch (answer){
                case 1:
                    orderly.takeThePatient();
                    break;
                case 2:
                    personnelDepartment.addDoctor();
                    break;
                case 3:
                    IamADoctor();
                    break;
                case 4:
                    addDiseases.AddDiseases();
                    break;
            }
            System.out.println("--------------------------------------------------------------------------------------");
        }
    }
    public static void PrintNumber(int i){
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.print("Пациент номер ");
        System.out.print(i);
        System.out.println(" на сегодня");
        System.out.println();
    }
    final static String DB_URL = "jdbc:postgresql://localhost:5432/firstDatabase";
    final static String DB_login = "postgres";
    final static String DB_password = "123";
    private static void IamADoctor(){
        System.out.println("Ваша фамилия имя доктор Доктор");
        String surnameDoctor = scan.next();
        String nameDoctor = scan.next();
        try{
            String sql = "SELECT * FROM doctors WHERE name = " + "\'" + nameDoctor + "\'" + " AND "  + "surname = " + "\'" + surnameDoctor + "\'";
            Statement statement= connection.createStatement();
            ResultSet st = statement.executeQuery(sql);
            if(!st.next()){
                System.out.println("у нас в базе нет такого доктора");
            }
            else{
                System.out.printf("%s%s%s%s\n" , st.getString("name") + " ", st.getString("surname") + " ",
                        st.getString("phone") + " " , st.getString("adress") + " ");
                Doctor doc = new Doctor(st);
                Room room = new Room();
                room.setDoctorForThisRoom(doc);
                getRandomPatient(room);
            }


        }catch (Exception e){
            e.printStackTrace();
            System.out.println("у нас в базе нет такого доктора");
        }
    }

    static Pharmacy pharmacy = new Pharmacy();
    private static void getRandomPatient(Room room) throws SQLException {
        ResultSet st = null;
        try {
            String sql = "SELECT * FROM patients WHERE name is NOT NULL AND surname is NOT NULL ORDER BY RANDOM() LIMIT 1";
            Statement statement = connection.createStatement();
            st = statement.executeQuery(sql);
            st.next();
            System.out.println("-----------------");
            System.out.println("Ваш пациент Доктор");
            System.out.println("-----------------");
            System.out.println("имя: " + st.getString("name"));
            System.out.println("фамилия: "+ st.getString("surname"));
            System.out.println("возрасть: "+st.getString("age"));
            System.out.println("болезн: "+st.getString("symptomofillness"));
            System.out.println("-----------------");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Не удаётся найти пациента");
        }
        Patient pat = new Patient(st);
        pat.setPharmacy(pharmacy);
        room.enterTheRoom(pat);
    }


}
