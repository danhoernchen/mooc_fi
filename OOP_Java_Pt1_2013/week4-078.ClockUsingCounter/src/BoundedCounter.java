/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amigo
 */
public class BoundedCounter {
    private int upperBound;
    private int value;
    
    public BoundedCounter(int upperBound) {
        this.value = 0;
        this.upperBound = upperBound;
    }
    
    public void next() {
        if(value >= upperBound){
            value = 0;
        } else {
            value++;
        }
    }
    
    @Override
    public String toString(){
        if(value < 10){
            return "0" + value;
        } else{
            return Integer.toString(value);
        }
    }
    
    public int getValue(){
        return value;
    }
    
    public void setValue(int newValue){
        if(newValue >= 0 && newValue <= upperBound){
            this.value = newValue;
        }
    }
}
