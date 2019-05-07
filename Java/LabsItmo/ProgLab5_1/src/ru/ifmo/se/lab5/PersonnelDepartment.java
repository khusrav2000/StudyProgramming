package ru.ifmo.se.lab5;
import com.sun.org.apache.bcel.internal.generic.JsrInstruction;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

Vector<PersonnelDeoartment>

public class PersonnelDepartment {
    private static Scanner scan = new Scanner(System.in);
    private static Connection connection;
    final static String DB_URL = "jdbc:postgresql://localhost:5432/firstDatabase";
    final static String DB_login = "postgres";
    final static String DB_password = "123";
    private void connectToDatabase(){
        try{
            connection = DriverManager.getConnection(DB_URL , DB_login , DB_password);
        }catch (Exception e){
            System.out.println("Не удаётся соединится с базой");
            e.printStackTrace();
        }
    }

    private final String jsonFileName = "C:\\Users\\KHUSRAV\\Documents\\Programming\\Java\\LabsItmo\\ProgLab5_1\\src\\ru\\ifmo\\se\\lab5\\Doctors.json"; //Путь к Json файлу
    Scanner sc;
    //JSONParser jsonParser = JSONParser();
    StringBuilder jsonStrBuilder = new StringBuilder();
    Vector<Map<String , String>> doctors = new Vector<>();//Масив из словарей(Dictionary)
    void addDoctor(){
        for(;;) {
            String command = scan.nextLine();// команда которая приходить из командной строки
            String load = "^load$";
            String removeElement = "^remove\\s\\{.*[:]{1}.*[,].*[:]{1}.*[,].*[:]{1}.*[,].*[:]{1}.*\\}$";
            String info = "^info$";
            String addElement = "^add\\s\\{.*[:]{1}.*[,].*[:]{1}.*[,].*[:]{1}.*[,].*[:]{1}.*\\}$";
            String removeIndex = "^remove\\s\\{\\d*\\}";
            String show = "^show$";
            String remove_first = "^remove_first$";
            if (Pattern.compile(load).matcher(command).find()) {
                System.out.println("load");
                load();
            } else if (Pattern.compile(removeElement).matcher(command).find()) {
                System.out.println("removeElement");
                Map<String , String> m = new HashMap<>();
                Matcher matcher = Pattern.compile("[a-zA-Z0-9\"]*[:]{1}[a-zA-Z0-9А-Яа-я\"]*").matcher(command);
                while(matcher.find())
                    System.out.println(matcher.group());

            } else if (Pattern.compile(info).matcher(command).find()) {
                System.out.println("info");
            } else if (Pattern.compile(addElement).matcher(command).find()) {
                System.out.println("addElement");
            } else if (Pattern.compile(removeIndex).matcher(command).find()){
                System.out.println("addElement");
            } else if(Pattern.compile(show).matcher(command).find()){
                System.out.println("show");
            } else if(Pattern.compile(remove_first).matcher(command).find()){
                System.out.println("remove_first");
            }else{
                System.out.println("----- вы вели еправльную команду");
            }
            /**doctors.get(0).get("name");
             *
             */
            //for(StringBuilder i : jsonStrBuilder)
            System.out.println("Доктор добавлен!");
        }
    }
    public void load(){
        try {
            sc = new Scanner(new File(jsonFileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("----");
        }
        while (sc.hasNext()){
            jsonStrBuilder.append(sc.next());
        }
        sc.close();
        System.out.println(jsonStrBuilder.toString());
        JSONObject jsonObject = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        try {
            //jsonObject = (JSONObject) new JSONParser().parse(jsonStrBuilder.toString());

            jsonArray = (JSONArray) new JSONParser().parse(jsonStrBuilder.toString());// массив из докторов в формате Json
        }catch (ParseException e){
            e.printStackTrace();
        }
        Iterator<JSONObject> iterator = jsonArray.iterator();


        while (iterator.hasNext()){
            Map<String , String> m = new HashMap<>();
            JSONObject jsonResult = new JSONObject();
            jsonResult = (JSONObject) iterator.next(); // итератор для обхода массива jsonArray

            System.out.println(jsonResult);
            try {
                m.put("name", jsonResult.get("name").toString());
                m.put("lastName", jsonResult.get("lastName").toString());
                m.put("address", jsonResult.get("address").toString());
                m.put("age", jsonResult.get("age").toString());
                doctors.add(m);
            }catch (NullPointerException e){
                e.printStackTrace();
            }

        }
    }

}
