package ru.ifmo.se.lab5;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

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
    void addDoctor(){
        connectToDatabase();
        String name ;
        String surname;
        int age ;
        String adress ;
        String phone ;
        System.out.println("Ваше имя: ");
        Scanner scan = new Scanner(System.in);
        name = scan.next();
        System.out.println("Ваша Фамилия: ");
        surname = scan.next();
        System.out.println("Сколько вам лет: ");
        try {
            age = scan.nextInt();
        } catch (Exception e) {
            System.out.println("Вы вели неправелный возраст");
            return;
        }
        System.out.println("Ваш адресс: ");
        scan.nextLine();
        adress = scan.nextLine();
        System.out.println("Ваш номер телефона: ");
        phone = scan.next();
        try{
            //Connection connection = DriverManager.getConnection(DB_URL , DB_login , DB_password);
            String sql1 = "INSERT INTO doctors (name , surname , age , adress , phone) " +
                    "VALUES(?,?,?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql1);
            /*String sql = "INSERT INTO patients (name , surname , age , adress , phone) " +
                    "VALUES" + "(" + name + ", " + surname + ", " + age + ", " + adress + ", " + phone + ")";
            String tt = "INSERT INTO patients (name , surname , age , adress , phone) " +
                    "VALUES ('wer' , 'rew' , 17 , 'wqerwqeqeqweq' , '+79819710947')";
            */
            statement.setString(1 , name);
            statement.setString(2 , surname);
            statement.setInt(3 , age);
            statement.setString(4 , adress);
            statement.setString(5, phone);
            statement.executeUpdate();
        } catch (Exception e) {
            System.out.println("Не удаётся добавит Доктора");
            e.printStackTrace();
        }
        System.out.println("Доктор добавлен!");
    }
}
