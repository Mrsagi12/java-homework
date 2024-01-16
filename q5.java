import java.util.Scanner;


public class Main
{
    public static void f1(double r)
    {
        double pi = 3.14;
        double s = pi * Math.pow(r, 2);
        double p = 2 * pi * r;
        System.out.println("s = "+s);
        System.out.println("P = "+p);
    }
    
    
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the radius: ");
		double r = scan.nextDouble();
		
		f1(r);
	}
}
