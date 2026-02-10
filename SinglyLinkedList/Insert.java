class Insert 
{
    Node head;
    void insertelement(int data)
    {
        Node n=new Node(data);
        if(head==null)
        {
            head=n;
            return;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=n;
	}
	
        
        
        void display()
        {
            
            if(head==null)
            {
                System.out.println("list is empty");
            }
			Node temp = head;
            while(temp!=null)
            {
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
			System.out.println("null");
        }
    
        
    
}