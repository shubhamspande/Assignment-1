//differences between float, double, and BigDecimal data types
//by performing arithmetic operations with high precision numbers.


import java.math.BigDecimal;
import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Float1: ");
		Float f1=sc.nextFloat();
		System.out.println("Enter Float2: ");
		Float f2=sc.nextFloat();
		System.out.println("Addition: "+(f1+f2));
		System.out.println("Division: "+(f1-f2));
		System.out.println("Multiplication: "+(f1*f2));
		System.out.println("Division: "+(f1/f2));
		
		System.out.println("Enter Double1: ");
		Double db1=sc.nextDouble();
		System.out.println("Enter Double2: ");
		Double db2=sc.nextDouble();
		System.out.println("Addition: "+(db1+db2));
		System.out.println("Division: "+(db1-db2));
		System.out.println("Multiplication: "+(db1*db2));
		System.out.println("Division: "+(db1/db2));
		
		System.out.println("Enter BD1: ");
		BigDecimal BD1=sc.nextBigDecimal();
		System.out.println("Enter BD2: ");
		BigDecimal BD2=sc.nextBigDecimal();
		
		System.out.println("Addition: "+(BD1.add(BD2) ));
		System.out.println("subtraction: "+(BD1.subtract(BD2) ));
		System.out.println("multiplication: "+(BD1.multiply(BD2) ));
		System.out.println("Division: "+(BD1.divide(BD2) ));
	}

}
