 // the idea is put all smaller iin  one array and and maximum in second array
 //link : https://practice.geeksforgeeks.org/problems/merge-two-sorted-arrays5135/1

class Solution {

    public void merge(int arr1[], int arr2[], int n, int m) {
        
        int i = arr1.length-1;
        int j = 0
        while(i>=0 && j<arr2.length){
            if(arr1[i]<arr2[j]){
               break;
            }else{
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
}
