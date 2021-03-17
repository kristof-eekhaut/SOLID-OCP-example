package solid.ocp.game;

public class Spell {

    private final SpellType spellType;
    private final int manaCost;
    private final int damage;

    public Spell(SpellType spellType, int manaCost, int damage) {
        this.spellType = spellType;
        this.manaCost = manaCost;
        this.damage = damage;
    }

    public SpellType getSpellType() {
        return spellType;
    }

    public int getManaCost() {
        return manaCost;
    }

    public int getDamage() {
        return damage;
    }
}
