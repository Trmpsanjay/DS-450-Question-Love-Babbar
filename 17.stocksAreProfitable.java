//link : https://leetcode.com/problems/best-time-to-buy-and-sell-stock/



// the idea is that pahle kharidenge tab hi to bechenege 
//exp  array : 7 1 5 3 6 4 
// agar 7rs me kharidte hai to 1 , 5, 3,6,4 me bech sakte hai
//agar 1 rs me kharidte hai to 5 3 6 4 rs me bech sakte hai and so on
 // so hame min khojna hai and max and phir jo hmara abhi ka price hoga usme se min ghta ke and abtak ka jo max hai un dono ka max nikalna hai



class Solution {
    public int maxProfit(int[] prices){
        if(prices.length==0)
                return 0;
        int min = Integer.MAX_VALUE;
        int max =Integer.MIN_VALUE;
        for (int i =0;i<prices.length;i++) {
            min = Math.min(min, prices[i]);
            int difference = prices[i]-min;
            max = Math.max(difference, max);
        }
        return max;
        
    }
}
