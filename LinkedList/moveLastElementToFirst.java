//easy so directly copied from gfg for reference


void moveToFront() 
    { 
        /* If linked list is empty or it contains only 
           one node then simply return. */
           if(head == null || head.next == null)  
              return; 
  
        /* Initialize second last and last pointers */
        Node secLast = null; 
        Node last = head; 
  
        /* After this loop secLast contains address of  
           second last  node and last contains address of  
           last node in Linked List */
        while (last.next != null)   
        { 
           secLast = last; 
           last = last.next;  
        } 
  
        /* Set the next of second last as null */
        secLast.next = null; 
  
        /* Set the next of last as head */
        last.next = head; 
  
        /* Change head to point to last node. */
        head = last; 
    }         
