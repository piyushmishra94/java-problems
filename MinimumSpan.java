import java.util.*;
class Pair{
    int vertices;
    int weight;
    public Pair(int vertices , int weight){
        this.vertices = vertices;
        this.weight = weight;
    }
}
public class MinimumSpan {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        CreateGraph(adj);
        Print(adj);
    }
    public static void CreateGraph( ArrayList<ArrayList<Pair> > adj ){
        System.out.println(" Enter the total no of vertices : ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.println(" Enter the total no of vertices connected with " + i);
            int m = sc.nextInt();
            adj.add ( new ArrayList<Pair>());
            for(int j=0; j<m; j++){
                System.out.println(" enter vertice and weight with :  " + i);
                int x =sc.nextInt();
                int y = sc.nextInt();
                adj.get(i).add(new Pair(x, y));
            }
        }
    }
    public static void Print( ArrayList<ArrayList<Pair> > adj ){
        System.out.println(" The value of the List : " + adj);
        System.out.println(" Lets print the normal traverasal : ");
        for (ArrayList<Pair> arrayList : adj) {
            for (Pair List : arrayList) {
                System.out.print( " " + List);    
            }  
        }   
    }
}
