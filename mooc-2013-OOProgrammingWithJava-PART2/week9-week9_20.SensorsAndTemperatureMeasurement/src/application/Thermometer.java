/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author amigo
 */
public class Thermometer implements Sensor {
    private boolean isOn;
    private Random random;
    
    public Thermometer(){
        this.isOn = false;
        this.random = new Random();
    }

    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public void on() {
        isOn = true;
    }

    @Override
    public void off() {
        isOn = false;
    }

    @Override
    public int measure() {
    return random.nextInt(30 - (-30)) + (-30);
    }
    
}
