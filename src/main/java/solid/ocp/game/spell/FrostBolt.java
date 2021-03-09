package solid.ocp.game.spell;

public class FrostBolt extends Spell {

    public int slowFactor = 2;

    public FrostBolt() {
        super(10, 15);
    }

    public int getSlowFactor() {
        return slowFactor;
    }
}
