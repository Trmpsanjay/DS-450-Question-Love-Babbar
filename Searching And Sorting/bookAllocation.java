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
		    int a[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int m=sc.nextInt();
		    System.out.println(findPages(a,n,m));
		}
	}
	
    
 // } Driver Code Ends


//User function Template for Java

private static int[] maxAndSumOfArray(int arr[]){
    int max = Integer.MIN_VALUE;
    int sum = 0;
    for(int x : arr){
        if(x>max)
            max = x;
        sum+=x; 
    }
    int ans[] = {max,sum};
    return ans;
}
private static boolean isValid(int arr[],int n,int k,int mid){
    int numStudent = 1;
    int sum = 0;
    for(int x : arr){
        sum = sum +x;
        if(sum>mid){
            numStudent++;
            sum = x;
        }
        if(numStudent>k)
            return false;
    }
    return true;
}



public static int findPages(int[]a,int n,int m)
{
    //edge case
    if(n<m)
        return -1;
    
    int arr[] = maxAndSumOfArray(a);
    int start = arr[0]; // start would be max
    int end = arr[1];  // end will be max sum
    //System.out.println(start+" sum : "+end);
    int res = Integer.MAX_VALUE;
    while(start<=end){
        int mid = (start +end)/2;   // removes integer overflow
        if(isValid(a,n,m,mid)){
            res =Math.min(res,mid);
            end = mid-1;
        }else{
            start = mid+1;
        }
    }
    return res;
    
}

// { Driver Code Starts.

}  // } Driver Code Ends
