package Java_01;

import java.util.Scanner;

public class If_condition_withScanner_Class08 {

	public static void main(String[] args) {
	   Scanner sc= new Scanner(System.in);
	   System.out.println("Program start");
	   System.out.println("Enter your age");
	   int age=sc.nextInt();
	   if (age>=18) {
		   System.out.println("valid age");
		    }
	   else {
		   System.out.println("Invalid age ");
	    }
        System.out.println("Program end ");
	    }

}
