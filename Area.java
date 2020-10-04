package Allprogram;

public class Area {
      public int a,b,c;
      public float ar;
      public void area1(int x)
      {
    	  a = x;
    	  ar = (float) (3.14*a*a);
    	  System.out.println(ar);
      }
      public void area1(int x,int y)
      {
    	  a = x;
    	  b = y;
    	  System.out.println(a*b);
      }
      public void area1(int x,int y,int z)
      {
    	  a = x;
    	  b = y;
    	  c = z;
    	  System.out.println(a*b*c);
      }
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Area sc1 = new Area();
          sc1.area1(4);
          sc1.area1(4,5);
          sc1.area1(6,5,2);
	}

}
