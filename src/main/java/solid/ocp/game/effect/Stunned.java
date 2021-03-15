package solid.ocp.game.effect;

import solid.ocp.game.Goblin;

public class Stunned extends TemporaryEffect {

    public Stunned(Goblin goblin, int initialDuration) {
        super(goblin, initialDuration);
    }

    @Override
    protected void apply() {
        goblin.reduceMovementSpeed(0);
        goblin.reduceAttackSpeed(0);
    }
}
