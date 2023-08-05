import java.util.Scanner;
import java.util.TreeMap;
import java.util.*;
public class Second {
	 public Register r;
	    
	    TreeMap<String, Register> e = new TreeMap<>();
	    
	    public void sort(){
	        System.out.println("Ascending order Sorting");
	        //evenNumbers.put(s1,r);
	        System.out.println("Vehicle Numbers are  Sorted: " + e);
	              
	    }
	       
	   public void creation() {
	       
	       Scanner sc1=new Scanner(System.in);
	       while(true){
	           System.out.println("Edit");
	           System.out.println("1. Add Number");
	           System.out.println("2. Delete the application");
	           System.out.println("3. Search Content");
	           System.out.println("4. Navigation to main");
	           String data;
	           data=sc1.nextLine();
	           if(data.equals("4")){
	        	   System.out.println("Moving to main page...");
	               break;
	           }
	              
	            if(data.equals("1")){
	              System.out.println("Enter Vehical number");
	              String s1 = sc1.nextLine();
	              System.out.println("Enter Vehical name");
	              String s2= sc1.nextLine();
	              System.out.println("Enter name");
	              String s3 = sc1.nextLine();
	              r=new Register(s2,s3);
	             // System.out.println(r);
	              e.put(s1,r);
	              System.out.println("Data is added: ");
	           }
	           else if(data.equals("2")){
	               //System.out.println("added numbers are: " + evenNumbers);
	              System.out.println("Enter Vehical number");
	              String s1 = sc1.nextLine().toUpperCase();
	             System.out.println( e.containsKey(s1));
	              e.remove(s1);
	              System.out.println("After removing "+ e);
	           }
	           else if(data.equals("3")){
	               System.out.println("Enter Vehical number");
	               String s1 = sc1.nextLine();
	              if(e.containsKey(s1)){
	            System.out.println("The Registration portal contains Value " +s1);
	        } else {
	            System.out.println("The Registration portal does not contains Value "+s1);
	        }
	           }
	           else{
	               System.out.println("Enter a valid Input");
	           }
	       }
	   }    
}
