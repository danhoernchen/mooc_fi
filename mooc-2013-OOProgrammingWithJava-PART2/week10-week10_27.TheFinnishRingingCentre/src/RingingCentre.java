
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author amigo
 */
public class RingingCentre {

    private Map<Bird, List<String>> birds;

    public RingingCentre() {
        birds = new HashMap<Bird, List<String>>();
    }

    public void observe(Bird bird, String place) {
        if (birds.containsKey(bird)) {
            birds.get(bird).add(place);
        } else {
            addBird(bird);
            birds.get(bird).add(place);
        }
    }

    public void observations(Bird bird) {
        if (!birds.containsKey(bird)) {
            System.out.println(bird.getLatinName() + " (" + bird.getRingingYear() + ") observations: 0");
        } else {
            System.out.println(bird.getLatinName() + " (" + bird.getRingingYear() + ") observations: " + birds.get(bird).size());
            for (String place : birds.get(bird)) {
                System.out.println(place);
            }
        }
    }

    public void addBird(Bird bird) {
        ArrayList<String> places = new ArrayList<String>();
        birds.put(bird, places);
    }
}
