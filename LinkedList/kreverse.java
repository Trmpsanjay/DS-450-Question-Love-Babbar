// { Driver Code Starts
import java.util.*;
import java.lang.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class ReverseInSize
{
    static Node head;
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            Node tail = head;
            for(int i = 1; i < n; i++)
            {
                int a = sc.nextInt();
                // addToTheLast(new Node(a));
                tail.next = new Node(a);
                tail =tail.next;
            }
            
            int k = sc.nextInt();
            GfG gfg = new GfG();
            Node res = gfg.reverse(head, k);
            printList(res);
            System.out.println();
        }
    }
    
    public static void printList(Node node)
    {
        while(node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    
}

// } Driver Code Ends


/*node class of the linked list

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/

class GfG
{
    // public static int count(Node node){
    //     int count =0;
    //     while(node!=null){
    //         count++;
    //         node = node.next;
    //     }
    //     return count;
    // }
    public Node reverse(Node node, int k) {
        // if(node == null || k==1)
        //     return node;
            
        //   Node dummy = new Node(0);
        //     dummy.next = node;
        //     Node curr = dummy,nextMine = dummy ,prev = dummy;
        //     int count = count(node);
        //     while(count>0){
        //         curr = prev.next;
        //         nextMine = curr.next;
        //         for(int i=1; i < k; i++){
        //             curr.next = nextMine.next;
        //             nextMine.next = prev.next;
        //             prev.next = nextMine;
        //             nextMine = curr.next;
        //         }
        //         prev = curr;
        //         count = count-k;
                
        //     }
        //   return dummy.next;
        
        // above not working because leetcode e ye alag hai isme sabko karna hai
            Node prev=null,curr=node,temp = null;
            int count=k;
            while(count-->0 && curr!=null){
                temp=curr.next;
                curr.next=prev;
                prev=curr;
                curr=temp;
            }
            if(node!=null) 
                node.next=reverse(temp,k);
            return prev;
    }
}


