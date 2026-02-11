
package linkedlists;

public class LinkedLists {

    public static void main(String[] args) {
        Insertion in = new Insertion();      
        in.addAtEnd(10);
        in.addAtEnd(20);
        in.addAtEnd(40);
        in.addAtEnd(50);
        in.display();
        System.out.println();
        in.insertMiddle(30, 3);
        in.display();
    }
    
}
