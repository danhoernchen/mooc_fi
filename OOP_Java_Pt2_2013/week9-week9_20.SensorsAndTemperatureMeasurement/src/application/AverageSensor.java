/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author amigo
 */
public class AverageSensor implements Sensor {
    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> readings;

    
    public AverageSensor(){
        this.sensors = new ArrayList<Sensor>();
        readings = new ArrayList<Integer>();
    }
    
    public void addSensor(Sensor additional){
        sensors.add(additional);
    }
    
    public List<Integer> readings(){
        return readings;
    }

    @Override
    public boolean isOn() {
        for(Sensor sensor: sensors){
            if(!sensor.isOn()){
                return false;
            }
        }
        return true;
    }

    @Override
    public void on() {
        for(Sensor sensor : sensors){
            if(!sensor.isOn()){
                sensor.on();
            }
        }
    }

    @Override
    public void off() {
        for(Sensor sensor : sensors){
            sensor.off();
        }
    }

    @Override
    public int measure() {
        int total = 0;
        for(Sensor sensor : sensors){
           total += sensor.measure();
        }
        readings.add(total/sensors.size());
        return (total/sensors.size());
    }
    
}
