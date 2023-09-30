import java.util.Scanner;
import java.util.Arrays;
public class Q28 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        System.out.println("Enter size of array : ");
	        int n = sc.nextInt();
	        int arr[] =new int[n];
	        
	        for (int i = 0; i < arr.length; i++) {
	            System.out.println("Enter "+(i+1)+"element of array ");
	            arr[i]=sc.nextInt();
	        }
	        System.out.println("Enter value of a upto which you want to print sorted array element : ");
	        int a =sc.nextInt();
	        sc.close();
	        
	        Arrays.sort(arr);
	        System.out.println("First "+a+"element of sorted array are :");
	        for (int i = 0; i < a; i++) {
	            System.out.println(arr[i]);
	        }

	}

}
