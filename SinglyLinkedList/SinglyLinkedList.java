public class SinglyLinkedList {

 
    public static void main(String[] args)
    {
        Insert in=new Insert();
		Deletion del=new Deletion();
        in.insertelement(25);
        in.insertelement(32);
        in.insertelement(45);
        in.insertelement(6);
        in.insertelement(24);
        in.insertelement(52);
		
		del.head=in.head;
		
		in.display();
		
		del.deletion(6);
		
		in.head=del.head;
		
		in.display();
        
       
    }
    
}