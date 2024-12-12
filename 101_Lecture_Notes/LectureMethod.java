/* 
    Lecture note example - Methods
*/

class LectureMethod{
    public static void main(String args[]) {
        // Your Code Goes here!

    printAnimal();
    printAnimal();
    printAnimal();
    printAnimal();
    
    greeting("Spike");
    greeting("Mortis");
    
    double num = raise(200000.42, 5);
    System.out.println(num);
    num = raise(num, 5);
    System.out.println(num);
    num = raise(num, 5);
    System.out.println(num);
    
	}
	
	public static double raise(double salary, int percent){
	    double amount = salary + (salary*(percent/100));
	    return amount;
	}
	
	public String void printAnimal(){
	 System.out.println("_(~)_");
	 System.out.println(" )||(");
	 System.out.println("(@_@)");
	 System.out.println(" ) (");
	}
	
	public static void greeting(String name){
	    System.out.println("Hi" + name);
	    
	}
}