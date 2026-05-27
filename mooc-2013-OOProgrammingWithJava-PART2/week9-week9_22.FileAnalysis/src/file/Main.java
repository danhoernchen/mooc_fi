package file;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        // test your code here

        File file = new File("src/testfile.txt");
        
        Analysis test = new Analysis(file);
        try{
            System.out.println(test.lines());
        } catch(Exception e){
            System.out.println(e);
        }
        System.out.println(test.characters());
    }
}
