/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amigo
 */
import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> playersOnTeam = new ArrayList<Player>();
    private int maxPlayers = 16;

    public Team(String name) {
        this.name = name;
    }
    
    public void addPlayer(Player newPlayer){
        if(playersOnTeam.size() >= maxPlayers){
            return;
        }
        playersOnTeam.add(newPlayer);
    }
    
    public void setMaxSize(int max){
        this.maxPlayers = max;
    }
    
    public void printPlayers(){
        for(Player player:playersOnTeam){
            System.out.println(player);
        }
    }

    public String getName() {
        return name;
    }
    
    public int size(){
        return playersOnTeam.size();
    }
    
    public int goals(){
        int totalGoals = 0;
        for(Player player: playersOnTeam){
            totalGoals += player.goals();
        }
        return totalGoals;
    }

}
