import java.lang.invoke.VolatileCallSite;
import java.util.Scanner;
import java.util.Vector;

public class TagContentExtractor {
    public void start(){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        Vector<String> verr = new Vector<>();
        while(testCases>0){
            String line = in.nextLine();
            StringBuilder stringBuilder = new StringBuilder(line);
            int l = 1 ;
            String tag = "<" , inf = "";
            int k  = 0 ;
            for(int i = 0 ; i < stringBuilder.length() ; i++){
                char a = stringBuilder.charAt(i);
                if(a == '<'){
                    verr.add(inf);
                    inf = "";
                    l = 1 ;
                    k ++;
                }
                else{
                    if(a == '>') {
                        tag+=">";
                        verr.add(tag);
                        tag = "<";
                        l = 0;
                        k -- ;
                    }
                    else{
                        if(l == 1)
                            tag+=stringBuilder.charAt(i);
                        else
                            inf+=stringBuilder.charAt(i);
                    }
                }
            }

            testCases--;
        }
        if(k != 0){
            System.out.println("None");
        }
        else{
            Vector<String> chek = new Vector<>();
            for(int i = 0 ; i < verr.size() ; i++){
                String cheked = verr.get(i);
                System.out.println(cheked);
                    /*if(chek.get(1) == "\\"){
                        if(chek.size() == 0 || )
                    }*/
            }
        }
    }
}
