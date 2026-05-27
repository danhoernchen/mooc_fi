/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Random;

/**
 *
 * @author amigo
 */
public class Cow implements Milkable, Alive {

    private int udderCapacity;
    private double volume;
    private String name;
    private Random random = new Random();
    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

    public Cow() {
        this.udderCapacity = 15 + random.nextInt(26);
        this.name = NAMES[random.nextInt(NAMES.length)];
        this.volume = 0;
    }

    public Cow(String name) {
        this.udderCapacity = 15 + random.nextInt(26);
        this.name = name;
        this.volume = 0;
    }

    public String getName() {
        return name;
    }

    public double getCapacity() {
        return udderCapacity;
    }

    public double getAmount() {
        return volume;
    }

    @Override
    public double milk() {
        double amount = this.volume;
        this.volume = 0;
        return amount;
    }

    @Override
    public void liveHour() {
        double generate = Math.ceil(0.7 + (2.0 - 0.7) * random.nextDouble());
        if(this.volume + generate > this.udderCapacity){
            this.volume = this.udderCapacity;
        } else {
        volume += generate;
        }
    }
    
    @Override
    public String toString(){
        return name + " " + volume + "/" + udderCapacity;
    }

}
