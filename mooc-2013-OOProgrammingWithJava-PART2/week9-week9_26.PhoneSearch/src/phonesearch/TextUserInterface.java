/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonesearch;

import java.util.Scanner;

/**
 *
 * @author amigo
 */
public class TextUserInterface {

    private Phonebook phonebook;
    private Scanner reader;

    public TextUserInterface(Phonebook phonebook, Scanner reader) {
        this.phonebook = phonebook;
        this.reader = reader;
    }

    public void start() {
        String command;
        System.out.println("phone search\n"
                + "available operations:\n"
                + " 1 add a number\n"
                + " 2 search for a number\n"
                + " 3 search for a person by phone number\n"
                + " 4 add an address\n"
                + " 5 search for personal information\n"
                + " 6 delete personal information\n"
                + " 7 filtered listing\n"
                + " x quit");
        while (true) {
            System.out.print("command: ");
            command = reader.nextLine();
            if (command.equals("1")) {
                System.out.print("whose number: ");
                String name = reader.nextLine();
                System.out.print("number: ");
                String number = reader.nextLine();
                phonebook.addNumber(name, number);
            } else if (command.equals("2")) {
                System.out.print("whose number: ");
                String name = reader.nextLine();
                System.out.println(phonebook.numberByName(name));
            } else if (command.equals("3")) {
                System.out.print("number: ");
                String number = reader.nextLine();
                System.out.println(phonebook.nameByNumber(number));
            } else if (command.equals("4")) {
                System.out.print("whose address: ");
                String name = reader.nextLine();
                System.out.print("street: ");
                String street = reader.nextLine();
                System.out.print("city: ");
                String city = reader.nextLine();
                phonebook.addAddress(name, street, city);
            } else if (command.equals("5")) {
                System.out.print("whose information: ");
                String searched = reader.nextLine();
                phonebook.searchByPersonalInfo(searched);
            } else if (command.equals("6")) {
                System.out.print("whose information: ");
                String name = reader.nextLine();
                phonebook.removePerson(name);
            } else if (command.equals("7")) {
                System.out.print("keyword (if empty, all listed");
                String searched = reader.nextLine();
                phonebook.filteredSearch(searched);
            } else if (command.equals("x")) {
                break;
            }
        }
    }
}
