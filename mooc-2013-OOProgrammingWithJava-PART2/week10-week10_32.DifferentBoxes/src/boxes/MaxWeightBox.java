/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

import java.util.ArrayList;

/**
 *
 * @author amigo
 */
public class MaxWeightBox extends Box {
    private int maxWeight;
    private ArrayList<Thing> things;
    
    public MaxWeightBox(int maxWeight){
        this.maxWeight = maxWeight;
        this.things = new ArrayList<Thing>();
    }
    
    public int currentWeight(){
        int result = 0;
        if(things.isEmpty()){
            return result;
        }
        for(Thing current : things){
            result += current.getWeight();
        }
        return result;
    }

    @Override
    public void add(Thing thing) {
        if(this.currentWeight() + thing.getWeight() > this.maxWeight){
            return;
        } else {
            things.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return things.contains(thing);
    }
    
}
