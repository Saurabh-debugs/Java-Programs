package Allprogram;

public class Array {
      static int sum = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int [] {33,3,4,13,10};
	//*	for(int i=0;i<a.length;i++)
	//	{
		//	sum = sum +a[i];
		//}  
		for(int i: a)
  System.out.println(" sum is " +i); 
	}

}
switch (k)
   {
	  case 1:
		  obj1.deposit();
		  break;
	  case 2:
		  obj1.withdraw();
		  break;
	  case 3:
		  obj1.transfer();
		  break;
	  case 4:
		  obj1.show_val();
		  break;
	  case 5:
		System.out.println("Thanks for visit");
		break;
		default:
			System.out.println("plaese enter valid number");