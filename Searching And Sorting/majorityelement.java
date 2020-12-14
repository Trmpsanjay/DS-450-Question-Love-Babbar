class Majority
{
    static int majorityElement(int a[], int size)
    {
       if(a.length==1){
            return a[0];
        }
        Arrays.sort(a);
        int i=0;
        int ansMax =-1;
        int count =0;
        while(i+1<=a.length-1){
            
            if(a[i]==a[i+1]){
                count++;
                if(count>=(a.length)/2){
                    ansMax = a[i];
                }
            }
            else{
                count=0;
            }
            i++;
        }
        return ansMax;
    }
}
