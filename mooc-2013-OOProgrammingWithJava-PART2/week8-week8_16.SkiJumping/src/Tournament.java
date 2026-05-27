
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author amigo
 */
public class Tournament {

    private ArrayList<Jumper> jumpers;

    public Tournament() {
        this.jumpers = new ArrayList<Jumper>();
    }

    public void addJumper(Jumper jumper) {
        jumpers.add(jumper);
    }

    public void makeJumps() {

        for (Jumper jumper : jumpers) {
            Jump currentJump = new Jump();
            currentJump.jump();
            jumper.addJump(currentJump);
            jumper.addScore(currentJump.getJudgeScore() + currentJump.getLength());
        }
    }

    public void printJumpingOrder() {
        Collections.sort(jumpers);
        Collections.reverse(jumpers);
        for (int i = 0; i < jumpers.size(); i++) {
            System.out.println("  " + (i+1) + ". " + jumpers.get(i).getName() + " (" + jumpers.get(i).getScore() + " points)");
        }
    }

    public void printJumps(int round) {
        for (Jumper jumper : jumpers) {
            System.out.println("    " + jumper.getName());
            System.out.println(jumper.getJump(round));
        }
    }

    public void printFinalStandings() {
        System.out.println("Thanks!\n");
        System.out.println("Tournament results:");
        System.out.println("Position    Name");
        int i = 0;
        Collections.sort(jumpers);
        for(Jumper jumper : jumpers){
            System.out.println((i+1) + "           " + jumper.getName() + " (" + jumper.getScore() + " points)");
            System.out.println("            jump lengths: " + jumper.getJumpLengths());
            i++;
        }
    }

}
