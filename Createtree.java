import java.util.Scanner;

class Node{
    int data;
    Node left;
    Node Right;
    public Node(int data){
        this.data = data;
    }
}
public class Createtree {
    static Scanner sc =null;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
       Node root = addNode();
       System.out.println("The value of root node is : " + root.data);
    }
    static Node addNode(){
        Node root = null;
        System.out.println("Enter the value of node");
        int data = sc.nextInt();
        if(data == -1){
            return null;
        }
        root = new Node(data);
        System.out.println(" Enter the left for : " + data);
        root.left = addNode();
        System.out.println("Enter the right for : " + data);
        root.Right = addNode();
        return root;

    }

    
}
