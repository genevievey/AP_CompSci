/* 
    Lecture note example - Classes
*/
package pkg;

public class Cow{
        // Global variables
        int numberSpots;
        String flavor;
        boolean isBeef;
        int moosPerHour;
        
        public Cow(){
            numberSpots=17;
            flavor="Wagyu";
            isBeef=false;
            if(isBeef)
                moosPerHour = 0;
            else moosPerHour=87;
            
        }
        
        
        public String getflavor(){
            return flavor;
        }
        
        
        public Cow(int n, String f, boolean b){
            numberSpots = n;
            flavor = f;
            isBeef = b;
            if(isBeef)
                moosPerHour = 0;
            else moosPerHour=87;
        }
        
        public void moo(){
            if(!isBeef){
                int c = 0;
                while(c<moosPerHour){
                    System.out.print("MOOOOO");
                    c++;
                }
            }
            else
            System.out.println("Your " + flavor + " cow is dead");
            
        } 
    }
        
        
	
