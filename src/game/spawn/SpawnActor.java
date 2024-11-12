package game.spawn;

import edu.monash.fit2099.engine.actors.Actor;
import edu.monash.fit2099.engine.positions.Location;

/**
 * Interface for spawning creatures
 * @Author: Teh Jia Xuan
 */
public interface SpawnActor {
   /**
    * Method indicate creature to spawn
    * @return Actor to spawn
    */
   Actor actorToSpawn();

   /**
    * Method to spawn actor at given location
    * @param location
    */
   void spawn(Location location);

}
