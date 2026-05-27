/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author amigo
 */
public class Farm implements Alive {

    private String owner;
    private Barn barn;
    private List<Cow> cows;

    public Farm(String owner, Barn barn) {
        this.owner = owner;
        this.barn = barn;
        this.cows = new ArrayList<Cow>();
    }

    public void addCow(Cow cow) {
        this.cows.add(cow);
    }

    public String getOwner() {
        return this.owner;
    }

    public void manageCows() {
        for (Cow cow : cows) {
            this.barn.getBulkTank().addToTank(cow.milk());
        }
    }
    
    public void installMilkingRobot(MilkingRobot milkingRobot){
        this.barn.installMilkingRobot(milkingRobot);
    }

    @Override
    public void liveHour() {
        for (Cow cow : cows) {
            cow.liveHour();
        }
    }

    @Override
    public String toString() {
        String result = "";
        result += "Farm owner: " + this.owner + "\n";
        result += "Barn bulk tank: " + this.barn.getBulkTank().toString() + "\n";
        result += "Animals:\n";
        if (cows.isEmpty()) {
            result += "No cows.";
        } else {
            for (Cow cow : cows) {
                result += "        " + cow.toString() + "\n";
            }
        }
        return result;
    }
}
