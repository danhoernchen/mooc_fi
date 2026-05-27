/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author amigo
 */
public class Analysis {

    private File file;

    public Analysis(File file) {
        this.file = file;
    }

    public int lines() throws Exception {
        int lines = 0;
        Scanner reader = new Scanner(file);
        while (reader.hasNextLine()) {
            lines++;
            reader.nextLine();
        }
        return lines;
    }

    public int characters() {
        int chars = 0;
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNext()) {
                chars += reader.next().length() + 1;
            }
            return chars;
        } catch (Exception e){
            System.out.println("File not found!");
        }
        return chars;
    }
}
