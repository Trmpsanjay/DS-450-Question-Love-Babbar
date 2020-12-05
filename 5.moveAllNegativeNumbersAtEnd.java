import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t-->0){
	        int size = sc.nextInt();
	        int arr[] = new int[size];
	        for(int i=0; i<size; i++){
	            arr[i] = sc.nextInt();
	        }
	        
	       int temp[] = new int[size];
	       int p =0;
	       for(int data: arr){
	           if(data>=0)
	                temp[p++] = data;
	       }
	        for(int data: arr){
	           if(data<0)
	                temp[p++] = data;
	       }
	       for(int data : temp){
	           System.out.print(data+" ");
	       }
	       
	        System.out.println();
	        
	    }
	    
	 }
}
