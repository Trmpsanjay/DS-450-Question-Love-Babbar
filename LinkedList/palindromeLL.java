// { Driver Code Starts
import java.util.*;

class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}

class Is_LinkedList_Palindrom
{
	 Node head;  
	 Node tail;
	
	/* Function to print linked list */
    void printList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
	
 
    /* Inserts a new Node at front of the list. */
    public void addToTheLast(Node node) 
	{

		if (head == null) 
		{
			head = node;
			tail = node;
		} else 
		{
		    tail.next = node;
		    tail = node;
		}
    }
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		 
		while(t>0)
        {
			int n = sc.nextInt();
			//int k = sc.nextInt();
			Is_LinkedList_Palindrom llist = new Is_LinkedList_Palindrom();
			//int n=Integer.parseInt(br.readLine());
			int a1=sc.nextInt();
			Node head= new Node(a1);
            Node tail = head;
            for (int i = 1; i < n; i++) 
			{
				int a = sc.nextInt(); 
			    tail.next = new Node(a);
			    tail = tail.next;
			}
			
			Palindrome g = new Palindrome();
			if(g.isPalindrome(head) == true)
			    System.out.println(1);
		    else
			    System.out.println(0);
			t--;
		}
		
	}
}



// } Driver Code Ends


/* Structure of class Node is
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/

class Palindrome
{
    
    public static Node middle(Node node){
        if(node==null || node.next==null)
            return node;
        Node slow,fast;
        slow = fast = node;
        while(fast!=null && fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    public static Node reverse(Node node){
       if(node==null || node.next==null)
            return node;
        Node next = node.next;
        Node finalNode = reverse(node.next);
        next.next = node;
        node.next = null;
        return finalNode;
    }
    
    // Function to check if linked list is palindrome
    // boolean isPalindrome(Node head) 
    // {
    //     Node dummy = head;
    //     String temp = "";
    //     while(dummy!=null){
    //         char ch = (char)dummy.data;
    //         temp = temp +ch;
    //         dummy = dummy.next;
    //     }
    //     int i=0,j=temp.length()-1;
    //     while(i<=j){
    //         if(temp.charAt(i++)!=temp.charAt(j--))
    //             return false;
    //     }
        
    //     return true;
       
       
      
    // }    
    //optimal soln
     boolean isPalindrome(Node head) 
    {
        if(head==null || head.next==null)
            return true;
        Node mid = middle(head);
        mid.next = reverse(mid.next);
        mid = mid.next;
        Node temp = head;
        while(mid!=null){
            if(temp.data!=mid.data)
                return false;
            mid = mid.next;
            temp = temp.next;
        }
        return true;
       
       
      
    }    
    
}


