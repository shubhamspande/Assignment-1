import java.util.Scanner;

public class Q18 {
 
	
	public static void Aoc(double r)
	{
		double area= ((3.14)*r*r);
		System.out.println("Area of Circle is: "+area);	
	} 
    public static void Voc(double r)
    {
    	double r1=r;
    	double volume=((4/3)*3.14*r1*r1*r1);
    	System.out.println("Volume of circle is: "+volume);
    }

	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius: ");
		double r=sc.nextDouble();
		System.out.println("Enter your choice: ");
		System.out.println("1) Area of the circle");
		System.out.println("2) Volume of the circle");
		
		int c=sc.nextInt();
		switch(c)
		{
		case 1:
			Aoc(r);
			break;
		case 2:
			Voc(r);
			break;
		}
		

	}

}
