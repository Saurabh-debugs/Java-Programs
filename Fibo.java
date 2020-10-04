package Allprogram;
import java.util.Scanner;
public class Fibo {
	public int a=0,b=1,i,c,n;
       public void fibon(int x)
       {
    	   n = x;
    	   if(n==1)
    	       System.out.println(a);
    	   else if(n==2)
    	   {   System.out.println(a+" "+b);  }   
    	   else
    	   {   System.out.print(a+"\n"+b);
    	   System.out.println();
    	   for(i=3;i<=n;i++)
    	   {
    		    c=a+b;
    			System.out.println(c);
    			a=b;
    			b=c;  
    	   } }
       }
	    public static void main(String[] args) {
		Fibo obj  = new Fibo();
		Scanner s = new Scanner(System.in);
		System.out.println(" Enter the number");
		int c = s.nextInt();
		   obj.fibon(c);
	} 
}
