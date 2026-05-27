/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

/**
 *
 * @author amigo
 */
public class ProductContainerRecorder extends ProductContainer {
    private ContainerHistory containerHistory;
    
    public ProductContainerRecorder(String productName, double capacity, double initialVolume){
        super(productName, capacity);
        this.containerHistory = new ContainerHistory();
        super.addToTheContainer(initialVolume);
        containerHistory.add(initialVolume);
    }
    
    public void addToTheContainer(double amount){
        super.addToTheContainer(amount);
        containerHistory.add(super.getVolume());
    }
    
    public double takeFromTheContainer(double amount){
        double takenAmount = super.takeFromTheContainer(amount);
        containerHistory.add(super.getVolume());
        return takenAmount;
    }
    
    public String history(){
        return containerHistory.toString();
    }
    
    public void printAnalysis(){
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + this.history());
        System.out.println("Greatest product amount: " + containerHistory.maxValue());
        System.out.println("Smallest product amount: " + containerHistory.minValue());
        System.out.println("Average: " + containerHistory.average());
        System.out.println("Greatest change: " + containerHistory.greatestFluctuation());
        System.out.println("Variance: " + containerHistory.variance());
    }
    
}
