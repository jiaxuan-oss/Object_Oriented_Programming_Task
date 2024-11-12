package game.tree;

import edu.monash.fit2099.engine.items.Item;
import edu.monash.fit2099.engine.positions.Exit;
import edu.monash.fit2099.engine.positions.Location;
import game.spawn.SpawnItem;
import game.tree.fruit.Consumable;
import game.tree.fruit.MatureFruit;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * A class that represents a MatureTree
 * Inherit from inheritree
 * @Author: Teh Jia Xuan
 */
public class MatureTree extends Inheritree implements SpawnItem {
    /**
     * fruit spawn rate
     */
    private static double FRUIT_SPAWN_RATE = 0.2;

    /**
     * Constructor for MatureTree
     */
    public MatureTree(){
        super('T');
        consumableToSpawn();
    }

    /**
     * Method indicate item to spawn
     * @return Item to spawn
     */
    @Override
    public void consumableToSpawn(){
        addFruit(new MatureFruit());
    }

    /**
     * produce fruit at 20 percent chance every turn
     * @param location The location of the Ground
     */
    @Override
    public void tick(Location location){
        super.tick(location);
        spawnItem(location);
    }

    /**
     * Method to spawn item
     * @param location
     */
    public void spawnItem(Location location) {
        Random random = new Random();
        double randomNumber = random.nextDouble();
        List<Exit> exits = location.getExits();
        Exit exit = exits.get(random.nextInt(exits.size()));
        Location newLocation = exit.getDestination();
        if (randomNumber <= FRUIT_SPAWN_RATE) {
            //one fruit is produced at one tick
            Consumable fruit = getFruit().get(random.nextInt(getFruit().size()));
            newLocation.addItem(fruit);
        }
    }
}
