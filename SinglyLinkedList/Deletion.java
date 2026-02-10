class Deletion 
{
	Node head;
    void deletion(int delelement)
    {
     
        if(head==null)
        {
            System.out.println("list is empty");
            return;
        }
    
    if(delelement==head.data)
    {
        head=head.next;
        System.out.println("Element is deleted");
        return;
    }
    
    Node temp=head;
    
    while(temp.next!=null && temp.next.data!=delelement)
    {
        temp=temp.next;
    }
    if(temp.next!=null)
    {
    temp.next=temp.next.next;
        System.out.println("Element is sucessfully deleted.");
    }
    else
    {
        System.out.println("Element not found");
    }
	
	return ;
    }
        
        
       
     
    
}