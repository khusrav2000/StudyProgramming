import java.util.*;

public class StringTokens {

    Scanner scan = new Scanner(System.in);
    public void solve() {
        String s = scan.nextLine();
        String[] result = s.split("[ ,.!?_'@]+");
        if(result.length == 0) {
            System.out.println(0);
            return;
        }
        if(result[0].length() == 0)
            System.out.println(result.length - 1);
        else System.out.println(result.length);
        for(String i : result){
            if(i.length() > 0)
                System.out.println(i);
        }
        scan.close();
    }
}
