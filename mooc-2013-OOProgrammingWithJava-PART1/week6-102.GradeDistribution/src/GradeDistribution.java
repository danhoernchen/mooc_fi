
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amigo
 */
public class GradeDistribution {
    ArrayList<Integer> grades;
    private int allGrades = 0;
    private int acceptedGrades = 0;
    
    public GradeDistribution(ArrayList<Integer> initialGrades){
        grades = initialGrades;
    }
    
    public void printGradeDistribution(){
        System.out.println("Grade Distribution: ");
        for(int i = 5; i >= 0; i--){
            String currentGrade = "" + i + ": ";
            for(int grade: grades){
                if(grade == i){
                    currentGrade += "*";
                }
            }
            System.out.println(currentGrade);
        }
    }
    
    public double accepted(){
        for(int grade: grades){
            if(grade > 0){
                acceptedGrades++;
            }
            allGrades++;
        }
        return ((100.0 * acceptedGrades)/allGrades);
    }

}
