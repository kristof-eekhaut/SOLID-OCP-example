package solid.ocp.game.spell;

import java.util.Optional;

public class FrostBolt extends Spell {

    public int slowFactor = 2;

    public FrostBolt() {
        super(10, 15);
    }

    public Optional<Integer> getSlowFactor() {
        return Optional.of(slowFactor);
    }
}
