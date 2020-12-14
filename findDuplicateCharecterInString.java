package string;

import java.util.Scanner;

public class FindDuplicateCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int arr[] = new int[256];
		for(int i=0;i<s.length();i++) {
			arr[s.charAt(i)] = arr[s.charAt(i)] + 1;
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>0) {
				System.out.println((char)i+" : "+arr[i]);
			}
		}
	}

}
