package solid.ocp.game.spell;

import solid.ocp.game.Goblin;
import solid.ocp.game.Hero;

public class LightningStrike extends Spell {

    private final int shockDamage = 10;

    public LightningStrike() {
        super(5, 7);
    }

    @Override
    public void cast(Hero hero, Goblin goblin) {
        hero.consumeMana(manaCost);
        goblin.damage(damage);
        goblin.stun();
    }
}
