import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        
        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        ArrayList<Integer> scores = new ArrayList<Integer>();
        
        System.out.println("Type exam scores, -1 completes:");
        while(true){
            int score = Integer.parseInt(reader.nextLine());
            if(score == -1){
                break;
            }
            scores.add(score);
        }
        ArrayList<Integer> grades = scoresToGrades(scores);
        GradeDistribution gradeDistribution = new GradeDistribution(grades);
        
        gradeDistribution.printGradeDistribution();
        System.out.println("Acceptance percentage: " + gradeDistribution.accepted());
    }
    
    public static ArrayList<Integer> scoresToGrades(ArrayList<Integer> scores){
        ArrayList<Integer> grades = new ArrayList<Integer>();
        for(int score: scores){
            if(score < 0 || score > 60){
                //do nothing
            } else if(score < 30){
                grades.add(0);
            } else if (score < 35){
                grades.add(1);
            } else if (score < 40){
                grades.add(2);
            } else if (score < 45){
                grades.add(3);
            } else if (score < 50){
                grades.add(4);
            } else {
                grades.add(5);
            }            
        }
        return grades;
    }
    
}
