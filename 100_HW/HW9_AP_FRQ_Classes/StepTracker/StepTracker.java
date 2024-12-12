import java.util.*;

public class StepTracker{
    public static int steps;
    public static int days;
    public static int activeDays;
    public static double average;
    public static int newSteps;
    
    public static void main(String args[]){
        int days = 0;
        
        while (totalDays()<7) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter this day's total steps:");
            int newSteps = sc.nextInt();
            
            addDailySteps(newSteps);
            average = averageSteps();
        
            System.out.println("New daily average is " + average + " steps over " + totalDays() + " days, with " + steps + " total steps and " + activeDays() + " active days.");
        }
    }
        
    public StepTracker(int a){
        steps = a;
    }
    
    public static int activeDays(){
        return activeDays;
    }
    
    public static int totalDays(){
        return days;
    }
    
    public static double averageSteps(){
        return (steps/days)*1.0;
    }
    
    public static void addDailySteps(int a){
        steps = steps + a;
        if(a>1000){
            activeDays++;
        }
        days++;
    }
        
}