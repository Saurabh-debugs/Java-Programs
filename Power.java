package Allprogram;
import java.util.Scanner;
public class Power {
   private int a,b;
   public void getdata(int a,int b)
   {
	   this.a = a;
	   this.b = b;
   }
   public void show_data()
   {
	   int i;
	   int s = a;
	   long start = System.currentTimeMillis();
	   for(i=1;i<b;i++)
	   {
		   a =a*s;
	   }
	   long end = System.currentTimeMillis();
	   float sec = (end - start) / 10000F; 
       System.out.println(sec + " seconds");
	   System.out.println(" power is " +a);
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Power obj = new Power();
          Scanner sc2 = new Scanner(System.in);
          Scanner sc1 = new Scanner(System.in);
  		System.out.println(" Enter the number");
  		
        int c = sc2.nextInt();
        System.out.println(" Enter the power");
        int d = sc1.nextInt();
        obj.getdata(c,d);
        obj.show_data();
       
	}

}
