import javax.xml.transform.Result;
import java.sql.*;

public class Main {
    public static void main(String... args) throws SQLException {
        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/firstDatabase",
                    "postgres", "123");
        }catch (Exception e){
            System.out.println("Нет базы");
            e.printStackTrace();
            //e.getMessage();
        }
        ResultSet st = null;
        try {
            Statement statement = connection.createStatement();
            //statement.executeUpdate("INSERT INTO tablenames (name , surname) VALUES('KHUSRAV' , 'ASHURZODA')");
            st = statement.executeQuery("SELECT * FROM tablenames");

        }catch (Exception e){
            e.printStackTrace();
        }
        while (st.next()){
            System.out.println(st.getString(1));
        }

    }
}
