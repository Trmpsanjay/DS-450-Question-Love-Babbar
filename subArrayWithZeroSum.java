static boolean findsum(int arr[],int n)
{
   int currSum = 0;
   for(int i=0;i<arr.length;i++){
       if(arr[i]==0)
            return true;
        else{
            currSum = currSum+arr[i];
            if(currSum==0)
                return true;
        }
   }
   return false;
}
