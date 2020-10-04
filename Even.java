package Allprogram;
import java.util.Scanner;
    class Access{
    	private int a;
    	public void getdata(int x)
    	{
    		a = x;
    	}
    	void show_data()
    	{
    		if(a%2==0)
    			System.out.println(" Given number is Even");
    		else
    			System.out.println(" Given number is Odd");
    	}
    }

public class Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Access obj = new Access();
		Scanner sc2 = new Scanner(System.in);
		System.out.println(" Enter the number");
		int c = sc2.nextInt();
		obj.getdata(c);
		obj.show_data();
		

	}

}
