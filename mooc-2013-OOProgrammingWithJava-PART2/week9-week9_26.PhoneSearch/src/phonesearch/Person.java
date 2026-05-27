/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonesearch;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author amigo
 */
public class Person {

    private String name;
    private String city, street;
    private List<String> numbers;

    public Person(String name) {
        this.name = name;
        this.numbers = new ArrayList<String>();
        this.city = "";
        this.street = "";
    }

    public void addNumber(String number) {
        this.numbers.add(number);
    }

    public void addAddress(String street, String city) {
        this.city = city;
        this.street = street;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        if (street.isEmpty() && city.isEmpty()) {
            return "address unknown";
        }
        return this.street + " " + this.city;
    }

    public List<String> getNumbers() {
        return numbers;
    }

    public void printInfo() {
        System.out.println("address: " + getAddress());
        if (numbers.isEmpty()) {
            System.out.println("phone number not found");
        } else if (numbers.size() < 2) {
            System.out.println("phone number: " + numbers.get(0));
        } else if (numbers.size() < 1) {
            System.out.println("phone number not found");
        } else {
            System.out.println("phone numbers:");
            for (String number : numbers) {
                System.out.println(number);
            }
        }
    }
}
