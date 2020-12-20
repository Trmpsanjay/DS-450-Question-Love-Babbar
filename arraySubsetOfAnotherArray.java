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
	        Set<Integer> set = new HashSet<>();
    	    boolean subset = true;
    	    int size1 = sc.nextInt();
    	    int size2 = sc.nextInt();
    	    int arr1[] = new int[size1];
    	    for(int i=0;i<size1;i++){
    	        arr1[i] = sc.nextInt();
    	        set.add(arr1[i]);
    	    }
    	    int arr2[] = new int[size2];
    	    for(int i=0;i<size2;i++){
    	        arr2[i] = sc.nextInt();
    	        if(set.contains(arr2[i])==false){
    	            System.out.println("No");
    	            subset = false;
    	        }
    	    }
    	    if(subset)
    	        System.out.println("Yes");
	    }
	 }
}
