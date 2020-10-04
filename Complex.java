package Allprogram;
public class Complex {
	private int real,img;
	public void get_data(int x,int y)
	{
		real = x;
		img  = y;
	}
	static Complex add(Complex c1,Complex c2)
	{
		Complex c3 = new Complex();
		c3.real = c1.real + c2.real;
		c3.img =  c1.img + c2.img;
	return c3;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
       Complex c1 = new Complex();
       Complex c2 = new Complex();
       Complex c3 = new Complex();
      c1.get_data(4,5);
      c2.get_data(5,7);
      c3 = add(c1,c2);
    System.out.println(c3.real+"+i"+c3.img);
	}}
