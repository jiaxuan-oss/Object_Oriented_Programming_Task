package game.tree.fruit;

import edu.monash.fit2099.engine.actions.ActionList;
import edu.monash.fit2099.engine.actors.Actor;
import edu.monash.fit2099.engine.items.Item;
import game.action.ConsumeFruitAction;

/**
 * A class that represents a Fruit item
 * @Author: Teh Jia Xuan
 */
public abstract class Consumable extends Item{
    /**
     * name of consumable
     */
    private String name;
    /**
     * display character of consumable
     */
    private char displayChar;
    /**
     * boolean to check if consumable is portable
     */
    private boolean portable;
    /**
     * health points of consumable
     */
    private int healthPoints;

    /**
     * Constructor for Fruit
     * @param initName
     * @param initDisplayChar
     * @param initPortable
     * @param initHealthPoints
     */
    public Consumable(String initName, char initDisplayChar, boolean initPortable, int initHealthPoints) {
        super(initName,initDisplayChar, initPortable);
        name = initName;
        displayChar = initDisplayChar;
        portable = initPortable;
        healthPoints = initHealthPoints;
    }

    /**
     * Method to get name of fruit
     *
     * @return name
     */
    public String getName(){
        return name;
    };

    /**
     * Method to get display character of fruit
     *
     * @return displayChar
     */
    public char getDisplayChar(){
        return displayChar;
    }

    /**
     * Method for fruit is portable
     * @return portable
     */
    public boolean isPortable() {
        return portable;
    }

    /**
     * Method to get health points of fruit
     *
     * @return healthPoints
     */
     public int getHealthPoints(){
        return healthPoints;
    }

    /**
     * Method to add consumeFruit action to this fruit
     * @param owner the actor that owns the item
     * @return consumefruitaction for this fruit
     */
    @Override
    public ActionList allowableActions(Actor owner){
        ActionList actions = new ActionList();
        actions.add(new ConsumeFruitAction(this));
        return actions;
    }
}
