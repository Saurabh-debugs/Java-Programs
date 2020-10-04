package Allprogram;
import java.util.Scanner;
public class FiboRecursion {
	public int fibo(int x)
	{
       if(x==1)
    		return 0;
    		else if( x==2)
    		return 1;
    		else
    		return (fibo(x-1)+fibo(x-2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FiboRecursion obj = new FiboRecursion();
		
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the  number");
		int c = sc.nextInt();
		int b = obj.fibo(c);
		System.out.println("fibo is " +b);
	} }
