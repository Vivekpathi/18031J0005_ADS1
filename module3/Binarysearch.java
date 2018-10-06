package MODULE3;
import java.util.Arrays;
import java.util.Scanner;
public class Binarysearch {
	public static void main(String args[])
	{
		int c, first, last, middle, n, search, array[];
		 
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter number of elements");
	    n = sc.nextInt();
	    array = new int[n];
	 
	    System.out.println("Enter " + n + " integers");
	 
	 
	    for (c = 0; c < n; c++)
	      array[c] = sc.nextInt();
	 Arrays.sort(array);
	 for(int i=0;i<n;i++)
	 {
	 System.out.println(array[i]);
}
	    System.out.println("Enter value to find");
	    search = sc.nextInt();
	 
	    first  = 0;
	    last   = n - 1;
	    int times=0;
	 
	    while( first <= last )
	    {
	    	middle = (first + last)/2;
	    	times++;
	      if ( array[middle] < search )
	        first = middle + 1;    
	      else if ( array[middle] == search )
	      {
	        System.out.println(search + " found at location " + (middle + 1) + ".  "+"found in "+times+" times");
	        break;
	      }
	      else
	         last = middle - 1;
	 
	     // middle = (first + last)/2;
	   }
	}
}
