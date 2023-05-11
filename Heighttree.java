import java.util.*;
import java.util.Map.Entry;
class Pair{
    int hd;
    Node node;
    public Pair(int hd , Node node){
        this.hd = hd;
        this.node = node;
    }
}

public class Heighttree {
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
        System.out.println("The Inorder traversal is : " );
        Inorder(Root);
        System.out.println("The Level order traversal is : ");
        LeveOrder(Root);
        System.out.println(" The height of tree is : " + HghtTree(Root));
        System.out.println("The Levels of tree is:  " + LevelTree(Root));
        System.out.println(" The left view of a tree is : ");
        LeftView(Root);
        System.out.println("The vertical order traversal : ");
        VerticalTraversal(Root);

    }

    public static void VerticalTraversal(Node root){

        Map<Integer, ArrayList<Integer> > map = new TreeMap<>();
        Queue<Pair> q = new ArrayDeque<>();
        q.add(new Pair(0, root));
        while(!q.isEmpty()){
            Pair curr = q.poll();
            if(map.containsKey(curr.hd)){
                map.get(curr.hd).add(curr.node.data);
            }else{
                ArrayList<Integer> list = new ArrayList<>();
                list.add(curr.node.data);
                map.put(curr.hd, list);
            }
            
            if(curr.node.left != null){
                q.add(new Pair(curr.hd-1, curr.node.left));
            }
            if(curr.node.Right != null){
                q.add(new Pair(curr.hd+1, curr.node.Right));
            }

        }
      System.out.println("Here the list is given below : " );
      for (Entry<Integer, ArrayList<Integer>> element : map.entrySet()) {
            System.out.print(element.getKey());
            System.out.print(element.getValue() + "  ");

      }
        
    }

    public static void LeftView(Node root){
        LinkedList <Integer> List = new LinkedList<>();
        if(root == null){
            System.out.println(" There is no value to return");

        }
        else{
            FillLeftView(root,List,1);

        }
        for (Integer integer : List) {
            System.out.println(" " + List);
        }

    }
    public static void FillLeftView(Node root , LinkedList list, int Level ){
        if(Level == 1){

        }
    }
    public static void LeveOrder(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node p = q.poll();
            System.out.print(" " + p.data);
            if(p.left != null){
                q.add(p.left);
            }
            if(p.Right != null){
                q.add(p.Right);
            }
        }
    }
    public static void Inorder(Node root){
        if(root != null){
          
            Inorder(root.left);
            System.out.print(" " + root.data);
            Inorder(root.Right);

        }
    }
    public static int HghtTree(Node root){
        if(root == null){
            return 0;
        }
        else{
            return 1+Math.max(HghtTree(root.left),HghtTree(root.Right));
        }
    }
    public static int LevelTree( Node Root){
        if(Root == null){
            return 1;
        }
        else{
           return 1+Math.max( LevelTree(Root.left) , LevelTree(Root.Right));
        }
    }

    public static void Insertnode(Node root, int data){
        if(data < root.data ){
            if(root.left !=null){
                Insertnode(root.left, data);
            }
            else{
                root.left = new Node(data);
            }
        }
        else if(data >= root.data){
            if(root.Right !=null){
                Insertnode(root.Right, data);
            }
            else{
                root.Right = new Node(data);
            }
        }
    }
    
}
class Node{
    int data;
    Node left, Right;
    public Node(int data){
        this.data=data;
        left = null; 
        Right = null;
    }
}
