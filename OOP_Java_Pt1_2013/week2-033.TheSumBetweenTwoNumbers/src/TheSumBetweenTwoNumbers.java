
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int result = 0;
        System.out.println("First:");
        int first = Integer.parseInt(reader.nextLine());
        System.out.println("Last:");
        int last = Integer.parseInt(reader.nextLine());
        while(first <= last){
            result += first;
            first++;
        }
        System.out.println(result);
    }
}
