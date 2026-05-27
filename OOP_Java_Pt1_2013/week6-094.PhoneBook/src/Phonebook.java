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

public class Phonebook {
    private ArrayList<Person> persons = new ArrayList<Person>();
    
    public void add(String name, String number){
        persons.add(new Person(name,number));
    }
    
    public String searchNumber(String name){
        for(Person currentPerson: persons){
            if(currentPerson.getName().equals(name)){
                return currentPerson.getNumber();
            }
        }
        return "number not known";
    }
    
    public void printAll(){
        for(Person currentPerson: persons){
            System.out.println(currentPerson);
        }
    }
    
}
