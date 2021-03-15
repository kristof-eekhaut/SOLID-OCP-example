package solid.ocp.game.spell;

import solid.ocp.game.Goblin;
import solid.ocp.game.Hero;
import solid.ocp.game.effect.Freezing;

public class FrostBolt extends Spell {

    public int slowFactor = 2;

    public FrostBolt() {
        super(10, 15);
    }

    @Override
    public void cast(Hero hero, Goblin goblin) {
        hero.consumeMana(manaCost);
        goblin.damage(damage);
        goblin.addEffect(new Freezing(goblin, 5, slowFactor));
    }
}
