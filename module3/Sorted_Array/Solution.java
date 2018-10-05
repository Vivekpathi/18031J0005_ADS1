import java.util.Arrays;
import java.util.Scanner;
public class Solution
{ 
	    public static void main(String args[]) 
	    { 
	    	Scanner sc = new Scanner(System.in);
	    	int m = sc.nextInt();
	    	Scanner s = new Scanner(System.in);
	    	int n = s.nextInt();
	    	System.out.println("enter Array1 elements");
	        int arr1[] = new int[m];
	        for(int i = 0; i<m; i++)
	        {
	        	arr1[i] = sc.nextInt();
	        }
	        System.out.println("enter Array2 elements");
	        int arr2[] = new int[n];
	        for(int j = 0;j<n;j++)
	        {
	        	arr2[j] = sc.nextInt();
	        }
	        Arrays.sort(arr1);
	        Arrays.sort(arr2);
	        int[] arr3 = new int[m+n];
	        int i = 0, j = 0, k = 0; 
	        while (i<m && j <n) 
	        {  
	            if (arr1[i] < arr2[j]) 
	                arr3[k++] = arr1[i++]; 
	            else
	                arr3[k++] = arr2[j++]; 
	        } 
	        while (i < m) 
	           arr3[k++] = arr1[i++]; 
	        while (j < n) 
	            arr3[k++] = arr2[j++]; 
	        for(i=0;i<m+n;i++)
	        {
	        System.out.print(arr3[i]);
	        }
	    } 
	} 
