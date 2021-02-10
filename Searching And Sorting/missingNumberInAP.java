// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String arr[] = in.readLine().trim().split("\\s+");
            int A = Integer.parseInt(arr[0]);
            int B = Integer.parseInt(arr[1]);
            int C = Integer.parseInt(arr[2]);
            
            Solution ob = new Solution();
            System.out.println(ob.inSequence(A, B, C));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static int inSequence(int A, int B, int C){
        // code here
        //edge case
        if(A==B)
            return 1;
        double answer = (((double)B-(double)A)/(double)C)+1;
        if(answer<=0){
            return 0;
        }
        //ystem.out.println(answer);
        double fraction = answer - (long)answer;
        if(fraction==0)
            return 1;
        else
            return 0;
        
    }
}
