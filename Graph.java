import java.util.ArrayList;
import java.util.Scanner;

public class Graph {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        System.out.println("Enter the no of vertices");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter total no of vertices connected with : " + i);
            int m = sc.nextInt();
            list.add(new ArrayList<>());
            for(int j=0;j<m;j++){
                System.out.println("Enter the vertices connected to : " + i);
                int x = sc.nextInt();
                list.get(i).add(x);
            }
        }
      System.out.println(" The value of List is : " );
      for (int i = 0; i < list.size(); i++) {
        System.out.println("Adjacency list of " + i);
        for (int j = 0; j < list.get(i).size(); j++) {
            System.out.print(list.get(i).get(j) + " ");
        }
        System.out.println();
    }
    // for (ArrayList<Integer> arrayList : list) {
    //     for (ArrayList<Integer> arrayList2 : arrayList) {
            
    //     }
    // }
    PrintGraph(list);
    }
    public static void  PrintGraph(ArrayList<ArrayList<Integer> > adj){ 
        for (int i = 0; i < adj.size(); i++) {
            System.out.println("Adjacency list of " + i);
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j) + " ");
            }
            System.out.println();
        }    
   }  
}
