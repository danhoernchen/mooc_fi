import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private Random random = new Random();
    private String alphabet = "abcdefghijklmnopqrstvwxyz";
    private int length;
    private String password;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        int i = 0;
        password = "";
        while (i < length){
            password += alphabet.charAt(random.nextInt(alphabet.length()));
            i++;
        }
        return password;
    }
}
