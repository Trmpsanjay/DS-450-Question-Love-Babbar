import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    public static boolean threeSum(int arr[],int x){
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int  j = i+1;
            int k = arr.length-1;
            while(j<k){
                if(arr[i]+arr[j]+arr[k]==x)
                    return true;
            
                else if(arr[i]+arr[j]+arr[k]>x)
                    k--;
                else
                    j++;
            }
        }
        return false;
    }
	public static void main (String[] args)
	 {
	   Scanner sc = new Scanner(System.in);
	   int testCases = sc.nextInt();
	   while(testCases-->0){
	        int size = sc.nextInt();
	        int  x = sc.nextInt();
	        int sum = 0 ;
	        boolean count = false;
    	    int arr[] = new int[size];
    	    for(int i=0;i<size;i++){
    	        arr[i] = sc.nextInt();
    	    }
    	    //// not 
    	   // for(int i=0;i<size-2;i++){
    	   //     for(int j=i+1;j<size-1;j++){
    	   //         for(int k=j+1;k<size;k++){
    	   //             sum = arr[i] + arr[j] + arr[k];
    	   //             if(sum==x){
    	   //                 count = true;
    	   //             }
    	   //         }
    	   //     }
    	   // }
    	    if(threeSum(arr,x))
    	        System.out.println("1");
            else{
               System.out.println("0"); 
            }
	   }
    	    
	   
	 }
}
