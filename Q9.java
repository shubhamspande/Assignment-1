import java.util.Scanner;

public class Q9 {
	double area(double r)
	{
        return (r*r*3.14);
    }

	public static void main(String[] args) {
		
		 Scanner sc =new Scanner(System.in);
	        System.out.println("radius of circle : ");
	        double r =sc.nextDouble();
	        Q9 s1=new Q9();
	        System.out.println("Area of circle: "+s1.area(r));
	    }

	}


