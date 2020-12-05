// { Driver Code Starts
//Initial template for Java


// link :https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1

import java.io.*;
import java.util.*;

class GFG {
    
 // } Driver Code Ends


//User function template for Java

public static void sort012(int a[], int n){
   
    // //count number of 0 ,1 and 2
    
    // int zero = 0 , one = 0, two = 0; 
    // for(int i=0;i<n;i++){
    //     if(a[i]==0)
    //         zero++;
    //     else if(a[i]==1)
    //         one++;
    //     else
    //         two++;
    // }
    // for(int i = 0; i<n; i++){
    //     if(i<zero)
    //         a[i] = 0;
    //     else if(i>=one && i<zero + one)
    //         a[i] = 1;
    //     else
    //         a[i] = 2;
    // }
    
    // giving wrong answer for some cases // need to b check 21349 testcase par
    
    
    
    int i = 0 , nextTwo = a.length-1, nextZero =0;
    while(i<=nextTwo){
        if(a[i] == 0){
            // swap with next zero
            int temp = a[i];
            a[i] = a[nextZero];
            a[nextZero] = temp;
            i++;
            nextZero++;
        }
        else if(a[i]==2){
            //swap i with next two
            int temp = a[i];
            a[i] = a[nextTwo];
            a[nextTwo] = temp;
            nextTwo--;
            //i++ dont do because at nextTwo position it may be 1 or 0 so in case of 1 it fails
        }
        else{
            i++; // i has its sorted value
        }
    }
    
    
    
    
}

// { Driver Code Starts.

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}

  // } Driver Code Ends
