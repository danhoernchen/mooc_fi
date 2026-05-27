/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amigo
 */
public class Calculator {
    private Reader reader;
    private int calculationCount;
    
    public Calculator(){
        reader = new Reader();
        calculationCount = 0;
    }
    
    
    public void start(){
        while (true){
            System.out.print("command: ");
            String command = reader.readString();
            if(command.equals("end")){
                break;
            }
            if(command.equals("sum")){
                sum();
            } else if (command.equals("difference")){
                difference();
            } else if (command.equals("product")){
                product();
            }
        }
        statistics();
    }
    
    private void sum(){
        int value1 = reader.readInteger("value 1: ");
        int value2 = reader.readInteger("value 2: ");
        System.out.println("sum of the values " + (value1 + value2));
        calculationCount++;
    }
    
    private void difference(){
        int value1 = reader.readInteger("value 1: ");
        int value2 = reader.readInteger("value 2: ");
        System.out.println("difference of the values " + (value1 - value2));
        calculationCount++;
    }
    
    private void product(){
        int value1 = reader.readInteger("value 1: ");
        int value2 = reader.readInteger("value 2: ");
        System.out.println("product of the values " + (value1 * value2));
        calculationCount++;
    }
    
    private void statistics(){
        System.out.println("Calculations done " + calculationCount);
    }
}
