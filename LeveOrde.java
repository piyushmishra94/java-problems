import java.util.*;

public class LeveOrde {

    public static void main(String[] args) {
        Node Root = new Node(6);
        Insertnode(Root,10 );
        Insertnode(Root,9 );
        Insertnode(Root,8);
        Insertnode(Root,7 );
        Insertnode(Root,6);
        Insertnode(Root,5 );
        Insertnode(Root,11 );
        Insertnode(Root,12 );
        Insertnode(Root,1 );
        Insertnode(Root,2 );
        Insertnode(Root,5 );
        Insertnode(Root,18 );  
       // Inorder(Root);
        LevelOrderTraversal(Root);

    }
    public static void LevelOrderTraversal(Node root){
        Queue <Node> q = new LinkedList <>(); 
        q.add(root);
        while(!q.isEmpty()){
            Node curr = q.poll();
            System.out.println(curr.data);
            if(curr.left != null){
                q.add(curr.left);
            }
            if(curr.Right != null){
                q.add(curr.Right);
            }
        }

    }
    public static void Inorder( Node Root){
        if(Root != null){
            Inorder(Root.left);
            System.out.print(Root.data);
            Inorder(Root.Right);
        }
    }
    public static void Insertnode(Node root , int data){
        if(data < root.data){
            if(root.left != null){
                Insertnode(root.left, data);
            }
            else{
                System.out.println(" Inserting in left of " + root.data + data );
                root.left = new Node(data);
            }
        }
        else{
            if(root.Right !=null){
                Insertnode(root.Right, data);
            }
            else{
                System.out.println("Insert the value in right of " + root.data + data);
                root.Right = new Node(data);
            }
        }
    }
   
}
class Node{
    int data;
    Node left, Right;
    public  Node(int data){
        this.data = data;
        left = null;
        Right = null;
    }
}
