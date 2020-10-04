package Allprogram;
import java.util.Scanner;
public class FiboBasic {
	public static void main(String[] args) throws Exception {
		System.out.println("Enter the value");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long start = System.currentTimeMillis();
		int fibn = fib1(n);
		   System.out.println(fibn);
		 long end = System.currentTimeMillis();
		   float sec = (end - start) / 10000F; 
	       System.out.println(sec + " seconds");
		
	} 
	 public static int fib1(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		System.out.println("Hello" +n);
		int fibo1 = fib1(n - 1);
		int fibo2 = fib1(n - 2);
		int fibn = fibo1 + fibo2;

		return fibn;
	}   
}

