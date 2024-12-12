import java.util.*;

public class RunningAverage{
   /** The number of ratings included in the running average. */
    

    /** The average of the ratings that have been entered. */
    public static double average;
    public static double newRating;
    public static int count;
    public static int processResult;

    // There are no other instance variables.

    /** Creates a RunningAverage object.
    * Postcondition: count is initialized to 0 and average is
    * initialized to 0.0.
    */
    public RunningAverage(){
        int count=0;
        double average=0.0;
    }

    /** Updates the running average to reflect the entry of a new
    * rating, as described in part (a).
    */
    public static void updateAverage(double newVal){
        double num1 = count * average;/* to be implemented in part (a) */
        count++;
        average=(newVal+num1)/count;
    }


    /** Processes num new ratings by considering them for inclusion
    * in the running average and updating the running average as
    * necessary. Returns an integer that represents the number of
    * invalid ratings, as described in part (b).
    * Precondition: num > 0
    */
    public static int processNewRating(double num){
       int num2=0;
        if (num>=0){
            num2++;
        }
        return num2;
    }
    

    /** Returns a single numeric rating. */
    public static double getNewRating(){
        /* implementation not shown */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a new rating:");
        double inputRating = sc.nextDouble();
        return inputRating;
    }
    
    public static void main(String[] args) {
        
        while (count<5) {
            newRating = getNewRating();
            processResult = processNewRating(newRating);
            if (processResult>0) {
                updateAverage(newRating);
                System.out.println("New average is " + average + " over " + count + " ratings.");
            } else {
                System.out.println("Invalid rating.");
            }
        }
        
    }
}
