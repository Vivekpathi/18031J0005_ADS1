package MODULE3;

public class Pairscount {
		
	static int method (int a[], int n)
	{
		int c=0;
		for (int i = 0; i < n; i++) 
            for (int j = i+1; j < n; j++) 
                if (a[i] == a[j]) 
                    c++; 
        return c; 
    } 
 public static void main(String args[])
 {
	 int a[] = { 1, 1, 2,21,1 }; 
     int n = a.length; 
       
     System.out.println(method(a, n)); 
 }
 }
