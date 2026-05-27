
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amigo
 */
public class ShoppingBasket {
    private List<Purchase> purchases;
    
    public ShoppingBasket(){
        purchases = new ArrayList<Purchase>();
    }
    
    public void add(String product, int price){
        for(Purchase purchase : purchases){
            if(purchase.getName().equals(product)){
                purchase.increaseAmount();
                return;
            }
        }
        purchases.add(new Purchase(product, 1, price));
    }
    
    public int price(){
        int total = 0;
        for(Purchase product : purchases){
            total+= product.price();
        }
        return total;
    }
    
    public void print(){
        for(Purchase product : purchases){
            System.out.println(product.getName() + ": " + product.getAmount());
        }
    }
}
