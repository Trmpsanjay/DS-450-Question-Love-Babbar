//input 
//1st line size
//2nd line : Elements of the array
import java.util.Scanner;

public class MaxMinWithMinCompare {
	public static int[] maxMinWithMinComparison(int arr[]) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		if(arr.length%2==0){
			if(arr[0]>arr[1]){
				max = arr[0];
				min = arr[1];
			}
			else{
				max = arr[1];
				min = arr[0];
			}
		}
			
		else{
			max=min = arr[0];
			}
		
		
		int i = 0;
		if(arr.length%2==0) {
			i=2;
		}
		else
			i=1;
		for(int j=i;j<arr.length-1;j=j+2) {
			if(arr[j]>arr[j+1] ){
				if(arr[j]>max)
					max = arr[j];
				if(arr[j+1]<min)
					min = arr[j+1];
			}else {
				if(arr[j+1]>max)
					max=arr[j+1];
				if(arr[j]<min)
					min = arr[j];
			}
		}
		int ans[] = {min,max};
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		int ans[] = maxMinWithMinComparison(arr);
		System.out.println("Min Number "+ans[0]);
		System.out.println("Max Number "+ans[1]);
		

	}

}

