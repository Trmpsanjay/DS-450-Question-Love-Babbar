static Node partition(Node head,Node tail){
      Node prev=head,cur=head.next;
      Node pivot=head;
      int data=0;
      while(cur!=tail.next){
          if(cur.data<pivot.data){
             
              data=prev.next.data;
              prev.next.data=cur.data;
              cur.data=data;
              prev=prev.next;
          }
          cur=cur.next;
          
      }
          data=pivot.data;
              pivot.data=prev.data;
              prev.data=data;
              return prev;
    }
    
    static void quickSortrec(Node head,Node tail){
      if(head==tail || tail== null || head==null) return;
      
      Node pivot=partition(head,tail);
      
      quickSortrec(head,pivot);
      quickSortrec(pivot.next,tail);
    }
    
    public static Node quickSort(Node node)
    {
       Node tail=node,head=node;
       while(tail.next!=null)
       tail=tail.next;
       quickSortrec(head,tail);
       return node;
    }
