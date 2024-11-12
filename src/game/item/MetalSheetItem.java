package game.item;

import edu.monash.fit2099.engine.items.Item;

/**
 * A class that represents a MetalSheet item
 * @Author: Teh Jia Xuan
 */
public class MetalSheetItem extends Item {
    /**
     * Constructor for MetalSheetItem
     *
     * @param name the name of this Item
     * @param displayChar the character to use to represent this item if it is on the ground
     * @param portable true if and only if the Item can be picked up
     */
    public MetalSheetItem(String name, char displayChar, boolean portable) {
        super(name, displayChar, portable);
    }
}
