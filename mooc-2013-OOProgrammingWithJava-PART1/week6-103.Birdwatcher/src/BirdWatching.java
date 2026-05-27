
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amigo
 */
public class BirdWatching {
    private ArrayList<Bird> birds = new ArrayList<Bird>();
    
    public void add(Scanner reader){
        System.out.print("Name: ");
        String name = reader.nextLine();
        System.out.print("Latin Name: ");
        String latinName = reader.nextLine();
        birds.add(new Bird(name, latinName));
    }
    
    public void observation(Scanner reader){
        System.out.print("What was observed:? ");
        String name = reader.nextLine();
        for(Bird currentBird: birds){
            if(currentBird.name().equals(name)){
                currentBird.addObservation();
                return;
            }
        }
        System.out.println("Is not a bird!");
    }
    
    public void show(Scanner reader){
        System.out.print("What? ");
        String name = reader.nextLine();
        for(Bird currentBird: birds){
            if(currentBird.name().equals(name)){
                System.out.println(currentBird.name() + " (" + currentBird.latinName() + "): " + currentBird.observed());
                return;
            }
        }
    }
    
    public void statistics(){
        for(Bird currentBird : birds){
            System.out.println(currentBird.name() + " (" + currentBird.latinName() + "): " + currentBird.observed());
        }
    }

}
