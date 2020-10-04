
package Allprogram;

import java.util.*;

public class Fibowithoutrecursion {
	public static int f = 0, s = 1, t;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long start = System.currentTimeMillis();
		for (int i = 1; i < n; i++) {
			t = f + s;
			f = s;
			s = t;
		}
		long end = System.currentTimeMillis();
		float sec = (end - start) / 10000F;
		System.out.println(sec + " seconds");
		System.out.println("Value is " + t);
	}

}
