
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int result = 0;
        int i = 0;
        System.out.println("Type a number:");
        int number = Integer.parseInt(reader.nextLine());
        while(i <= number){
            result += (int)Math.pow(2, i);
            i++;
        }
        System.out.println(result);
    }
}
