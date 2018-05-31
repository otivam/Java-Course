import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);

     System.out.println("Number:");
     int numInt = input.nextInt();
     
     if (numInt >= 1 && numInt <= 5){
    	 if (numInt % 2 == 0){
    		 	System.out.println("Even");}
    	 else 
    		 	System.out.println("Odd");}
     
     else if (numInt >= 6 && numInt <= 15){
    	 if (numInt % 3 == 0){
    		 	System.out.println("No rest");}
    	 else 
    			 System.out.println("Have rest");}

     else if(numInt < 0){
    		 	System.out.println("Negative");}
     else if(numInt == 0){
    			 System.out.println("0");}
     else System.out.println("Positive");

 	input.close();
}
}
