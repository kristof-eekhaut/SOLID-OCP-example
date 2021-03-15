package solid.ocp.game.effect;

import solid.ocp.game.Goblin;

public class Burning extends TemporaryEffect {

    private final int damagePerSecond;

    public Burning(Goblin goblin,
                   int initialDuration,
                   int damagePerSecond) {
        super(goblin, initialDuration);
        this.damagePerSecond = damagePerSecond;
    }

    @Override
    public void apply() {
        goblin.damage(damagePerSecond);
    }
}
