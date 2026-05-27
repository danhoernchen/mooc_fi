import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        int i = name.length() - 1;
        String reverse = "";
        while(i >= 0){
            reverse += name.charAt(i);
            i--;
        }
        System.out.println(reverse);
    }
}
