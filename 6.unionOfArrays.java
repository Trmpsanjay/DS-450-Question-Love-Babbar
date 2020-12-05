import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     public static int union(int arr1[],int arr2[]){
         int count =0;
         HashMap<Integer,Boolean> maps = new HashMap<>();
         for(int i=0;i<arr1.length;i++){
             if(maps.containsKey(arr1[i])){
                 continue;
             }
             else{
                 maps.put(arr1[i],true);
             }
         }
          for(int i=0;i<arr2.length;i++){
             if(maps.containsKey(arr2[i])){
                 continue;
             }
             else{
                 maps.put(arr2[i],true);
             }
         }
         return maps.size();
     }
	public static void main (String[] args)
	 {
	     Scanner sc = new Scanner(System.in);
	     int testCases = sc.nextInt();
	     while(testCases-->0){
	         int size1 = sc.nextInt();
	         int size2 = sc.nextInt();
	         int arr1[] = new int[size1];
	         int arr2[] = new int[size2];
	         for(int i=0;i<size1;i++){
	             arr1[i] = sc.nextInt();
	         }
	         for(int i=0;i<size2;i++){
	             arr2[i] = sc.nextInt();
	         }
	         
	         System.out.println(union(arr1,arr2));
	     }
	 }
}
