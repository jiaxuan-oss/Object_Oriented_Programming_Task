package game.Weapon;

import edu.monash.fit2099.engine.weapons.Weapon;

/**
 * Class that represents a weapon for an unarmed Actor (e.g. fists, claws, etc.)
 * @see Weapon
 * @Author: Teh Jia Xuan
 */
public final class LongLegWeapon implements Weapon {
    /**
     * The amount of damage this weapon will inflict
     */
    private int damage;

    /**
     * A verb to use when displaying the results of attacking with this Weapon
     */
    private String verb;
    /**
     * An integer of how many percent (as dividend/100) the Actor can hit with this weapon.
     */
    private int hitRate;

    /**
     * Constructor
     * @param damage damage to health
     * @param verb a word that will be printed in the action
     * @param hitRate a chance to hit
     */
    public LongLegWeapon(int damage, String verb, int hitRate) {
        this.damage = damage;
        this.verb = verb;
        this.hitRate = hitRate;
    }

    /**
     * Constructor
     * @param damage damage to health
     * @param verb a word that will be printed in the action
     */
    public LongLegWeapon(int damage, String verb) {
        this.damage = damage;
        this.verb = verb;
        this.hitRate = 100;
    }

    /**
     * The amount of damage the Weapon will inflict
     *
     * @return the damage, in hitpoints
     */
    @Override
    public int damage() {
        return damage;
    }

    /**
     * A verb to use when displaying the results of attacking with this Weapon
     *
     * @return String, e.g. "punches", "zaps"
     */
    @Override
    public String verb() {
        return verb;
    }

    /**
     * An integer of how many percent (as dividend/100) the Actor can hit with this weapon.
     * @return a chance to hit.
     */
    @Override
    public int chanceToHit() {
        return hitRate;
    }

    /**
     * A string representation of the weapon
     * @return a string representation of the weapon
     */
    @Override
    public String toString(){
        return "Long Leg Attack";
    }
}
