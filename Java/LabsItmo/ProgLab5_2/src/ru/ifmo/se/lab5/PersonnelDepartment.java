package ru.ifmo.se.lab5;
import com.sun.org.apache.bcel.internal.generic.JsrInstruction;
import com.sun.org.apache.bcel.internal.generic.Type;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.omg.CORBA.MARSHAL;
import sun.security.krb5.internal.PAData;

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

    private final String jsonFileName = "C:\\Users\\KHUSRAV\\Documents\\Programming\\Java\\LabsItmo\\ProgLab5_2\\src\\ru\\ifmo\\se\\lab5\\Pharmacies.json"; //Путь к Json файлу
    Scanner sc;
    //JSONParser jsonParser = JSONParser();
    StringBuilder jsonStrBuilder = new StringBuilder();
    Vector<Pharmacy> pharmacies= new Vector<>();
    //Масив из словарей(Dictionary)
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
            String update = "^update$";
            if (Pattern.compile(load).matcher(command).find()) {
                System.out.println("load");
                load();
            }/* else if (Pattern.compile(removeElement).matcher(command).find()) {
                System.out.println("removeElement");


                Matcher matcher = Pattern.compile("[a-zA-Z0-9\"]*[:]{1}[a-zA-Z0-9А-Яа-я\"]*").matcher(command);
                removeElement(matcher);

            } else if (Pattern.compile(info).matcher(command).find()) {
                System.out.println("info");
                info();
            } else if (Pattern.compile(addElement).matcher(command).find()) {
                System.out.println("addElement");
                Matcher matcher = Pattern.compile("[a-zA-Z0-9\"]*[:]{1}[a-zA-Z0-9А-Яа-я\"]*").matcher(command);
                addElement(matcher);
            } else if (Pattern.compile(removeIndex).matcher(command).find()){
                System.out.println("removeIndex");
                Matcher matcher = Pattern.compile("\\d*").matcher(command);
                matcher.find();
                removeIndex(Integer.parseInt(matcher.group()));
            } else if(Pattern.compile(show).matcher(command).find()){
                System.out.println("show");
                show();
            } else if(Pattern.compile(remove_first).matcher(command).find()){
                System.out.println("remove_first");
                removeFirst();
            }else if(Pattern.compile(update).matcher(command).find()){
                updateJsonFile();
            }
            else{
                System.out.println("----- вы вели еправльную команду");
            }*/
            /**doctors.get(0).get("name");
             *
             */
            //for(StringBuilder i : jsonStrBuilder)
            //System.out.println("Доктор добавлен!");
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
            jsonArray = (JSONArray) new JSONParser().parse(jsonStrBuilder.toString());// массив из докторов в формате Json
        }catch (ParseException e){
            e.printStackTrace();
        }
        Iterator<JSONObject> iterator = jsonArray.iterator();


        while (iterator.hasNext()){
            Pharmacy pharmacy = new Pharmacy();
            JSONObject jsonResult;
            jsonResult = iterator.next(); // итератор для обхода массива jsonArray
            JSONArray medicamets = (JSONArray) jsonResult.get("medicaments");
            Iterator<JSONObject> iteratorTwo = medicamets.iterator();
            while (iteratorTwo.hasNext()){
                JSONObject med = iteratorTwo.next();
                pharmacy.addMedicament((String) med.get("name") ,(Double) med.get("price"));
            }
            JSONObject phar = (JSONObject) jsonResult.get("pharmasist");
            pharmacy.setNameToPharmasist((String) phar.get("name") , (String) phar.get("lastname"));
            pharmacy.setAdress((String) jsonResult.get("adress"));
            pharmacies.add(pharmacy);
        }
    }
    /**public void removeElement(Matcher matcher){
        Map<String , String> delete = new HashMap<>();
        while(matcher.find()) {
            String elementMap = matcher.group();
            System.out.println(elementMap);
            Matcher m = Pattern.compile("[\\w]*").matcher(elementMap);

            m.find();
            String key = m.group();
            m.find();
            m.find();
            String value = m.group();
            System.out.println(key);
            System.out.println(value);
            delete.put(key,value);
        }
        doctors.remove(delete);
    }
    public void info(){
        System.out.println("Type");
        System.out.println(doctors.size());
    }
    public void addElement(Matcher matcher){
        Map<String , String> delete = new HashMap<>();
        while(matcher.find()) {
            String elementMap = matcher.group();
            System.out.println(elementMap);
            Matcher m = Pattern.compile("[\\w]*").matcher(elementMap);

            m.find();
            String key = m.group();
            m.find();
            m.find();
            String value = m.group();
            System.out.println(key);
            System.out.println(value);
            delete.put(key,value);
        }
        doctors.add(delete);
    }
    public void removeIndex(int i){
        doctors.remove(i);
    }
    public void show(){
        for (Map i:doctors){
            for(Object ads : i.keySet()) {
                System.out.print(ads + ":");
                System.out.println(i.get(ads));
            }
        }
    }
    public void removeFirst(){
        doctors.remove(0);
    }
    public void updateJsonFile(){
        JSONArray jsonArray = new JSONArray();
        for(Map i : doctors){
            JSONObject jsonObject = new JSONObject();
            for(Object ads : i.keySet()) {
                System.out.print(ads + ":");
                System.out.println(i.get(ads));
                jsonObject.put(ads , i.get(ads));
            }
            jsonArray.add(jsonObject);
        }
        try (FileWriter file = new FileWriter(jsonFileName)) {
            file.write(jsonArray.toJSONString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    **/
}
