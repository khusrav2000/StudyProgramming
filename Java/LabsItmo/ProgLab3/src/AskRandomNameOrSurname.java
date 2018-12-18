import java.util.Random;

import static java.lang.Math.abs;

public class AskRandomNameOrSurname {
    public String AskRandomName(){
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
    public String AskRandomSurname(){
        return "";
    }
}
