package game.action;

import edu.monash.fit2099.engine.actions.Action;
import edu.monash.fit2099.engine.actors.Actor;
import edu.monash.fit2099.engine.positions.GameMap;
import game.tree.fruit.Consumable;

/**
 * Action for consuming fruit
 * @Author: Teh Jia Xuan
 */

public class ConsumeFruitAction extends Action{
    /**
     * The fruit to be consumed
     */
    private Consumable fruit;

    /**
     * Constructor set fruit
     *
     * @param initConsumable the fruit to be consumed
     */
    public ConsumeFruitAction(Consumable initConsumable){
        fruit = initConsumable;
    }

    /**
     * Execute the action of consuming fruit
     * remote item from inventory and heal the actor
     *
     * @param actor The actor performing the action.
     * @param map The map the actor is on.
     * @return a description of the action after actor consume
     */
    @Override
    public String execute(Actor actor, GameMap map) {
        actor.removeItemFromInventory(fruit);
        String message = String.format("%s consumes %s and heals for %d\n", actor, fruit.getName(), fruit.getHealthPoints());
        actor.heal(fruit.getHealthPoints());
        message += String.format("Current HP: %s", actor);
        return message;
    }

    /**
     * Describe the action
     *
     * @param actor The actor performing the action.
     * @return a description of the action
     */

    @Override
    public String menuDescription(Actor actor) {
        return actor + " heal " + actor + " for " + fruit.getHealthPoints() + " by consuming " + fruit.getName();
    }
}
