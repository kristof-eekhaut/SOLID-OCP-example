package solid.ocp.game;

public class Goblin {

    private final int baseMovementSpeed;
    private final int baseHitPoints;
    private final int baseAttackSpeed;

    private int movementSpeed;
    private int hitPoints;
    private int attackSpeed;

    private int slowedTimeRemaining = 0;
    private int stunnedTimeRemaining = 0;

    public Goblin(int baseHitPoints, int baseMovementSpeed, int baseAttackSpeed) {
        this.hitPoints = this.baseHitPoints = baseHitPoints;
        this.movementSpeed = this.baseMovementSpeed = baseMovementSpeed;
        this.attackSpeed = this.baseAttackSpeed = baseAttackSpeed;
    }

    public void damage(int hitPoints) {
        this.hitPoints -= hitPoints;
    }

    public void slow(int factor, int duration) {
        this.movementSpeed = baseMovementSpeed / factor;
        this.slowedTimeRemaining = duration;
    }

    public void stun(int duration) {
        this.movementSpeed = 0;
        this.attackSpeed = 0;
        this.stunnedTimeRemaining = duration;
    }

    /** Called every second by the game engine */
    public void update() {
        this.slowedTimeRemaining--;
        this.stunnedTimeRemaining--;

        if (slowedTimeRemaining == 0 && stunnedTimeRemaining == 0)
            this.movementSpeed = baseMovementSpeed;

        if (stunnedTimeRemaining == 0)
            this.attackSpeed = baseAttackSpeed;
    }
}
