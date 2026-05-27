/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonesearch;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author amigo
 */
public class Phonebook {

    private HashMap<String, Person> persons;
    private HashMap<String, List<String>> numberByName;
    private HashMap<String, String> nameByNumber;

    public Phonebook() {
        this.persons = new HashMap<String, Person>();
        this.numberByName = new HashMap<String, List<String>>();
        this.nameByNumber = new HashMap<String, String>();
    }

    public void addPerson(Person person) {
        persons.put(person.getName(), person);
        numberByName.put(person.getName(), person.getNumbers());
    }

    public void removePerson(String name) {
        if (persons.containsKey(name)) {
            persons.remove(name);
            numberByName.remove(name);
        }
    }

    public void addNumber(String person, String number) {
        if (persons.containsKey(person)) {
            persons.get(person).addNumber(number);
            return;
        }
        Person newPerson = new Person(person);
        addPerson(newPerson);
        newPerson.addNumber(number);
    }

    public void addAddress(String name, String street, String city) {
        if (persons.containsKey(name)) {
            persons.get(name).addAddress(street, city);
        } else {
            Person newPerson = new Person(name);
            newPerson.addAddress(street, city);
            addPerson(newPerson);
        }
    }

    public String numberByName(String name) {
        String numbers = "";
        if (numberByName.containsKey(name)) {
            for (String number : numberByName.get(name)) {
                numbers += number + "\n";
            }
            return numbers;
        } else {
            return "not found";
        }
    }

    public String nameByNumber(String number) {
        for (Person current : persons.values()) {
            if (current.getNumbers().contains(number)) {
                return current.getName();
            }
        }
        return "not found";
    }

    public void searchByPersonalInfo(String searched) {
        boolean found = false;
        for (Person person : persons.values()) {
            if (person.getAddress().contains(searched) || person.getName().contains(searched)) {
                person.printInfo();
                found = true;
            }
        }
        if (!found) {
            System.out.println("not found");
        }
    }

    public void filteredSearch(String searched) {
        Map<String, Person> sorted = new TreeMap<String, Person>(persons);
        boolean found = false;
        for (Person person : sorted.values()) {
            if (person.getAddress().contains(searched) || person.getName().contains(searched)) {
                System.out.println(person.getName());
                person.printInfo();
                found = true;
            }
        }
        if (!found) {
            System.out.println("keyword not found");
        }
    }
}
