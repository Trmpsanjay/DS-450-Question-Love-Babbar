import java.util.Stack;

class Solution {
  
    public void reverseString(char[] s) {
        // initialize i with first charecter index
        int i=0;
        //initialize j with last charecter
        int j= s.length-1;
        // swap the charecter until i<j
        while(i<j){
            char temp = s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
     
        

        
        
        
    }
}
