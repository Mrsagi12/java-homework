import java.util.Scanner;


public class Main
{
    public static int f1(int x, int y, int z)
    {
        int sum = x + y + z;
        System.out.println(sum);
        
        return sum / 3;
    }
    
    
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		int x = scan.nextInt();
		
		System.out.println("Enter the second number: ");
		int y = scan.nextInt();
		
		System.out.println("Enter the second number: ");
		int z = scan.nextInt();
		
		int a = f1(x, y, z);
		System.out.println(a);
	}
}
