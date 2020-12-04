// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    
		    int arr[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		    
		    int k=sc.nextInt();
		    
		    System.out.println(kthSmallest(arr, 0, n-1, k));
		}
	}
	

    
 // } Driver Code Ends


//User function Template for Java


//not o(n) solution need to be solved using on

// gfg link : https://practice.geeksforgeeks.org/problems/kth-smallest-element5635/1


// o(n) solution link :https://leetcode.com/problems/kth-largest-element-in-an-array/discuss/60312/AC-Clean-QuickSelect-Java-solution-avg.-O(n)-time

public static int kthSmallest(int[] arr, int l, int r, int k) 
{ 
   Arrays.sort(arr);
   return arr[k-1];
} 


// { Driver Code Starts.


}
  // } Driver Code Ends
