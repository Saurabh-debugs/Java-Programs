package Allprogram;

import java.util.Scanner;
public class fibooptimised {
	public static void main(String[] args) throws Exception {
		System.out.println("Enter the value");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int j = 0;
		int[] gb = new int[n + 1];
		long start = System.currentTimeMillis();
		int fibn = fib1(n, gb);
		System.out.println(fibn);
		long end = System.currentTimeMillis();
		float  sec = (end - start) /10000F;
		System.out.println(sec + " seconds");
	}

	public static int fib1(int n, int[] gb) {
		if (n == 0 || n == 1) {
			return n;
		}
		if (gb[n] != 0) {
			return gb[n];
		}
		System.out.println("Hello" + n);
		int fibo1 = fib1(n - 1, gb);
		int fibo2 = fib1(n - 2, gb);
		int fibn = fibo1 + fibo2;
		gb[n] = fibn;
		return fibn;
	}
}
