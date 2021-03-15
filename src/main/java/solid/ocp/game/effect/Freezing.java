package solid.ocp.game.effect;

import solid.ocp.game.Goblin;

public class Freezing extends TemporaryEffect {

    private final int slowFactor;

    public Freezing(Goblin goblin, int initialDuration, int slowFactor) {
        super(goblin, initialDuration);
        this.slowFactor = slowFactor;
    }

    @Override
    protected void apply() {
        goblin.reduceMovementSpeed(goblin.getBaseMovementSpeed() / slowFactor);
    }
}
