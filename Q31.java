import java.util.Scanner;
public class Q31 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        System.out.println("Enter range upto which you want to print fibonacci series :");
	        int n=sc.nextInt();

	        int n1=0;
	        int n2=1;
	        System.out.println("Fibonacci series is :");
	        System.out.print(n1+" "+n2+" ");

	        for (int i = 2; i < n; i++) {
	           
	        	int n3=n1+n2;
	            System.out.print(n3+" ");
	            n1=n2;
	            n2=n3;
	        }
	}

}
