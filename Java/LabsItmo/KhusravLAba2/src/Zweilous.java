import ru.ifmo.se.pokemon.*;

public class Zweilous extends Pokemon {
    Zweilous(String name , int level){
        super(name , level);
        setStats(72d , 85d , 70d , 65d , 70d , 58d );
        setType(Type.DARK , Type.DRAGON);
        Move[] moves = new Move[3];
        moves[0] = new DoubleTeam();
        moves[1] = new DracoMeteor();
        moves[2] = new DoubleHit();
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
    class DoubleHit extends PhysicalMove {
        DoubleHit(){
            super(Type.NORMAL , 35d , 90d);
        }
    }
}
