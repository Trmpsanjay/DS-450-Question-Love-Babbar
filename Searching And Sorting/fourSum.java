// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {
            String[] nk = br.readLine().trim().split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            Solution sln = new Solution();
            ArrayList<ArrayList<Integer>> ans = sln.fourSum(a, k);
            for (ArrayList<Integer> v : ans) {
                for (int u : v) {
                    System.out.print(u + " ");
                }
                System.out.print("$");
            }
            if (ans.isEmpty()) {
                System.out.print(-1);
            }
            System.out.println();
        }
    }
}// } Driver Code Ends


// User function Template for Java

// arr[] : int input array of integers
// k : the quadruple sum required

class Solution {
    // public boolean binarySearch(int nums[],int target,int si,int ei){
    //     if(ei<si){
    //         return false;
    //     }
    //     int mid = (si+ei)/2;
    //     if(nums[mid]==target)
    //         return true;
    //     else if(nums[mid]>target){
    //         return binarySearch(nums,target,si,mid-1);
    //     }
    //     else
    //         return binarySearch(nums,target,mid+1,ei);
    // }
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        // ArrayList<ArrayList<Integer>> res= new ArrayList<ArrayList<Integer>>();
        // if(arr.length==0){
        //     return res;
        // }
        // Arrays.sort(arr);
        
        // // HashMap<Integer> map = new HashMap<Integer>();
        // for(int i=0;i<arr.length;i++){
        //   for(int j=i+1;j<arr.length;j++){
        //         for(int l=0;l<arr.length;l++){
        //             int req = k-arr[i]+arr[j]+arr[l];
        //             boolean found = binarySearch(arr,req,l+1,arr.length-1);
        //             if(found){
        //                 ArrayList<Integer> ans = new ArrayList<>();
        //                 ans.add(arr[i]);
        //                 ans.add(arr[j]);
        //                 ans.add(arr[l]);
        //                 ans.add(req);
        //                 res.add(ans);
                        
        //             }
        //         }
        //     }
        // }
        // return res;
        // ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        // Arrays.sort(arr);
        // int n = arr.length;
        // for(int i=0;i<n;i++){
        //      int target_3 = k - arr[i];
        //     //System.out.println("ith Loop");
        //     for(int j=i+1;j<n;j++){
        //         //System.out.println("jth Loop");
        //         int target = target_3-arr[j];
        //         int front = j+1;
        //         int back =- n-1;
        //         while(front<back){
        //             int sum = arr[front]+arr[back];
        //             if(sum<target){
        //                 front++;
        //             }
        //             else if(sum>target){
        //                 back--;
        //             }
        //             else{
        //                 //System.out.println("final answe Loop");
        //                 ArrayList<Integer> ans = new ArrayList<>();
        //                 ans.add(arr[i]);
        //                 ans.add(arr[j]);
        //                 ans.add(arr[front]);
        //                 ans.add(arr[back]);
        //                 result.add(ans);
                        
        //                 // processing duplicate num 3
        //                 while(front<back && arr[front]==ans.get(2))
        //                     ++front;
        //                 // processing duplicate num 4
        //                 while(front<back && arr[front]==ans.get(3))
        //                     --back;
        //             }
        //         }
        //         //processing for duplicates at num 2
        //         while(j+1<n && arr[j+1]==arr[j]){
        //             ++j;
        //         }
        //         while(i+1<n && arr[i+1]==arr[i]){
        //             ++i;
        //         }
        //     }
        // }
        // return result;
        
        // i dont know why above is not working
        
        int num[] = arr; // made for not changing the code
        int target = k;
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        
        if (num == null || num.length == 0)
            return res;
        
        int n = num.length;
    
        Arrays.sort(num); 
    
        for (int i = 0; i < n; i++) {
        
            int target_3 = target - num[i];
        
            for (int j = i + 1; j < n; j++) {
            
                int target_2 = target_3 - num[j];
            
                int front = j + 1;
                int back = n - 1;
            
                while(front < back) {
                
                    int two_sum = num[front] + num[back];
                
                    if (two_sum < target_2) front++;
                
                    else if (two_sum > target_2) back--;
                
                    else {
                    
                        ArrayList<Integer> quad = new ArrayList<>(); 
                        quad.add(num[i]);
                        quad.add(num[j]);
                        quad.add(num[front]);
                        quad.add(num[back]);
                        res.add(quad);
                    
                        // Processing the duplicates of number 3
                        while (front < back && num[front] == quad.get(2)) ++front;
                    
                        // Processing the duplicates of number 4
                        while (front < back && num[back] == quad.get(3)) --back;
                
                    }
                }
                
                // Processing the duplicates of number 2
                while(j + 1 < n && num[j + 1] == num[j]) ++j;
            }
        
            // Processing the duplicates of number 1
            while (i + 1 < n && num[i + 1] == num[i]) ++i;
        
        }
    
        return res;
        
    }
}
