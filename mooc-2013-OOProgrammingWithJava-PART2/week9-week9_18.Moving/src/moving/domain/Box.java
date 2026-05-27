/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author amigo
 */
public class Box implements Thing {

    private int maximumCapacity;
    private ArrayList<Thing> items;

    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        this.items = new ArrayList<Thing>();
    }

    public boolean addThing(Thing thing) {
        if(volume() + thing.getVolume() <= maximumCapacity){
            items.add(thing);
            return true;
        }
        return false;
    }

    private int volume() {
        int total = 0;
        for (Thing thing : items) {
            total += thing.getVolume();
        }
        return total;
    }

    @Override
    public int getVolume() {
        return volume();
    }
}
