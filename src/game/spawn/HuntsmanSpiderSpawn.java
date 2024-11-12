package game.spawn;

import edu.monash.fit2099.engine.actors.Actor;
import edu.monash.fit2099.engine.positions.Exit;
import edu.monash.fit2099.engine.positions.Location;
import game.creature.HuntsmanSpider;

import java.util.List;
import java.util.Random;
/**
 * A class that represents a HuntsmanSpider spawn
 * @Author: Teh Jia Xuan
 */
public class HuntsmanSpiderSpawn implements SpawnActor {
    /**
     * The spawn rate of HuntsmanSpider
     */
    private static final double SPAWN_RATE = 0.05;
    /**
     * Constructor for HuntsmanSpiderSpawn
     *
     */
    public HuntsmanSpiderSpawn(){
    }

    /**
     * Method to indicate HuntsmanSpider to spawn
     * @return actor to spawn
     */
    @Override
    public Actor actorToSpawn() {
        return new HuntsmanSpider();
    }

    /**
     * Method to spawn HuntsmanSpider at given location
     * if there is no actor in the location
     * spawn there with a chance of percentage
     * @param location the location to spawn the HuntsmanSpider
     */
    @Override
    public void spawn(Location location){
        if(Math.random() <= (SPAWN_RATE)){
            Random random = new Random();
            List<Exit> exits = location.getExits();
            Exit exit = exits.get(random.nextInt(exits.size()));
            Location newLocation = exit.getDestination();
            if(newLocation.getActor() == null) {
                newLocation.addActor(actorToSpawn());
            }
        }
    }
}