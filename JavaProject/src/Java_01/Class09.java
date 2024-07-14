package Java_01;

import java.util.Scanner;

public class Class09 {

	public static void main(String[] args) {
		
		
		
		Scanner sc= new Scanner(System.in);
		
        System.out.println("Enter the number between 0 to 5" );
        
        int num=sc.nextInt();
        
        switch(num){
        
        case 0:
        	System.out.println("Zero");
        	break;
        case 1:
        	System.out.println("One");
        	break;
        case 2:
        	System.out.println("Two");
        	break;
   default:
	   System.out.println("you have entered Wrong value");
        }
		

	}

}
