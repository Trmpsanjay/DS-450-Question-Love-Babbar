package arrays;
import java.io.*;
import java.math.BigInteger;
import java.util.*;

	  public class Main2 {

	    public static void main(String[] args) throws Exception {
	        BufferedReader br =
	            new BufferedReader(new InputStreamReader(System.in));
	        int tc = Integer.parseInt(br.readLine());
	        while (tc-- > 0) {
	            int n = Integer.parseInt(br.readLine());
	            int[] arr = new int[n];
	            String[] inputLine = br.readLine().split(" ");
	            for (int i = 0; i < n; i++) {
	                arr[i] = Integer.parseInt(inputLine[i]);
	            }

	            System.out.println(new Solution().maxProduct(arr, n));
	        }
	    }
	}
	// } Driver Code Ends


	// Wrong Answer. !!!Wrong Answer

	// Possibly your code doesn't work correctly for multiple test-cases (TCs).

	// The first test case where your code failed:

	// Input:
	// 10
	// 90 91 -91 91 -91 -90 90 90 -90 -90

	// Its Correct output is:
	// 404928287208900000

	// And Your Code's output is:
	// 449942298618103232

	//soln is overflow while using long so using BigInteger



	// modified kadanes algorithm 
	class Solution {
	    // Function to find maximum product subarray
	    long maxProduct(int[] arr, int n) {
	       //modified kadanes algoritm
	       BigInteger maxProduct1 = BigInteger.ZERO;
	       BigInteger currProduct = BigInteger.ONE;
	       for(int i =0; i<n;i++){
	           currProduct = currProduct.multiply(BigInteger.valueOf(arr[i]));
	           maxProduct1 = currProduct.max(maxProduct1);
	           int res = currProduct.compareTo(BigInteger.ZERO);
	           if(res==0) {
	        	   currProduct = BigInteger.ONE;
	           }
	       }
	       
	        //reverse bcz in case of [3,-1,25] gives wrong answer
	      currProduct = BigInteger.ONE;
	      for(int i= n-1;i>=0;i--){
	    	  currProduct = currProduct.multiply(BigInteger.valueOf(arr[i]));
	           maxProduct1 = currProduct.max(maxProduct1);
	           int res = currProduct.compareTo(BigInteger.ZERO);
	           if(res==0) {
	        	   currProduct = BigInteger.ONE;
	      }
	    }
	      long answer = maxProduct1.longValue();
	      return answer;
	}
	
}
