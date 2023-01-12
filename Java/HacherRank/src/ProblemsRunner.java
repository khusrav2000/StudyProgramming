import org.omg.CORBA.MARSHAL;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProblemsRunner {

    public static void main(String[] args){
        DateAndTime tagContentExtractor = new DateAndTime();
        tagContentExtractor.start();
    }
}
class MyRegex1 {
    String pattern = "^(([0-9]{1,2}|[0-1][0-9][0-9]|[2][0-4][0-9]|[2][5][0-5])\\.){3}([0-9]{1,2}|[0-1][0-9][0-9]|[2][0-4][0-9]|[2][5][0-5])$";
}

