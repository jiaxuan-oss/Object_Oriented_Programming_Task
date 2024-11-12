package game.behaviour;

import edu.monash.fit2099.engine.actions.Action;
import edu.monash.fit2099.engine.actors.Actor;
import edu.monash.fit2099.engine.actors.Behaviour;
import edu.monash.fit2099.engine.positions.Exit;
import edu.monash.fit2099.engine.positions.GameMap;
import edu.monash.fit2099.engine.weapons.Weapon;
import game.action.AttackAction;
import game.Status;
/**
 * Behaviour for attacking players
 * @Author: Teh Jia Xuan
 */
public class SpiderAttackBehaviour implements Behaviour {
    /**
     * Weapon for spider
     */
    private Weapon weapon;

    /**
     * Constructor get weapon for spider
     * @param initWeapon
     */
    public SpiderAttackBehaviour(Weapon initWeapon) {
        weapon = initWeapon;
    }

    /**
     * create an attack action when actor is around
     * @param actor the Actor acting
     * @param map the GameMap containing the Actor
     * @return Action for attacking player or null
     */
    @Override
    public Action getAction(Actor actor, GameMap map) {
        for (Exit exit : map.locationOf(actor).getExits()) {
            if(exit.getDestination().containsAnActor()) {
                Actor surroundActor = exit.getDestination().getActor();
                if (surroundActor.hasCapability(Status.HOSTILE_TO_ENEMY)) {
                    return new AttackAction(surroundActor, exit.getName(), weapon);
                }
            }
        }
        return null;
    }
}
