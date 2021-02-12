// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}// } Driver Code Ends


// User function Template for Java
// simple aproach to solve using hashmap but space complexity will be o(n) and also sorting but o(nlogn)

class Solve {
    int[] findTwoElement(int arr[], int n) {
       int missing = Integer.MIN_VALUE;
       int repeating = Integer.MAX_VALUE;
       boolean mark[] = new boolean[n+1];
       for(int i=0;i<arr.length;i++){
           if(mark[arr[i]]==false)
                mark[arr[i]]=true;
            else{
                repeating = arr[i];
            }
       }
       for(int i=1;i<mark.length;i++){
           if(mark[i]==false)
                missing = i;
       }
       int ans[] ={repeating,missing};
       return ans;
    }
}
