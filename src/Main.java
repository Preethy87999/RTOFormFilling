import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		System.out.println("Developer: V S Preethy ");
		System.out.println("Online Vehicle Registration Portal");
	
		
		Second d =new Second();
		Scanner sc=new Scanner(System.in);
		while(true){
		    System.out.println("Application Open....");
		    System.out.println("1. Data Sorting");
		    System.out.println("2. Edit Application");
		    System.out.println("3. Exit");
		    System.out.println("Enter your Choice");
	        String element=sc.nextLine();
	    	if(element.equals("1")){
		       System.out.println("welcome");
		       d.sort();
	    	}
	    	else if(element.equals("2")){
	    	    d.creation();
	    	}
	    	else if(element.equals("3")){
	    		System.out.println("Execution are finished...");
		      break;
	    	}
	    	else{
		       System.out.println("Enter a Valid Input");
		   }  
		}
	}

}
