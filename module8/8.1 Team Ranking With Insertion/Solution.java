
import java.util.Scanner;

class Team
{
	String name;
	int wins,loses,draws;
	public Team(String name,int wins,int loses,int draws)
	{
		this.name=name;
		this.wins=wins;
		this.loses=loses;
		this.draws=draws;
	}
	
}
class SelectionSort 
{ 
    void sort(Team arr[]) 
    { 
        int n = arr.length;
        for (int i = 0; i < n-1; i++) 
        { 
            // Find the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) {
                if (arr[j].wins > arr[min_idx].wins) 
                    min_idx = j; 
                if(arr[j].wins == arr[min_idx].wins) {
                	if (arr[j].loses < arr[min_idx].loses) 
                        min_idx = j; 
                }
                if((arr[j].wins == arr[min_idx].wins)&&(arr[j].loses == arr[min_idx].loses)) {
                	if (arr[j].draws > arr[min_idx].draws) 
                        min_idx = j; 
                }
            }
            Team temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp; 
        } 
    } 
   
    void printArray(Team arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
	if(i!=arr.length-1)
	{
            	System.out.print(arr[i].name+","); 
	}
	else
	{
	System.out.print(arr[i].name);
	}
        System.out.println(); 
    } 
} 
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Team []t= new Team[7];
		int i=0;
		while(sc.hasNext())
		{
		String team = sc.nextLine();
		String [] t2= team.split(",");
		String name1= t2[0];
		int wins1= Integer.parseInt(t2[1]);
		int loses1= Integer.parseInt(t2[2]);
		int draws1= Integer.parseInt(t2[3]);
		t[i]=new Team(name1,wins1,loses1,draws1);
		i++;
		}
		SelectionSort ss =new SelectionSort();
		ss.sort(t);
		ss.printArray(t);
	}
}
