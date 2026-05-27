
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Until what?");
        int max = Integer.parseInt(reader.nextLine());
        int i = 1;
        int result = 0;
        while(i <= max){
            result += i;
            i++;
        }
        System.out.println(result);
    }
}
