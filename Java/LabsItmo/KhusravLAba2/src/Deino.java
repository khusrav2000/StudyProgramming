import ru.ifmo.se.pokemon.*;

public class Deino extends Pokemon{
    Deino (String name , int level){
        super(name , level);
        setStats(52d , 65d , 50d , 45d , 50d , 38d);
        setType(Type.DARK , Type.DRAGON);
        Move[] moves = new Move[2];
        moves[0] = new DoubleTeam();
        moves[1] = new DracoMeteor();
        setMove(moves);
    }
    class DoubleTeam extends StatusMove {
        DoubleTeam(){
            super(Type.NORMAL , 0d , 0d);
        }
    }
    class DracoMeteor extends SpecialMove {
        DracoMeteor(){
            super(Type.DRAGON , 130d , 90d );
        }
    }
}
