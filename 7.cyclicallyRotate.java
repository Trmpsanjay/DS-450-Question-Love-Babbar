link : https://practice.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one/0#


import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	    Scanner sc = new Scanner(System.in);
	    int testCases = sc.nextInt();
	    while(testCases-->0){
	        int size = sc.nextInt();
	        int arr[] = new int[size];
	        for(int i=0;i<size;i++){
	            arr[i] = sc.nextInt();
	        }
	        // now rotating by one;
	        //int temp = arr[arr.length-1];
	        for(int i = arr.length-1;i-1>=0;i--){
	            int t = arr[i];
	            arr[i] = arr[i-1];
	            arr[i-1] = t;
	        }
	        
	        for(int data : arr){
	            System.out.print(data+" ");
	        }
	        System.out.println();
	    }
	    
	 }
}
