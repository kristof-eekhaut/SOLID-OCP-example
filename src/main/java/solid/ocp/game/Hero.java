package solid.ocp.game;

import solid.ocp.game.spell.Spell;

public class Hero {

    private String name;
    private int hitPoints;
    private int mana;

    public Hero(String name, int initialHitPoints, int initialMana) {
        this.name = name;
        this.hitPoints = initialHitPoints;
        this.mana = initialMana;
    }

    void cast(Spell spell, Goblin goblin) {
        mana -= spell.getManaCost();
        goblin.damage(spell.getDamage());

        if (spell.getSlowFactor().isPresent()) {
            goblin.slow(spell.getSlowFactor().get());
        }
    }
}
