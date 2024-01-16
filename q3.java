import java.util.Scanner;


public class Main
{
    public static void f1(int x, int y)
    {
        System.out.println(x * y);
    }
    
    
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		int x = scan.nextInt();
		
		System.out.println("Enter the second number: ");
		int y = scan.nextInt();
		
		f1(x, y);
	}
}
