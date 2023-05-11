import java.util.*;

public class BFSandDFS {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        CreateGraph(adj);
        Print(adj);
        BFS(adj);
        DFS(adj);
    }
    public static void DFS( ArrayList<ArrayList<Integer> > adj){
            int src =0;
            boolean [] visited = new boolean[adj.size()];
            System.out.println(" The DFS Traversal is below : ");
            Stack<Integer> stk = new Stack<>();
            stk.push(src);

            for(int i=0;i<adj.size();i++){
                   visited[i] = false; 
            }
            System.out.println(" " + src);
            while(!stk.isEmpty()){
                int y = stk.pop();
                System.out.println(" " + y);
                for(int i=0;i<adj.get(y).size();i++){
                     int m = adj.get(y).get(i);
                        if(!visited[m]){
                           
                            stk.push(m);
                            visited[m] = true;
                        }
                }

            }
    }
    public static void CreateGraph( ArrayList<ArrayList<Integer> > adj ){
        System.out.println(" Enter the total no of vertices : ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.println(" Enter the total no of vertices connected with " + i);
            int m = sc.nextInt();
            adj.add ( new ArrayList<Integer>());
            for(int j=0; j<m; j++){
                System.out.println(" enter vertices with :  " + i);
                int x =sc.nextInt();
                adj.get(i).add(x);
            }
        }
    }
    public static void Print( ArrayList<ArrayList<Integer> > adj ){
        System.out.println(" The value of the List : " + adj);
        System.out.println(" Lets print the normal traverasal : ");
        for (ArrayList<Integer> arrayList : adj) {
            for (Integer List : arrayList) {
                System.out.print( " " + List);    
            }  
        }   
    }
    public static void BFS( ArrayList<ArrayList<Integer> > adj ){
        int src =0;
        boolean [] visited = new boolean[adj.size()];
        Queue<Integer> que = new ArrayDeque<>();
        que.add(src);
        System.out.println(" The bfs traversal of the graph is below ");
        for(int i=0 ;i<adj.size();i++){
            visited[i] = false;
        }
        visited[src] =true;
        System.out.println(" " + src);
        while(!que.isEmpty()){
            int x = que.remove();
            for(int i=0;i<adj.get(x).size();i++){
                int y = adj.get(x).get(i);
                if(!visited[y]){
                    visited[y] =true;
                    System.out.print(" " + y);
                    que.add(y);
                }
            }
        }
          
    }
   
}
