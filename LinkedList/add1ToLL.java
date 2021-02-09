// { Driver Code Starts



import java.io.*;
import java.util.*;
class Node
{
    int data;
    Node next;
    
    Node(int x)
    {
        data = x;
        next = null;
    }
}
class GfG
{
    public static void printList(Node node) 
    { 
        while (node != null)
        { 
            System.out.print(node.data);
            node = node.next; 
        }  
        System.out.println();
    } 
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Node head = new Node( s.charAt(0) - '0' );
                    Node tail = head;
                    for(int i=1; i<s.length(); i++)
                    {
                        tail.next = new Node( s.charAt(i) - '0' );
                        tail = tail.next;
                    }
                    Sol obj = new Sol();
                    head = obj.addOne(head);
                    printList(head); 
                }
        }
}// } Driver Code Ends


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

class Sol
{
    
    public static Node reverse(Node head){
        if(head==null || head.next==null)
            return head;
        Node next = head.next;
        Node answer = reverse(head.next);
        next.next = head;
        head.next = null;
        return answer;
    }
    public static Node addOne(Node head) 
    { 
        //code here.
        Node rev = reverse(head);
        Node temp = rev;
        Node prev = null;
        
        int carry = 0;
        if(temp.data!=9){
            temp.data = temp.data+1;
        }else{
            while(temp!=null){
              if(temp.data==9){
                temp.data = 0; 
                carry = 1;
              }
              else{
                if(carry==1){
                    temp.data = temp.data+1;
                    carry = 0;
                    break;
                }
              }
              prev = temp;
              temp = temp.next;
            }
        }
        
        if(carry == 1){
            Node n = new Node(1);
            prev.next = n;
            prev = prev.next;
        }
        Node ans = reverse(rev);
        return ans;
        
    }
}
