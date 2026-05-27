
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("87.");

    }

    private static void printWithSmileys(String characterString) {
        String stringWithSmileys = "";
        if(characterString.length() % 2 != 0){
            stringWithSmileys = ":) " + characterString + "  :)"; 
        } else {
            stringWithSmileys = ":) " + characterString + " :)";
        }
        printSmileys(stringWithSmileys.length()/2);
        System.out.println(stringWithSmileys);
        printSmileys(stringWithSmileys.length()/2);

    }

    private static void printSmileys(int times) {
        for (int i = 0; i < times; i++) {
            System.out.print(":)");
        }
        System.out.println("");
    }
}
