
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be very useful.
        Scanner reader = new Scanner(System.in);
        TextUserInterface tui = new TextUserInterface(reader);
        
        tui.start();
//        Jump jump = new Jump();
//        jump.jump();

    }
}
