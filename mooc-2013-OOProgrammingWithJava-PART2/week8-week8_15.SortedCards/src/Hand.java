
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amigo
 */
public class Hand implements Comparable<Hand> {
    private ArrayList<Card> cards;
    
    public Hand(){
        cards = new ArrayList<Card>();
    }
    
    public void add(Card card){
        cards.add(card);
    }
    
    public void sort(){
        Collections.sort(cards);
    }
    
    public void sortAgainstSuit(){
        Collections.sort(cards, new SortAgainstSuitAndValue());
    }
    
    public int handWorth(){
        int total = 0;
        for(Card card: cards){
            total += card.getValue();
        }
        return total;
    }
    
    @Override
    public int compareTo(Hand hand){
        return this.handWorth() - hand.handWorth();
    }
    
    public void print(){
        for(Card card: cards){
            System.out.println(card);
        }
    }
    
}
