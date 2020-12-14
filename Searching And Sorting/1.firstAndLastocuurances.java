/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
     public static int modifiedBinary1(int nums[],int target){
        int low = 0;
        int high = nums.length-1;
        int index = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]>target){
                high = mid-1;
            }
            else if(nums[mid]<target){
                low = mid+1;
            }
            else{
                index = mid;
                low = mid+1;
            }
        }
        return index;
        
    }
     public static int modifiedBinary2(int nums[],int target){
        int low = 0;
        int high = nums.length-1;
        int index = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]>target){
                high = mid-1;
            }
            else if(nums[mid]<target){
                low = mid+1;
            }
            else{
                index = mid;
                high = mid-1;
            }
        }
         return index;
        
    }
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		while(testCases-->0){
		    int n = sc.nextInt();
		    int x = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i=0;i<n;i++){
		        arr[i] = sc.nextInt();
		    }
		    int first = modifiedBinary2(arr,x);
		    int last = modifiedBinary1(arr,x);
		    if(first==-1){
		        System.out.println("-1");
		    }
		    else
		        System.out.println(first+" "+last);
		}
	}
}