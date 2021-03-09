package solid.ocp.game;

public class Goblin {

    private final int baseMovementSpeed;
    private final int baseHitPoints;
    private final int baseAttackSpeed;

    private int movementSpeed;
    private int hitPoints;
    private int attackSpeed;

    public Goblin(int baseHitPoints, int baseMovementSpeed, int baseAttackSpeed) {
        this.hitPoints = this.baseHitPoints = baseHitPoints;
        this.movementSpeed = this.baseMovementSpeed = baseMovementSpeed;
        this.attackSpeed = this.baseAttackSpeed = baseAttackSpeed;
    }

    public void damage(int hitPoints) {
        this.hitPoints -= hitPoints;
    }

    public void slow(int factor) {
        this.movementSpeed = baseMovementSpeed / factor;
    }

    public void stun() {
        this.movementSpeed = 0;
        this.attackSpeed = 0;
    }
}
