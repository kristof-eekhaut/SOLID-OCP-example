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
        spell.cast(this, goblin);
    }

    public void consumeMana(int mana) {
        this.mana -= mana;
    }
}
