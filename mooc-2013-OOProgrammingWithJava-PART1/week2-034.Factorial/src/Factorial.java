import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int result = 1;
        int i = 1;
        System.out.println("Type a number:");
        int number = Integer.parseInt(reader.nextLine());
        while(i <= number){
            result *= i;
            i++;
        }
        System.out.println(result);
    }
}
