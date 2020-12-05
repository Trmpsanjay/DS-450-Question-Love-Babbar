// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int m = Integer.parseInt(inputLine[1]);
            int arr1[] = new int[n];
            int arr2[] = new int[m];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr1[i] = Integer.parseInt(inputLine[i]);
            }
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < m; i++) {
                arr2[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().merge(arr1, arr2, n, m);

            StringBuffer str = new StringBuffer();
            for (int i = 0; i < n; i++) {
                str.append(arr1[i] + " ");
            }
            for (int i = 0; i < m; i++) {
                str.append(arr2[i] + " ");
            }
            System.out.println(str);
        }
    }
}// } Driver Code Ends



class Solution {

//     public void merge(int arr1[], int arr2[], int n, int m) {
//       // the idea is put all smaller iin  one array and and maximum in second array
      
//       int i = arr1.length-1;
//       int j =0;
//       while(i>=0 && j<arr2.length){
//           if(arr1[i]<=arr2[j]){
//                 break;
//             } 
//           // if 1st ka largest 2nd ka smallest se jyada hai to swap
//           else{
//               int temp = arr1[i];
//               arr1[i] = arr2[j];
//               arr2[j] = temp;
//           }
//           i--;
//           j++;
//           //if 1st ka max 2nd ke min se chota hai ya brabar to aage kuch karne ki jarurat na hai
//       }
//       // now sort both arrays
//           Arrays.sort(arr1);
//           Arrays.sort(arr2);
//     }
// }

class Solution {

    public void merge(int arr1[], int arr2[], int n, int m) {
      // the idea is put all smaller iin  one array and and maximum in second array
      
      int i = arr1.length-1;
      int j =0;
      while(i>=0 && j<arr2.length){
          if(arr1[i]<=arr2[j]){
                break;
            } 
          // if 1st ka largest 2nd ka smallest se jyada hai to swap
          if(arr1[i]>arr2[j]){
              int temp = arr1[i];
              arr1[i] = arr2[j];
              arr2[j] = temp;
          }
          i--;
          j++;
          //if 1st ka max 2nd ke min se chota hai ya brabar to aage kuch karne ki jarurat na hai
      }
      // now sort both arrays
          Arrays.sort(arr1);
          Arrays.sort(arr2);
    }
}
