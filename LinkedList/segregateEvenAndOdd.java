// { Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.io.*;

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
}
class GFG{
	static void printList(Node node) 
	{ 
		while (node != null) 
		{ 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
		System.out.println(); 
	}
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            Solution ob = new Solution();
            Node ans = ob.divide(n, head);
            printList(ans); 
            t--;
        }
    } 
} // } Driver Code Ends


//User function Template for Java

/* 
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution{
    Node divide(int N, Node head){
        Node evenHead,oddHead,evenTail,oddTail;
        evenHead = oddHead = evenTail = oddTail = null;
        while(head!=null){
            if(head.data%2==0){
                if(evenHead==null){
                    evenHead = evenTail = head;
                }else{
                    evenTail.next = head;
                    evenTail = evenTail.next;
                }
            }else{
                 if(oddHead==null){
                    oddHead  = oddTail = head;
                }else{
                    oddTail.next = head;
                    oddTail = oddTail.next;
                }
            }
            head = head.next;
        }
        if(oddTail!=null)
            oddTail.next = null;
        if(evenTail!=null)
            evenTail.next = null;
        if(evenTail==null){
            return oddHead;
        }
        evenTail.next = oddHead;
        return evenHead;
    }
}
