/***********
 
Following is the Linked list node structure already written 
 
class ListNode<t> {
	public t data;
	 public ListNode<t> forw;
	 public ListNode<t> backw;
	 public ListNode(t data)
	 {
		 this.data=data;
	 }
}

************/


public class solution {

	public static void findPairs(ListNode<Integer> head,int n) {
        ListNode<Integer> temp=head;
        ListNode<Integer> tail = head;
        while(tail.forw!=null)
            tail = tail.forw;
        while(temp!=tail){
            if(temp.data+tail.data==n)
                System.out.println(temp.data+" "+tail.data);
            if((temp.data+tail.data)>n){
                tail = tail.backw;
            }else
                temp = temp.forw;
        }
  
        
		
	}
}


