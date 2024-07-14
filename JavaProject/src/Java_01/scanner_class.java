package Java_01;

import java.util.Scanner;

public class scanner_class {

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	/*System.out.println("Please enter a value");
	int a=sc.nextInt() ;
	System.out.println("Plase enter b Value ");
	int b=sc.nextInt();
	System.out.println("sum of a Plus B ");
	int sum= a+b;
	System.out.println(sum);
	
	System.out.println("Enter You name ");
	String name=sc.nextLine();
	System.err.println("Good Boy");
	System.out.println("Enter a value ");
	int c=sc.nextInt();
	System.out.println("Enter b Value ");
	int d=sc.nextInt();
	System.out.println("Enter b value");
	int sum= c+d;
	System.out.println(sum);
	System.out.println("Plaese enter you age");
	 int age=sc.nextInt();
	 
	 sc.close();
	 if (age>=18) {
		 System.out.println("you are elegible for voting");
		 
	 }else {
		System.out.println("not eleigible for voting");
	}*/
	float totalmark=500;
	System.out.println("Enter You marks in English");
	float English=sc.nextInt();
	System.out.println("Enter You marks in Math");
	float Math=sc.nextInt();
	System.out.println("Enter You marks in Urdu");
	float Urdu=sc.nextInt();
	System.out.println("Enter You marks in Hindi");
	float Hindi=sc.nextInt();
	System.out.println("Enter You marks in Marthi");
	float Marthi=sc.nextInt();
	
	float sum=English+Math+Urdu+Hindi+Marthi;
	System.out.println(sum);
	float Persentage =(sum/totalmark)*100;
	System.out.println(Persentage);
	
	
	
	
	}
}
