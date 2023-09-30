//Develop a Java program that demonstrates the differences
//between int, double, and String data types by performing arithmetic operations and concatenation


import java.util.Scanner;

public class Q3 {
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter num1: ");
		int num1=sc.nextInt();
		System.out.println("Enter num2: ");
		int num2=sc.nextInt();
		System.out.println("Addition is: "+(num1+num2));
		System.out.println("Substraction is: "+(num1-num2));
		System.out.println("Multiplicaion is: "+(num1*num2));
		System.out.println("Division is: "+(num1/num2));
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter dub1: ");
		double dub1=sc.nextDouble();
		System.out.println("Enter dub2: ");
		double dub2=sc.nextDouble();
		System.out.println("Addition is: "+(dub1+dub2));
		System.out.println("Substraction is: "+(dub1-dub2));
		System.out.println("Multiplicaion is: "+(dub1*dub2));
		System.out.println("Division is: "+(dub1/dub2));
		
		
		Scanner sc2=new Scanner(System.in);
		System.out.println("String1: ");
		String str1=sc.next();
		System.out.println("String2: ");
		String str2=sc.next();
		System.out.println("Concat: "+(str1+str2));
	}

}
