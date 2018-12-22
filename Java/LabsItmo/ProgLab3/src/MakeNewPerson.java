import java.util.Random;

import static java.lang.Math.abs;
import static java.lang.Math.round;

public class MakeNewPerson {
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
