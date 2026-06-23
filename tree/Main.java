
package tree;

public class Main 
{
    public static void main(String[] args)
    {
         System.out.println("Program Started");
        Node root = new Node(8);
        
        root.left = new Node(4);
        root.right = new Node(12);
        
        root.left.left = new Node(2);
        root.left.right = new Node(6);
        
        root.right.left = new Node(10);
        root.right.right = new Node(14);
                
        Traversal t = new Traversal();

        System.out.print("Inorder: ");
        t.inorder(root);

        System.out.println();

        System.out.print("Preorder: ");
        t.preorder(root);

        System.out.println();

        System.out.print("Postorder: ");
        t.postorder(root);

        System.out.println();

        System.out.print("Level Order: ");
        t.levelOrder(root);       
                
   
    }
    
}
