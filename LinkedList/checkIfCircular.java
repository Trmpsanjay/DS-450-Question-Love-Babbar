

/* Structure of LinkedList
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
*/
class GfG
{
    boolean isCircular(Node head)
    {
	if(head==null ||head.next==null)
	    return false;
	 
	 Node temp = head;
	 while(temp!=null ||temp==head){
	     temp = temp.next;
	      if(temp==head)
	        return true;
	 }
	 return false;
    }
}
