class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        HashMap<Integer,Integer> maps = new HashMap<>();
        int count = 0;
        for(int data : arr){
            if(maps.containsKey(k-data)){
                count = count + maps.get(k-data);
            }
            if(maps.containsKey(data)){
                maps.put(data,maps.get(data)+1);
            }
            else{
                maps.put(data,1);
            }
        }
        
        return count;
        
    }
}
