package game.tree;

import edu.monash.fit2099.engine.actors.Actor;
import edu.monash.fit2099.engine.positions.Exit;
import edu.monash.fit2099.engine.positions.Ground;
import edu.monash.fit2099.demo.conwayslife.Status;
import edu.monash.fit2099.engine.positions.Location;
import game.tree.fruit.Consumable;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * A abstract class that represents a tree
 * @Author: Teh Jia Xuan
 */
public abstract class Inheritree extends Ground{
    /**
     * age of the tree
     */
    private int age = 0;
    /**
     * fruit list
     */
    private ArrayList<Consumable> fruit = new ArrayList<>();

    /**
     * Constructor for Inheritree
     * @param displayChar
     */
    public Inheritree(char displayChar) {
        super(displayChar);
        addCapability(Status.ALIVE);
    }

    /**
     * Method to check if actor can stand on the tree
     * @param actor the Actor to check
     * @return boolean
     */
    @Override
    public boolean canActorEnter(Actor actor){
        return true;
    }

    /**
     * Method to get fruit list
     * @return fruit list
     */
    public ArrayList<Consumable> getFruit(){
        return fruit;
    }

    /**
     * Method to add fruit to the tree
     * @param newConsumable the fruit to add
     * @return fruit list
     */
    public ArrayList<Consumable> addFruit(Consumable newConsumable){
        fruit.add(newConsumable);
        return fruit;
    }

    /**
     * Method to get age of the tree
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * Method to set age of the tree
     * @param newAge the new age of the tree
     */
    public void setAge(int newAge){
        age = newAge;
    }



}
