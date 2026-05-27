
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here. 
        while(true) {
            System.out.println("Input a floating point number or type quit");
            String input = reader.nextLine();
            if (input.equals("quit")) {
                break;
            } else {
                double num = Double.parseDouble(input);
                if (!(num > 40 || num < -30)) {
                    Graph.addNumber(num);
                }
            }
        }

        // Graph is used as follows:
//        Graph.addNumber(7);
//        double value = 13.5;
//        Graph.addNumber(value);
//        value = 3;
//        Graph.addNumber(value);
        // Remove or comment out these lines above before trying to run the tests.
    }
}
