package Allprogram;
class A{
	 int  c;
	public int add(int x,int y)
	{
		c = x+y;
		return c;
	}
	public int sub(int x,int y)
	{
		c = x-y;
		return c;
	}
}
public class Inheritate extends A {
	public int multiply(int x,int y)
	{
	c = x*y;
	return c;
	}
	public int division(int x,int y)
	{
		c = x/y;
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c;
		Inheritate obj = new Inheritate();
		c = obj.add(2,4);
		System.out.println("adition is " +c);
		c = obj.sub(6,2);
		System.out.println("subtraction is " +c);
		c = obj.multiply(3,4);
		System.out.println("multiply is " +c);
		c = obj.division(6,3);
		System.out.println("division is " +c);
		

	}

}
