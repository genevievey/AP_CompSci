/* 
    Lecture note example - If Statements
*/
import java.util.Scanner;
class LectureIf{
    public static void main(String args[]) {
        // our Code Goes here!
        Scanner sc = new Scanner(System.in);
        System.out.println("You've joined and Alien Exchange Program");
        System.out.println("Pick an Alien to take in!");
        System.out.println("1. Joey. a fat alien who loves eating pizza");
        System.out.println("2. Bob, a blue alien who loves trees");
        System.out.println("3. Barney, a pruple alien who eats butterflies");
        
        int answer1 = sc.nextInt();
        if(answer1 == 1){
            System.out.println("You picked Joey! WOO!!");
            System.out.println("Where do you guys go for pizza?");
            System.out.println("1. Pizza hut");
            System.out.println("2. Dominos");
            System.out.println("3. 7/11");
            int answer2 = sc.nextInt();
            
            if(answer2 == 1)
            System.out.println("He says its dry... He eats the whole pie including the box");
            else if(answer2 == 2)
            System.out.println("Joey loves it!");
            else if(answer2 == 3)
            System.out.println("Your card declined... embarassing");
        }
        else if(answer1 == 2){
            System.out.println("You picked Bob! WOO!!");
                System.out.println("Where do you guys go to hug trees");
            System.out.println("1. the park");
            System.out.println("2. your neighbors backyard");
            System.out.println("3. 7/11");
            int answer2 = sc.nextInt();
            
            if(answer2 == 1)
            System.out.println("He says they all smell like gross kids");
            else if(answer2 == 2)
            System.out.println("He loves it! Until your neighbor calls the police on you...");
            else if(answer2 == 3)
            System.out.println("He cries after breaking the one skinny tree outside");
        }
        else if(answer1 == 3){
            System.out.println("You picked Barney! WOO!!");
                 System.out.println("Where do you guys go for butterflies?");
            System.out.println("1. an elementary school");
            System.out.println("2. a wedding");
            System.out.println("3. 7/11");
            int answer2 = sc.nextInt();
            
            if(answer2 == 1)
            System.out.println("He tries to eat the kids instead... oopsie");
            else if(answer2 == 2)
            System.out.println("He steals the bride?!");
            else if(answer2 == 3)
            System.out.println("He catches a big, pink butterfly and is super proud of it!");
        }
        else{
            System.out.println("You get Jerry...");
        }
	}
}