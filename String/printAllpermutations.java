import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
       public static String[] printPermutations(String input){
            if(input.length()==0){
                String[] s={""};
                return s;
            }
            String smallans[]=printPermutations(input.substring(1));
            String ans[]=new String[(smallans.length)*(smallans[0].length()+1)];
            int l=0;
            for(int i=0;i<smallans.length;i++){
                for(int j=0;j<=smallans[i].length();j++){
                    ans[l]=smallans[i].substring(0,j)+input.charAt(0)+smallans[i].substring(j);
                    l++;
                    
                }
            
            }
            return ans;
        }
	public static void main (String[] args)
	 {
	    Scanner sc = new Scanner(System.in);
	    int testCases = sc.nextInt();
	    while(testCases-->0){
	        String str = sc.next();
	        String ans[] = printPermutations(str);
	        Arrays.sort(ans);
	        for(int i=0;i<ans.length;i++){
	            System.out.print(ans[i]+" ");
	        }
	        System.out.println();
	        
	    }
	 }
}
