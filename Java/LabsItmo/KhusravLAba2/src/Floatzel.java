import ru.ifmo.se.pokemon.*;

public class Floatzel extends Pokemon {

    Floatzel(String name , int level){
        super(name , level);
        setStats(85d , 105d , 55d , 85d , 50d , 115d);
        setType(Type.WATER);
        Move[] moves = new Move[4];
        moves[0] = new AquaJet();
        moves[1] = new WaterGun();
        moves[2] = new Confide();
        moves[3] = new FocusBlast();
        setMove(moves);

    }
    class AquaJet extends PhysicalMove {
        AquaJet() {
            super(Type.WATER, 40d, 100d);
        }
    }

    class WaterGun extends SpecialMove {
        WaterGun() {
            super(Type.WATER, 40d, 100d);
        }
    }

    class Confide extends StatusMove {
        Confide() {
            super(Type.NORMAL, 0d, 0d);
        }
    }
    class FocusBlast extends SpecialMove{
        FocusBlast(){
            super(Type.FIGHTING , 120d , 70d);
        }
    }


}
