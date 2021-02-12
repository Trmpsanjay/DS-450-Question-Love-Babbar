// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
        	int[] array = new int[n];
        	for (int i=0; i<n ; i++ ) {
        		array[i] = sc.nextInt();
        	}
            Solution ob = new Solution();
            long[] ans = new long[n];
            ans = ob.productExceptSelf(array, n); 

           	for (int i = 0; i < n; i++) { 
				System.out.print(ans[i]+" ");
			} 
            System.out.println();
            t--;
        }
    } 
} 
  

// } Driver Code Ends


//User function Template for Java


class Solution 
{ 
	public static long[] productExceptSelf(int arr[], int n) 
	{ 
	    //edge case find zero
	    long ans[] = new long[arr.length];
	    int zeroCount = 0;
	    for(int i : arr){
	        if(i==0)
	            zeroCount++;
	    }
        long sum =1;
        for(int i : arr){
            if(i!=0)
                sum = sum*i;
        }
        if(zeroCount>1)
            return ans;
        if(zeroCount==1){
             for(int i=0;i<ans.length;i++){
                 if(arr[i]!=0){
                     ans[i] = 0;
                 }else
                    ans[i] = sum;
            }
            return ans;
        }
        for(int i=0;i<ans.length;i++){
            ans[i] = sum/arr[i];
        }
        return ans;
       
	} 
} 

