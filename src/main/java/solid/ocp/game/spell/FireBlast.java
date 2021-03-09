package solid.ocp.game.spell;

import solid.ocp.game.Goblin;
import solid.ocp.game.Hero;

public class FireBlast extends Spell {

    public FireBlast() {
        super(15, 25);
    }

    @Override
    public void cast(Hero hero, Goblin goblin) {
        hero.consumeMana(manaCost);
        goblin.damage(damage);
    }
}
