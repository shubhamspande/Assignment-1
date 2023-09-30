import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 num : ");
        int a1=sc.nextInt();
        System.out.println("Enter 2 num : ");
        int a2=sc.nextInt();
        System.out.println("Enter 3 num : ");
        int a3=sc.nextInt();

        double avg =(double)(a1+a2+a3)/3;
        System.out.println("Average of three number is : "+avg);

	}

}
