
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amigo
 */
public class Jumper implements Comparable {
    private String name;
    private int score;
    private ArrayList<Jump> jumps;
    
    public Jumper(String name){
        this.name = name;
        score = 0;
        jumps = new ArrayList<Jump>();
    }
    
    public void addJump(Jump jump){
        jumps.add(jump);
    }
    
    public String getName(){
        return name;
    }
    
    public Jump getJump(int round){
        return jumps.get(round);
    }
    
    public int getScore(){
        return score;
    }
    
    public void addScore(int score){
        this.score += score;
    }
    
    public String getJumpLengths(){
        String jumpLengths = "";
        for(int i = 0; i < jumps.size(); i++){
            jumpLengths += jumps.get(i).getLength() + " m, ";
        }
        return jumpLengths;
    }
   
    
    @Override
    public int compareTo(Object jumper){
        Jumper otherJumper = (Jumper) jumper;
        return otherJumper.getScore() - this.getScore() ;
    }

}
