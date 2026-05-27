public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int i = 0;
        String stars = "";
        while (i < amount){
            stars += "*";
            i++;
        }
        System.out.println(stars);
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        int i = 1;
        String whitespace = "";
        while (i <= amount){
            whitespace += " ";
            i++;
        }
        System.out.print(whitespace);
    }

    public static void printTriangle(int size) {
        // 40.2
        int stars = 1;
        int white = size - 1;
        while (stars <= size){
            printWhitespaces(white);
            printStars(stars);
            stars++;
            white--;
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int i = 0;
        int white = height - 1;
        int stars = 1;
        while (i < height){
            printWhitespaces(white);
            printStars(stars);
            i++;
            stars += 2;
            white -= 1;
        }
        int stump = 1;
        while( stump < 3){
            printWhitespaces(stars/2 - 2);
            printStars(3);
            stump++;
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
