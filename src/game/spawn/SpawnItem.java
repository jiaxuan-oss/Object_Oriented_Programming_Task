package game.spawn;

import edu.monash.fit2099.engine.items.Item;
import edu.monash.fit2099.engine.positions.Location;
import game.tree.fruit.Consumable;

import java.util.ArrayList;

/**
 * An interface that represents a spawn item
 * @Author: Teh Jia Xuan
 */
public interface SpawnItem {
    /**
     * Method indicate item to spawn
     * @return Item to spawn
     */
    void consumableToSpawn();

    /**
     * Method to spawn item at given location
     * @param location
     */
    void spawnItem(Location location);
}
