import java.util.Scanner;

public class ProblemsRunner {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex1().pattern));
        }
    }
}
class MyRegex1 {
    String pattern = "^(([0-9]{1,2}|[0-1][0-9][0-9]|[2][0-4][0-9]|[2][5][0-5])\\.){3}([0-9]{1,2}|[0-1][0-9][0-9]|[2][0-4][0-9]|[2][5][0-5])$";
}

