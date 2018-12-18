import ru.ifmo.se.pokemon.*;
public class Main{
    public static void main(String[] args) {
        Battle battle = new Battle();
        System.out.println(args[0]);
        if(args.length > 0) {
            if (args[0].equals("Dedenne")) {
                int k = Integer.parseInt(args[2]);
                battle.addAlly(new Dedenne(args[1], k));
                System.out.printf("%s%s" , "battle add " , args[1]);
            }
            if (args[0].equals("Buizel")) {
                int k = Integer.parseInt(args[2]);
                battle.addAlly(new Buizel(args[1], k));
            }
            if (args[0].equals("Floatzel")) {
                int k = Integer.parseInt(args[2]);
                battle.addAlly(new Floatzel(args[1], k));
            }
            if (args[0].equals("Deino")){
                int k = Integer.parseInt(args[2]);
                battle.addAlly(new Deino(args[1], k));
            }
            if (args[0].equals("Zweilous")) {
                int k = Integer.parseInt(args[2]);
                battle.addAlly(new Zweilous(args[1], k));
            }
            if (args[0].equals("Hydreigon")) {
                int k = Integer.parseInt(args[2]);
                battle.addAlly(new Hydreigon(args[1], k));
            }
        }
        battle.addAlly(new Dedenne("Dedenne", 100));
        battle.addAlly(new Buizel( "Buizel" , 100));
        battle.addAlly(new Floatzel("Floatzel" , 100));
        battle.addFoe(new Deino("Deino", 100));
        battle.addFoe(new Zweilous("Zweilous" , 100));
        battle.addFoe(new Hydreigon("Hydreigon" , 100));
        battle.go();
    }
}