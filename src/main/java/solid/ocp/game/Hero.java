package solid.ocp.game;

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

        if (spell.getSpellType().equals(SpellType.FROST_BOLT))
            goblin.slow();
    }
}
