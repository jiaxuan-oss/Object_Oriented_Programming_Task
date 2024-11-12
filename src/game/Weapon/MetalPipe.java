package game.Weapon;

import edu.monash.fit2099.engine.actions.Action;
import edu.monash.fit2099.engine.actions.ActionList;
import edu.monash.fit2099.engine.actors.Actor;
import edu.monash.fit2099.engine.positions.Location;
import edu.monash.fit2099.engine.weapons.WeaponItem;
import game.Status;
import game.action.AttackAction;

/**
 * A class that represents a Metal Pipe weapon
@Author: Teh Jia Xuan
 */
public class MetalPipe extends WeaponItem {
    /**
     * The amount of damage this weapon will inflict
     */
    private static final int DAMAGE = 1;
    /**
     * A verb to use when displaying the results of attacking with this Weapon
     */
    private static final String VERB = "whack";
    /**
     * An integer of how many percent (as dividend/100) the Actor can hit with this weapon.
     */
    private static final int HIT_RATE = 20;

    /**
     * Constructor for Metal Pipe
     */
    public MetalPipe() {
        super("Metal Pipe", '!', DAMAGE, VERB, HIT_RATE);
    }

    /**
     * Method to add attack action for this weapon
     * attack the actor
     * @param actor the other actor
     * @param location the location of the other actor
     * @return
     */
    @Override
    public ActionList allowableActions(Actor actor, Location location){
        ActionList actions = new ActionList();
        if (actor.hasCapability(Status.HOSTILE_TO_PLAYER)) {
            actions.add(new AttackAction(actor, location.toString(), this));
        }
        return actions;
    }
}
