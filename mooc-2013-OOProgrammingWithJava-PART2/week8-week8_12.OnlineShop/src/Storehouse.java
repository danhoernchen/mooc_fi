
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author amigo
 */
public class Storehouse {

    private Map<String, Integer> products, stock;

    public Storehouse() {
        products = new HashMap<String, Integer>();
        stock = new HashMap<String, Integer>();
    }

    public void addProduct(String product, int price, int initialStock) {
        products.put(product, price);
        stock.put(product, initialStock);
    }

    public boolean take(String product) {
        if (!stock.containsKey(product) || stock.get(product) <= 0) {
            return false;
        }
        stock.put(product, (stock.get(product) - 1));
        return true;
    }

    public int price(String product) {
        if (!products.containsKey(product)) {
            return -99;
        }
        return products.get(product);
    }

    public int stock(String product) {
        if (stock.containsKey(product)) {
            return stock.get(product);
        }
        return 0;
    }
    
    public Set<String> products(){
        return products.keySet();
    }
}
