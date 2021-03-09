package solid.ocp.game;

public class Spell {

    private final int manaCost;
    private final int damage;

    public Spell(int manaCost, int damage) {
        this.manaCost = manaCost;
        this.damage = damage;
    }

    public int getManaCost() {
        return manaCost;
    }

    public int getDamage() {
        return damage;
    }
}
