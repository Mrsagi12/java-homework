import java.util.Scanner;


public class Main
{
    public static void f1(int x)
    {
        System.out.println(x / 5);
    }
    
    
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int x = scan.nextInt();
		
		f1(x);
	}
}
