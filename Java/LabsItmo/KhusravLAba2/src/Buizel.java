import ru.ifmo.se.pokemon.*;
public class Buizel extends Pokemon {
    Buizel(String name, int level) {
        super(name, level);
        setStats(55d, 65d, 35d, 60d, 30d, 85d);
        setType(Type.WATER);
        Move[] moves = new Move[3];
        moves[0] = new AquaJet();
        moves[1] = new WaterGun();
        moves[2] = new Confide();
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
}

