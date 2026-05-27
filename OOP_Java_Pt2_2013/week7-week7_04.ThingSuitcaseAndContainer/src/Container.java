
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
public class Container {

    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Container(int maxWeight) {
        this.maxWeight = maxWeight;
        suitcases = new ArrayList<Suitcase>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.getWeight() + suitcase.totalWeight() <= this.maxWeight) {
            suitcases.add(suitcase);
        }
    }

    public int getWeight() {
        int weight = 0;
        if (!suitcases.isEmpty()) {
            for (Suitcase currentSuitcase : suitcases) {
                weight += currentSuitcase.totalWeight();
            }
        }
        return weight;
    }
    
    public void printThings(){
        for(Suitcase currentSuitcase : suitcases){
            currentSuitcase.printThings();
        }
    }

    @Override
    public String toString() {
        return "" + suitcases.size() + " suitcases (" + this.getWeight() + " kg)";
    }

}
