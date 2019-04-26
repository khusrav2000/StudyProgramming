import java.util.Scanner;

public class JavaStringIntroduction {
    public void run(){
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length() + B.length());
        int a = A.compareTo(B);
        if(a > 0) {
            System.out.println("Yes");
        }else
            System.out.println("No");

        System.out.println(A.substring(0,1).toUpperCase() + A.substring(1).toLowerCase() + " " + B.substring(0,1).toUpperCase() + B.substring(1).toLowerCase());
    }

}
