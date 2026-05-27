
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author amigo
 */
public class Suitcase {

    private ArrayList<Thing> things;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.things = new ArrayList<Thing>();
    }

    public void addThing(Thing thing) {
        if (this.totalWeight() + thing.getWeight() <= this.maxWeight) {
            things.add(thing);
        }
    }

    public int totalWeight() {
        int weight = 0;
        if (!things.isEmpty()) {
            for (Thing currentThing : things) {
                weight += currentThing.getWeight();
            }
        }
        return weight;
    }

    public void printThings() {
        for (Thing currentThing : things) {
            System.out.println(currentThing.toString());
        }
    }

    public Thing heaviestThing() {
        if (things.isEmpty()) {
            return null;
        }
        Thing heaviest = things.get(0);
        for (Thing currentThing : things) {
            if (currentThing.getWeight() > heaviest.getWeight()) {
                heaviest = currentThing;
            }
        }
        return heaviest;
    }

    public String toString() {
        int numOfItems = things.size();
        if (numOfItems > 1) {
            return "" + numOfItems + " things (" + this.totalWeight() + " kg)";
        } else if (numOfItems > 0) {
            return "" + numOfItems + " thing (" + this.totalWeight() + " kg)";
        } else {
            return "empty (0 kg)";
        }
    }
}
