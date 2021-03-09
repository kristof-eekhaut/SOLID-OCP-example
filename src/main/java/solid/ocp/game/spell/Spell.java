package solid.ocp.game.spell;

import solid.ocp.game.Goblin;
import solid.ocp.game.Hero;

public abstract class Spell {

    protected final int manaCost;
    protected final int damage;

    public Spell(int manaCost, int damage) {
        this.manaCost = manaCost;
        this.damage = damage;
    }

    public abstract void cast(Hero hero, Goblin goblin);
}
