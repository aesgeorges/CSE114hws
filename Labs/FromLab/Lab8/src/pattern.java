import java.util.Scanner;

public class pattern {
	public static Scanner stdin = new Scanner(System.in);
	public static int n;
	
	public static void printPattern(int n) {
		int i;
		String s = " ";
		for(i = 1; i < (n + 1); i++) {
			s = i + " " + s;
			System.out.println(s);
		}
	}
	
	public static void reverse(int n) {
		int i;
		String s = "";
		for(i = 1; i < (n + 1); i++) {
			s = s + " " + i;
			System.out.println(s);
		}
	}
	
	public static void main (String[] args) {
		System.out.print("Enter n : ");
		n = stdin.nextInt();
		printPattern(n);
		reverse(n);
	}
}