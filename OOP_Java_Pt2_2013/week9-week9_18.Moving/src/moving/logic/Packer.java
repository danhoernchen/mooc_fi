/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.logic;

import java.util.ArrayList;
import java.util.List;
import moving.domain.Box;
import moving.domain.Thing;

/**
 *
 * @author amigo
 */
public class Packer {

    private int boxesVolume;

    public Packer(int boxVolume) {
        this.boxesVolume = boxVolume;
    }

    public List<Box> packThings(List<Thing> things) {
        Box currentBox = new Box(boxesVolume);
        ArrayList<Box> boxes = new ArrayList<Box>();
        boxes.add(currentBox);
        for (Thing currentThing : things) {
            if (currentBox.addThing(currentThing)) {
            } else {
                currentBox = new Box(boxesVolume);
                boxes.add(currentBox);
                currentBox.addThing(currentThing);
            }
        }
        return boxes;
    }

}
