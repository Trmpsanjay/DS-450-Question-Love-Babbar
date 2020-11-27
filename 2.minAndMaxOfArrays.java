/*package whatever //do not write package name here */

//gfg link : https://practice.geeksforgeeks.org/problems/maximum-and-minimum-of-array-elements/0

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    public static int findMin(int arr[]){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min)
                min = arr[i];
        }
        return min;
    }
    
    
    
    public static int findMax(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
                max = arr[i];
        }
        return max;
    }
    
    
	public static void main (String[] args) {
	     Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t-->0){
	        int size = sc.nextInt();
    	    int arr[] = new int[size];
    	    for(int i=0;i<size;i++){
    	        arr[i] = sc.nextInt();
    	    }
    	    
    	    System.out.println(findMax(arr)+" "+findMin(arr));
    	    
    	    
    	    
    	    
    	   // //method : 2 simple but o(nlogn)
    	   // Arrays.sort(arr);
    	   // if(arr.length==1)
    	   //     System.out.println(arr[0]+" "+arr[0]);
    	   //else
    	   //     System.out.println(arr[arr.length-1]+" "+arr[0]);
    	    
	    }
	}
}
