//link : https://leetcode.com/problems/intersection-of-two-arrays/submissions/


import java.util.ArrayList;
import java.util.HashMap;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer>  ans = new ArrayList<>();
        HashMap<Integer,Boolean> maps = new HashMap<>();
        if(nums1.length>nums2.length){
            for(int i=0;i<nums1.length;i++){
                if(maps.containsKey(nums1[i])){
                    continue;
                }
                else{
                    maps.put(nums1[i],true);
                }
            }
            
            for(int i=0;i<nums2.length;i++){
                if(maps.containsKey(nums2[i])){
                    if(ans.contains(nums2[i])){
                        //nothing
                    }
                    else{
                       ans.add(nums2[i]); 
                    }
                }
            }
            int arr[] = new int[ans.size()];
            for(int i=0;i<arr.length;i++){
                arr[i] = ans.get(i);
            }
            return arr;
        }
        else{
            for(int i=0;i<nums2.length;i++){
                if(maps.containsKey(nums2[i])){
                    continue;
                }
                else{
                    maps.put(nums2[i],true);
                }
            }
            
            for(int i=0;i<nums1.length;i++){
                if(maps.containsKey(nums1[i])){
                    if(ans.contains(nums1[i])){
                        //nothing
                    }
                    else{
                        ans.add(nums1[i]);
                    }
                }
            }
            int arr[] = new int[ans.size()];
            for(int i=0;i<arr.length;i++){
                arr[i] = ans.get(i);
            }
            return arr;
            
        }
        
    }
}
