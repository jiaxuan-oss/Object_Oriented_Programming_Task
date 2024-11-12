package game.tree.fruit;

import edu.monash.fit2099.engine.actions.ActionList;
import edu.monash.fit2099.engine.actors.Actor;
import game.action.ConsumeFruitAction;
/**
 * A class that represents a Fruit item
 * @Author: Teh Jia Xuan
 */
public class MatureFruit extends Consumable {
    /**
     * Constructor for Fruit
     */
    public MatureFruit() {
        super("Large Inheritree Fruit", 'O', true, 2);
    }


}
