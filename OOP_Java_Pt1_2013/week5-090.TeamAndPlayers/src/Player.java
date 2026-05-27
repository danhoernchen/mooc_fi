/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amigo
 */
public class Player {
    private String name;
    private int numberOfGoals;
    
    public Player(String name, int goals){
        this.name = name;
        this.numberOfGoals = goals;
    }
    
    public Player(String name) {
        this(name, 0);
    }
    
    public String getName(){
        return name;
    }
    
    public int goals(){
        return numberOfGoals;
    }
    
    public String toString(){
        return "" + name + ", goals: " + numberOfGoals;
    }
    
}
