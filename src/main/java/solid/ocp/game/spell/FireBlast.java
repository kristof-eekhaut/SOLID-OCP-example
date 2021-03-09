package solid.ocp.game.spell;

import java.util.Optional;

public class FireBlast extends Spell {

    public FireBlast() {
        super(15, 25);
    }

    public Optional<Integer> getSlowFactor() {
        return Optional.empty();
    }
}
