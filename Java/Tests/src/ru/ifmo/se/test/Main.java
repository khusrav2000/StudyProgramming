package ru.ifmo.se.test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import ru.ifmo.se.secondPackage.ThClass;
import ru.ifmo.se.test.SecondClass;
public class Main {
    public static void main(String[] args){
        /**
         * int x = 1;
         * Print a
         */
        SecondClass secondClass = new SecondClass();
        ThClass thClass = new ThClass();
        secondClass.printHello();
        Map<String , Integer> ans = new HashMap<String , Integer>();
        String[] key = {"I" , "You" , "I"};
        String[] arguments = {"KHUSRAV" , "Mr.Y" , "ASHURZODA"};
        String[][] g = new String[2][2];
        int num = 0 ;
        ArrayList<String> [] elem = new ArrayList[12];
        String[] ForPrint = new String[3];
        for(int i = 0 ; i < 3 ; i++) {
            int NumAns;
            if(ans.get(key[i]) == null) {
                ans.put(key[i] , num);
                NumAns = num ;
                ForPrint[num] = key[i];
                num ++ ;
            }
            else{
                NumAns = ans.get(key[i]);
            }
            if(elem[NumAns] == null) elem[NumAns] = new ArrayList<String>();
            elem[NumAns].add(Integer.toString(i) + ") " + arguments[i]);
        }
        String S = "";
        for(int i = 0  ; i < 3 ; i ++){
            if(ForPrint[i] == null)
                continue;
            S = S + ForPrint[i] + ":" + '\n';
            if(elem[i] == null)
                continue;
            for(String arg : elem[i])
                S = S + arg + '\n';
            S = S + '\n';

        }
        System.out.print(S);


    }


}
