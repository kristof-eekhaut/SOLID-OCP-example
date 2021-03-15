package solid.ocp.game.effect;

import solid.ocp.game.Goblin;

public abstract class TemporaryEffect implements Effect {

    protected final Goblin goblin;
    protected final int initialDuration;
    protected int remainingDuration;

    protected TemporaryEffect(Goblin goblin, int initialDuration) {
        this.goblin = goblin;
        this.initialDuration = initialDuration;
        this.remainingDuration = initialDuration;
    }

    @Override
    public boolean hasEnded() {
        return remainingDuration == 0;
    }

    @Override
    public final void update() {

        if (!hasEnded()) {
            remainingDuration--;
            apply();
        }
    }

    protected abstract void apply();
}
