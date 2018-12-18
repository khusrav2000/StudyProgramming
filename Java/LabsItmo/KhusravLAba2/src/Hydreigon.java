import ru.ifmo.se.pokemon.*;

public class Hydreigon extends Pokemon {
    Hydreigon(String name , int level){
        super(name , level);
        setStats(92d , 105d , 90d , 125d , 90d , 98d);
        setType(Type.DARK , Type.DRAGON);
        Move[] moves = new Move[4];
        moves[0] = new DoubleTeam();
        moves[1] = new DracoMeteor();
        moves[2] = new DoubleHit();
        moves[3] = new Bulldoze();
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
    class Bulldoze extends PhysicalMove{
        Bulldoze(){
            super(Type.GROUND, 60d , 100d);
        }
    }
}
