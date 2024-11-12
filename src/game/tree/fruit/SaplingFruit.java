package game.tree.fruit;

import edu.monash.fit2099.engine.actions.ActionList;
import edu.monash.fit2099.engine.actors.Actor;
import game.action.ConsumeFruitAction;

/**
 * A class that represents a Fruit item
*@Author: Teh Jia Xuan
 */
public class SaplingFruit extends Consumable {
    /**
     * Constructor for Fruit
     */
    public SaplingFruit() {
        super("Small Inheritree Fruit", 'o', true, 1);
    }

}
