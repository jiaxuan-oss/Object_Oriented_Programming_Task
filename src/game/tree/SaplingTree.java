package game.tree;

import edu.monash.fit2099.engine.items.Item;
import edu.monash.fit2099.engine.positions.Exit;
import edu.monash.fit2099.engine.positions.Ground;
import edu.monash.fit2099.engine.positions.Location;
import game.spawn.SpawnItem;
import game.tree.fruit.Consumable;
import game.tree.fruit.SaplingFruit;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * A class that represents a SaplingTree
 * @Author: Teh Jia Xuan
 */
public class SaplingTree extends Inheritree implements SpawnItem , GrowableGround{
    /**
     * fruit spawn rate
     */
    private static double FRUIT_SPAWN_RATE = 0.3;
    /**
     * Constructor for SaplingTree
     */
    public SaplingTree(){
        super('t');
        consumableToSpawn();
    }

    /**
     * Method to add fruit to the tree
     */
    @Override
    public void consumableToSpawn() {
        addFruit(new SaplingFruit());
    }

    /**
     * produce fruit at 30 percent chance every turn
     * @param location The location of the Ground
     */
    @Override
    public void tick(Location location){
        super.tick(location);
        spawnItem(location);
        setAge(getAge() + 1);
        if (getAge() >= 5){
            grow(location);
        }
    }

    /**
     * Method to grow the tree
     * @param location
     */
    @Override
    public void grow(Location location) {
        location.setGround(nextStage());
    }

    /**
     * Method to get the next stage of the tree
     * @return Ground
     */
    @Override
    public Ground nextStage() {
        return new MatureTree();
    }

    /**
     * Method to spawn item
     * @param location
     */
    @Override
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
