/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amigo
 */
public class Bird {

    private String name;
    private String latinName;
    private int observed = 0;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
    }
    
    public void addObservation(){
        observed++;
    }
    
    public int observed(){
        return observed;
    }
    
    public String name(){
        return name;
    }
    
    public String latinName(){
        return latinName;
    }

}
