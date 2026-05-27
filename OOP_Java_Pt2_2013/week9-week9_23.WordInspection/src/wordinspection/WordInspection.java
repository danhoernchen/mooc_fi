/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordinspection;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author amigo
 */
public class WordInspection {

    private File file;
    private ArrayList<String> words;

    public WordInspection(File file) {
        this.file = file;
        readFile();
    }

    public int wordCount() {
        return words.size();
    }

    public List<String> wordsContainingZ() {
        ArrayList<String> result = new ArrayList<String>();
        for (String word : words) {
            if (word.contains("z") || word.contains("Z")) {
                result.add(word);
            }
        }
        return result;
    }

    public List<String> wordsEndingInL() {
        ArrayList<String> result = new ArrayList<String>();
        for (String word : words) {
            if (Character.compare(word.charAt(word.length() - 1), 'l') == 0) {
                result.add(word);
            }
        }
        return result;
    }

    public List<String> palindromes() {
        ArrayList<String> result = new ArrayList<String>();
        for (String word : words) {
            String temp = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                temp += word.charAt(i);
            }
            if (temp.equals(word)) {
                result.add(word);
            }
        }
        return result;
    }

    public List<String> wordsWhichContainAllVowels() {
        ArrayList<String> result = new ArrayList<String>();
        for (String word : words) {
            String temp = word.toLowerCase();
            if (temp.contains("a") && temp.contains("e") && temp.contains("i") && temp.contains("o") && temp.contains("o") && temp.contains("u") && temp.contains("ä") && temp.contains("ö") && temp.contains("y")) {
                result.add(word);
            }
        }
        return result;
    }

    public void readFile() {
        words = new ArrayList<String>();
        try {
            Scanner reader = new Scanner(file, "UTF-8");
            while (reader.hasNextLine()) {
                words.add(reader.nextLine());
            }
        } catch (Exception e) {
            System.out.println("File not found!");
        }
    }
}
