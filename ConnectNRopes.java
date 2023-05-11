import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class ConnectNRopes {
    public static void main(String[] args) {
        // Finding the minimum cost to connect n ropes
        int [] arr ={2,5,4,8,6,9};
        System.out.println(" The minimum cost is : " + FindnRope(arr));
    }
    public static int FindnRope(int[] arr){
        int res =0;
        //PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); for max heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(); 
        for(int i=0 ;i<arr.length;i++){
            pq.add(arr[i]);
        }
        //System.out.println(" The priority queue is : " + pq);
        int a,b;
        while(pq.size() > 1)
        {
            a = pq.poll();
            b = pq.poll();
            System.out.println("The value of a is : " + a);
            System.out.println("The value of a is : " + b);
            b = a+b;
            res = res +b;
            pq.add(b);
        }
        System.out.println(" The priority queue is : " + pq);
        return res;
    }
}
