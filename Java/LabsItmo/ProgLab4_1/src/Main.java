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

        Pharmacy pharmacy = new Pharmacy();
        for(int i = 0 ; i < 10 ; i ++) {
            System.out.println("1: Принять Поциента");
            System.out.println("2: Добавить доктора");
            System.out.println("3: Я доктор и Хочу принят пациента");

            int answer = scan.nextInt();
            if(answer == 1){
                takeThePatient();
            }
            else if (answer == 2){
                addDoctor();
            }
            else{
                IamADoctor();
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
        System.out.println("Ваша фамилия Доктор");
        String surnameDoctor = scan.next();
        System.out.println("Ваша имя Доктор");
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
            }


        }catch (Exception e){
            e.printStackTrace();
            System.out.println("у нас в базе нет такого доктора");
        }
    }
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
        try {
            age = scan.nextInt();
        } catch (Exception e) {
            System.out.println("Вы вели неправелный возраст");
            return;
        }
        System.out.println("Ваш адресс: ");
        adress = scan.next();
        System.out.println("Ваш номер телефона: ");
        phone = scan.next();
        try{
            //Connection connection = DriverManager.getConnection(DB_URL , DB_login , DB_password);
            String sql1 = "INSERT INTO patients (name , surname , age , adress , phone) " +
                    "VALUES(?,?,?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql1);
            statement.setString(1 , name);
            statement.setString(2 , surname);
            statement.setInt(3 , age);
            statement.setString(4 , adress);
            statement.setString(5, phone);
            statement.executeUpdate();
        } catch (Exception e) {
            System.out.println("Не удаётся добавит поциента");
            e.printStackTrace();
        }
        System.out.println("Пациент добавлен!");
    }
    private static void addDoctor(){
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
