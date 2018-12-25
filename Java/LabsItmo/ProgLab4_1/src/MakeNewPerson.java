import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Random;
import java.sql.*;
import static java.lang.Math.abs;
import static java.lang.Math.round;

public class MakeNewPerson {
    final String DB_URL = "jdbc:postgresql://localhost:5432/firstDatabase";
    final String DB_login = "postgres";
    final String DB_password = "123";
    MakeNewPerson(){
        ResultSet st = null;
        try{
            Connection connection = DriverManager.getConnection(DB_URL , DB_login , DB_password);
            Statement statement = connection.createStatement();
            st = statement.executeQuery("SELECT * FROM tablenames ORDER BY RANDOM() LIMIT 1");
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            while (st.next()){
                System.out.println(st.getString("name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public String getName(){
        String[] names = {"Хусрав",
                "Искандар",
                "Фаррух",
                "Самараиддин",
                "Ксения",
                "Абубакр"
        };
        Random rand = new Random();
        return names[abs(rand.nextInt()) % (names.length)];
    }
    public String getSurname(){
        return "";
    }
    public Double getTemperature(){
        Random rand = new Random();
        Double valuetemperatute = abs(rand.nextDouble() * 10) % 4.0 + 37;
        valuetemperatute *= 10.0;
        valuetemperatute = round(valuetemperatute) / 10.0;
        return valuetemperatute;
    }
}
