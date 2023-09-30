import java.util.Scanner;
public class Q25 {

	public static void main(String[] args) {
		 Scanner sc =new Scanner(System.in);
	        System.out.println("Enter number: ");
	        int num =sc.nextInt();
	        sc.close();

	        if (num>0) {
	            System.out.println("Number is Positive");
	        }
	        else if (num<0) {
	            System.out.println("Number is Negative");
	            
	        }
	        else{
	            System.out.println("It is zero");

	        }

	}

}
