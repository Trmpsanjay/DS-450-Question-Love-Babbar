// { Driver Code Starts
// driver

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG{
    
    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            
            int n = sc.nextInt();
            int val = sc.nextInt();
            
            Node first = new Node(val);
            Node tail = first;
            for(int i=0; i<n-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            int m = sc.nextInt();
            val = sc.nextInt();
            
            Node second = new Node(val);
            tail = second;
            for(int i=0; i<m-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            Solution g = new Solution();
            Node res = g.addTwoLists(first, second);
            printList(res);
        }
    }
}
// } Driver Code Ends


/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution{
    public static Node reverse(Node head){
        if(head==null || head.next==null)
            return head;
        Node next = head.next;
        Node answer = reverse(head.next);
        next.next = head;
        head.next = null;
        return answer;
    }
    static Node addTwoLists(Node first, Node second){
        // code here
        // return head of sum list
        int carry = 0;
        Node head = null;
        Node tail = null;
        Node temp1 = reverse(first);
        Node temp2 = reverse(second);
        int prevCarry = 0;
        int count1 =0;
        int count2=0;
        while(temp1!=null && temp2!=null){
            carry = (temp1.data+temp2.data+prevCarry)/10;
            if(head==null){
                head = tail = temp1;
                if(carry==0){
                    head.data = temp1.data+temp2.data;
                }else{
                    head.data = (temp1.data+temp2.data+prevCarry)%10;
                }
            }else{
                tail.next = temp1;
                tail = tail.next;
                 if(carry==0){
                    tail.data = temp1.data+temp2.data+prevCarry;
                }else{
                    tail.data = (temp1.data+temp2.data+prevCarry)%10;
                }
            }
            prevCarry = carry;
            temp1 = temp1.next;
            temp2 = temp2.next;
            count1++;
            count2++;
        }
        
        if(temp1!=null){
            while(temp1!=null){
                tail.next = temp1;
                tail = tail.next;
                if(carry ==0){
                    break;
                }
                carry = (temp1.data+prevCarry)/10;
                tail.data = (temp1.data+prevCarry)%10;
                prevCarry = carry;
                temp1 = temp1.next;
                count1++;
            }
            if(carry!=0){
                Node n = new Node(1);
                tail.next = n;
                tail = n;
            }
        }
         if(temp2!=null){
             while(temp2!=null){
                tail.next = temp2;
                tail = tail.next;
                if(carry ==0){
                    break;
                }
                carry = (temp2.data+prevCarry)/10;
                tail.data = (temp2.data+prevCarry)%10;
                prevCarry = carry;
                temp2 = temp2.next;
            }
            if(carry!=0){
                Node n = new Node(1);
                tail.next = n;
                tail = n;
            }
            count2++;
         }
         if(count1==count2 && carry!=0){
            Node n = new Node(1);
            tail.next = n;
            tail = n;
        }
        Node ans = reverse(head);
        return ans;
    }
}
