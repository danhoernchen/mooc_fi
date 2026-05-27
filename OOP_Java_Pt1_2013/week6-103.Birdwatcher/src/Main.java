
import java.util.Scanner;

public class Main {  

    public static void main(String[] args) {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
    Scanner reader = new Scanner(System.in);
    String input = "";
    BirdWatching birds = new BirdWatching();
    while(true){
        System.out.print("? ");
        input = reader.nextLine();
        if(input.equals("Add")){
            birds.add(reader);
        } else if(input.equals("Observation")){
            birds.observation(reader);
        } else if (input.equals("Statistics")){
            birds.statistics();
        } else if (input.equals("Show")){
            birds.show(reader);
        } else if (input.equals("Quit")){
            break;
        }
    }
            
    }

}
