package game.tree;

import edu.monash.fit2099.engine.positions.Ground;
import edu.monash.fit2099.engine.positions.Location;

/**
 * An interface that represents a growable ground
 * @Author: Teh Jia Xuan
 */
public interface GrowableGround {
    /**
     * Method to grow ground
     * location to grow
     * @param location
     */
    void grow(Location location);

    /**
     * Method for next stage of ground
     * @return Ground
     */
    Ground nextStage();
}
