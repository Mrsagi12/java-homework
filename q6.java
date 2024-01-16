import java.util.Scanner;


public class Main
{
    public static double f1(double a, double b)
    {
        double c = Math.pow(a, 2) + Math.pow(b, 2);
        c = Math.sqrt(c);
        
        return c;
    }
    
    
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a: ");
	    double a = scan.nextDouble();
		
		System.out.println("Enter b: ");
	    double b = scan.nextDouble();
	    
		double c = f1(a, b);
		
		System.out.println(c);
		
	}
}
