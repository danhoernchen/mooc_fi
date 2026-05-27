/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Collection;

/**
 *
 * @author amigo
 */
public class Barn {
    private BulkTank bulkTank;
    private MilkingRobot milkingRobot;
    
    public Barn(BulkTank tank){
        this.bulkTank = tank;
    }
    
    public BulkTank getBulkTank(){
        return this.bulkTank;
    }
    
    public void installMilkingRobot(MilkingRobot milkingRobot){
        this.milkingRobot = milkingRobot;
        milkingRobot.setBulkTank(bulkTank);
    }
    
    public void takeCareOf(Cow cow){
        if(this.milkingRobot == null){
            throw new IllegalStateException("No milking robot installed");
        } else {
            milkingRobot.milk(cow);
        }
    }
    
    public void takeCareOf(Collection<Cow> cows){
        if(this.milkingRobot == null){
            throw new IllegalStateException("No milking robot installed");
        } else {
            for(Cow cow : cows){
                milkingRobot.milk(cow);
            }
        }
    }
    
    
    @Override
    public String toString(){
        return bulkTank.toString();
    }
}
