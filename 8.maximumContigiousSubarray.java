// { Driver Code Starts
import java.io.*;

class Array {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Kadane obj = new Kadane();
		    
		    //calling maxSubarraySum() function
		    System.out.println(obj.maxSubarraySum(arr, n));
		}
	}
}

// } Driver Code Ends


class Kadane{
    
    
     // video link : https://www.youtube.com/watch?v=VMtyGnNcdPw
    // Function to find subarray with maximum sum
    // arr: input array
    // n: size of array
    int maxSubarraySum(int arr[], int n){
        int currentSum = arr[0];
        int overAllSum = arr[0];
        for(int i=1;i<n;i++){ //i =1 bcz 0 phle hi consider kar liye hai
            //here make currensum 2 case +ve and -ve and arr[i] , +ve and -ve on comparing getting below result
            if(currentSum>=0)
                currentSum = currentSum+arr[i];
            else{
                currentSum = arr[i];
            }
            
            // if currentsum>=overallsum update overallSum;
            if(currentSum>=overAllSum){
                overAllSum = currentSum;
            }
        }
        return overAllSum;
        
    }
    
}

