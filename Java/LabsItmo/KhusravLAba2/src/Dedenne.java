import ru.ifmo.se.pokemon.*;

public class Dedenne extends Pokemon {
    Dedenne(String name , int level){
        super(name , level);
        setStats(67d , 58d , 57d , 81d, 67d, 101d);
        setType(Type.ELECTRIC , Type.FAIRY);
        Move[] moves = new Move[4];
        moves[0] = new WildCharg();
        moves[1] = new Discharge();
        moves[2] = new TailWhip();
        moves[3] = new ChargeBeam();
        setMove(moves);
    }

    class WildCharg extends PhysicalMove {
        WildCharg(){
            super(Type.ELECTRIC , 90d , 100d);
        }
    }
    class Discharge extends SpecialMove{
        Discharge(){
            super(Type.ELECTRIC , 80d , 100d);
        }
    }
    class TailWhip extends StatusMove{
        TailWhip(){
            super(Type.NORMAL , 0d , 100d);
        }
    }
    class ChargeBeam extends SpecialMove{
        ChargeBeam(){
            super(Type.ELECTRIC , 50d , 90d);
        }
    }
}
