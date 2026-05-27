/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author amigo
 */
public class PersonalDuplicateRemover implements DuplicateRemover {
    private int numOfDuplicates;
    private Set<String> entries;
    
    public PersonalDuplicateRemover(){
        this.numOfDuplicates = 0;
        this.entries = new HashSet<String>();
    }

    @Override
    public void add(String characterString) {
        if(entries.contains(characterString)){
            numOfDuplicates++;
            return;
        }
        entries.add(characterString);
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return numOfDuplicates;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return entries;
    }

    @Override
    public void empty() {
        entries.clear();
        this.numOfDuplicates = 0;
    }
    
}
