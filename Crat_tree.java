import java.util.Scanner;

class Node{
    int data;
    Node left;
    Node Right;
    public Node (int data){
        this.data =data;
    }
}
public class Crat_tree {
    static Scanner sc = null;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
       // System.out.println("Enter the value of data ");
        Node root = AddNode();
        System.out.println("The value of root node is : " +root.data);
        System.out.println("The preorder traversal");
        Preorder(root); // Node left right
        System.out.println("The Inorder traversal");
        Inorder(root); // left Node right
        System.out.println("The postorder traversal");
        Postorder(root); //left right node
        
    }
    public static void Preorder( Node root){
        if(root == null){
            return;
        }
        System.out.print( " " + root.data);
        Preorder(root.left);
        Preorder(root.Right);

    }
    public static void Postorder(Node root){
        if(root == null){
            return;
        } 
        Postorder(root.left);
        Postorder(root.Right);
        System.out.println( " " +root.data);
    }
    public static void Inorder(Node root){
        if(root == null){
            return;
        } 
        Inorder(root.left);
        System.out.println(" " + root.data);
        Inorder(root.Right);
        
    }
    public static Node AddNode(){
        Node root = null;
        System.out.println("Enter the value of node");
        int data = sc.nextInt();
        if(data == -1){
            return null;
        }
        root = new Node(data);
        System.out.println(" Enter the left for : " + data);
        root.left = AddNode();
        System.out.println("Enter the right for : " + data);
        root.Right = AddNode();
        return root;

    }
    
}
