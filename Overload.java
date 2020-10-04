package Allprogram;

public class Overload {
	public int a,b,c,d;
	public void add(int x,int y)
	{
            a = x;
            b = y;
		System.out.println(a+b);
	}
	public void add(int x,int y,int z)
	{
		a = x;
		b = y;
		c = z;
	     System.out.println(a+b+c);
	}
	public void add(int x,int y,int z,int e)
	{
		a = x;
		b = y;
		c = z;
		d = e;
		System.out.println(a+b+c+d);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Overload sc = new Overload();
           sc.add(4, 5);
           sc.add(6,2,8);
           sc.add(8,9,10,2);
           
	}

}
