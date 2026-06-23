
package tree;

import java.util.LinkedList;
import java.util.Queue;

public class Traversal
{
    public void inorder(Node root)
    {
        if (root != null) 
        {
            inorder(root.left);

            System.out.print(root.data + " ");

            inorder(root.right);
        }
        
    }
    
    public void preorder(Node root)
    {
        if (root != null)
        {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
       
    }
    public void postorder(Node root)
    {
        if (root != null)
        {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
       
    }
    public  void levelOrder(Node root) 
    {

        if (root == null)
        {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty())
        {

            Node current = queue.poll();

            System.out.print(current.data + " ");

            if (current.left != null)
            {
                queue.add(current.left);
            }

            if (current.right != null) 
            {
                queue.add(current.right);
            }
        }
    }
}