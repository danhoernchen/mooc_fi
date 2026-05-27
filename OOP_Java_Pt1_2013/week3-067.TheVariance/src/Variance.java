import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for(int num : list){
            sum += num;
        }
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        double sum = (double)sum(list);
        double size = (double)list.size();
        return sum/size;
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        ArrayList<Double> squared = new ArrayList<Double>();
        double average = average(list);
        for(int num : list){
            double tempResult = num - average;
            tempResult = Math.pow(tempResult, 2);
            squared.add(tempResult);
        }
        double squaredSum = 0.0;
        for(double num2 : squared){
            squaredSum += num2;
        }
        System.out.println(average);
        System.out.println(squared);
        return (squaredSum/((double)squared.size() -1));
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
