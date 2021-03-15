package solid.ocp.game.spell;

import solid.ocp.game.Goblin;
import solid.ocp.game.Hero;

public class FireBlast extends Spell {

    private int burningDamage = 3;

    public FireBlast() {
        super(15, 15);
    }

    @Override
    public void cast(Hero hero, Goblin goblin) {
        hero.consumeMana(manaCost);
        goblin.damage(damage);
        goblin.burn(burningDamage, 10);
    }
}
