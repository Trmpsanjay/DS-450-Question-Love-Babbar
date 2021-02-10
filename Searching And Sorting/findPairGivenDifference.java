import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     public static int findPair(int[] a,int x){
        HashSet<Integer> set=new HashSet<>();
        for(int i : a){
            set.add(i);
        }
        for(int i : a){
            if(set.contains(Math.abs(i-x)))
                return 1;
        }
        return -1;
    }
	public static void main (String[] args)
	 {
	    Scanner sc = new Scanner(System.in);
	    int testCases = sc.nextInt();
	    
	    while(testCases-->0){
	        int size = sc.nextInt();
	        int diff = sc.nextInt();
	        int arr[] = new int[size];
	        for(int i=0;i<size; i++){
	            arr[i] = sc.nextInt();
	        }
	       int answer = findPair(arr,diff);
	       System.out.println(answer);
	        
	    }
	 }
}
