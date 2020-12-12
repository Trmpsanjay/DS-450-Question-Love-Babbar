package string;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintAllSubSequences {
	
	static ArrayList<String> arr = new ArrayList<String>();
	public static void  allSubsequence(String s,String ans){
		//base case
		if(s.length()==0) {
			arr.add(ans);
			return;
		}
		//if char at 0 take part in ans
		allSubsequence(s.substring(1), ans + s.charAt(0));
		//if char at 0 not take part in the answer
		allSubsequence(s.substring(1), ans);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
//		printAllSubSequences(s);
//		System.out.println();
//		printSubstrings(s);
		allSubsequence(s, "");
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
		

	}

}
