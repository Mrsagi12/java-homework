import java.util.Scanner;


public class Main
{
    public static void f1(char a, char b, char c)
    {
        System.out.println(c+""+b+""+a);
    }
    
    
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a: ");
	    char a = scan.next().charAt(0);
		
		System.out.println("Enter b: ");
	    char b = scan.next().charAt(0);
	    
	    System.out.println("Enter c: ");
	    char c = scan.next().charAt(0);
	    
		f1(a, b, c);
	}
}
