/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amigo
 */
public class Counter {
    private boolean check;
    private int value;
    
    public Counter(int startingValue, boolean check){
        this.value = startingValue;
        this.check = check;
    }
    
    public Counter(int startingValue){
        this(startingValue,false);
    }
    
    public Counter(boolean check){
        this(0,check);
    }
    
    public Counter(){
        this(0,false);
    }
    
    public int value(){
        return value;
    }
    
    public void increase(int amount){
        if(amount > 0){
            value += amount;
        }
    }
    
    public void increase(){
        this.increase(1);
    }
    
    public void decrease(int amount){
        if(amount > 0){
            if(!check){
                value -= amount;
            } else if (value > 0){
                value -= amount;
                if (value < 0){
                    value = 0;
                }
            }
        }

    }
    public void decrease(){
        if(!check){
            value--;
        } else if(value > 0){
            value--;
        }
    }
    
}
