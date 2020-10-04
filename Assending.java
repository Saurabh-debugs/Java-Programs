package Allprogram;
import java.util.Arrays;
import java.util.Collections;
public class Assending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
            String arr[ ] = {"tribhuwan","saurabh","abhay","jitendra","nishant"};
            System.out.println(" Before ");
            for(int i=0; i<arr.length;i++)
            {
            	System.out.println(arr[i]);
            }
          
            Arrays.sort(arr);
            System.out.println("After " +Arrays.toString(arr));
            }
	}


