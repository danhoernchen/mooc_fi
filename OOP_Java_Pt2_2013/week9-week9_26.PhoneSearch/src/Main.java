import java.util.Scanner;
import phonesearch.*;
public class Main {

    public static void main(String[] args) {
        // Start your program here
        // ATTENTION: In your program, you can create only one instance of class Scanner!
        Scanner reader = new Scanner(System.in);
        Phonebook phonebook = new Phonebook();
        TextUserInterface textUI = new TextUserInterface(phonebook, reader);
        
        textUI.start();
    }
}
