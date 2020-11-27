/*package whatever //do not write package name here */


//gfg link : https://practice.geeksforgeeks.org/problems/reverse-an-array/0#

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t-->0){
	        int size = sc.nextInt();
    	    int arr[] = new int[size];
    	    for(int i=0;i<size;i++){
    	        arr[i] = sc.nextInt();
    	    }
    	    
    	   // int arrRev[] = new int[size];
    	   // for(int i=size-1, j=0;i>=0;i--,j++){
    	   //     arrRev[j] = arr[i];
    	   // }
    	   // for(int i=0;i<size;i++){
    	   //     System.out.print(arrRev[i]+" ");
	       // }
	       // System.out.println();
	       
	       
	       //optimal solution by swaping
	       int i = size-1;
	       int j = 0;
	       while(j<i){
	           int temp = arr[i];
	           arr[i] = arr[j];
	           arr[j] = temp;
	           i--;
	           j++;
	       }
	       for(int k=0;k<size;k++){
    	       System.out.print(arr[k]+" ");
	        }
	       System.out.println();
	       
	    }
	}
}
