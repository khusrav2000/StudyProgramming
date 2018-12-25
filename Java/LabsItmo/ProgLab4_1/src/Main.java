import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Doctor doc1 = new Doctor("Ганнибал" , "Лектор");
        //Doctor doc2 = new Doctor("Григори" , "Хаус");
        //doc1.knowAboutDoctor(doc2);
        //Room room = new Room();
        //room.setDoctorForThisRoom(doc1);
        Pharmacy pharmacy = new Pharmacy();
        for(int i = 0 ; i < 10 ; i ++) {
            System.out.println("1: Принять Поциента");
            System.out.println("2: Добавить доктора");
            Scanner scan = new Scanner(System.in);
            int answer = scan.nextInt();
            if(answer == 1){
                takeThePatient();
            }
            else{
                addDoctor();
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
    private static void takeThePatient(){
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
        age = scan.nextInt();
        System.out.println("Ваш адресс: ");
        adress = scan.next();
        System.out.println("Ваш номер телефона: ");
        phone = scan.next();
        try{
            Connection connection = DriverManager.getConnection(DB_URL , DB_login , DB_password);
            String sql1 = "INSERT INTO patients (name , surname , age , adress , phone) " +
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
            e.printStackTrace();
        }
    }
    private static void addDoctor(){

    }
}
