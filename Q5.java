import java.util.Scanner;

public class Q5 {
	int Counter=0;
	public void isPrime(int a)
	{
	if (a==0 || a==1)
	{
	System.out.println("The numbe isnt a prime number");			
	}
	for(int i=1;i<=a;i++)
	{
		
		if(a % i==0)
		 {

            Counter++;  
         }
         
//         else{
//
//             System.out.println("Number is prime number");
//             break;
		}
	if (Counter==2)
	{
		System.out.println("Number is prime");
	}
	else 
	{
		System.out.println("Number is not prime");
	}
	}

	public static void main(String[] args) {
		 Q5 s1 = new Q5();
	        System.out.println("Enter the number: ");
	        Scanner sc =new Scanner(System.in);
	        int num = sc.nextInt();
	        s1.isPrime(num);

	}

}
