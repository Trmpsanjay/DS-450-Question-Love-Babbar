// { Driver Code Starts
//Initial Template for Java

import java.util.Scanner;
import java.util.*;
import java.util.HashSet;

class Driverclass
{
    // Driver Code
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t>0)
		{
			int n = sc.nextInt();
			int a[] = new int[n];
			
			for(int i=0; i<n; i++)
				a[i] = sc.nextInt();
		    
		    // Making object of GfG	
			Subseq g = new Subseq();
			
			System.out.println(g.findLongestConseqSubseq(a, n));
		
		t--;
		}
	}
}// } Driver Code Ends


//User function Template for Java

class Subseq
{   
    // arr[] : the input array
    // N : size of the array arr[]
    
    // return the length of the longest subsequene of consecutive integers
	static int findLongestConseqSubseq(int arr[], int N)
	{
	    if(arr.length==1)
	        return 1;
	   Arrays.sort(arr);
	   int count = 1;
	   int maxCount =0;
	   for(int i=1;i<N;i++){
	       if((arr[i-1]==arr[i])){
	           continue;
	       }
	       else if(arr[i-1]+1==arr[i]){
	           count++; 
	           //System.out.println(arr[i-1]);
	       }else{
	           count = 1;
	       }
	           
	       if(count>maxCount)
	            maxCount = count;
	   }
	   return maxCount;
	}
}
