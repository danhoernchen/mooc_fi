/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author amigo
 */
public class Group implements Movable {

    private List<Movable> objects;

    public Group() {
        this.objects = new ArrayList<Movable>();
    }

    public void addToGroup(Movable object) {
        objects.add(object);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable current : objects) {
            current.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        String result = "";
        for (Movable current : objects) {
            result += current.toString() + "\n";

        }
        return result;
    }

}
