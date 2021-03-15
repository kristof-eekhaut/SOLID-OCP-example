package solid.ocp.game;

import solid.ocp.game.effect.Effect;

import java.util.ArrayList;
import java.util.List;

public class Goblin {

    private final int baseMovementSpeed;
    private final int baseHitPoints;
    private final int baseAttackSpeed;

    private int movementSpeed;
    private int hitPoints;
    private int attackSpeed;

    private final List<Effect> effects = new ArrayList<>();

    public Goblin(int baseHitPoints, int baseMovementSpeed, int baseAttackSpeed) {
        this.hitPoints = this.baseHitPoints = baseHitPoints;
        this.movementSpeed = this.baseMovementSpeed = baseMovementSpeed;
        this.attackSpeed = this.baseAttackSpeed = baseAttackSpeed;
    }

    public int getBaseMovementSpeed() {
        return baseMovementSpeed;
    }

    public int getBaseAttackSpeed() {
        return baseAttackSpeed;
    }

    public void damage(int hitPoints) {
        this.hitPoints -= hitPoints;
    }

    public void reduceMovementSpeed(int reducedMovementSpeed) {
        if (this.movementSpeed > reducedMovementSpeed)
            this.movementSpeed = reducedMovementSpeed;
    }

    public void reduceAttackSpeed(int reducedAttackSpeed) {
        if (this.attackSpeed > reducedAttackSpeed)
            this.attackSpeed = reducedAttackSpeed;
    }

    public void addEffect(Effect effect) {
        effects.add(effect);
    }

    /** Called every second by the game engine */
    public void update() {
        this.movementSpeed = baseMovementSpeed;
        this.attackSpeed = baseAttackSpeed;

        effects.forEach(Effect::update);
    }
}
