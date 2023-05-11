public class Possibleways2dtoreachlowest {
    public static void main(String[] args) {
        int [][] arr = new int [4] [4];
        System.out.println(" The possible ways to reach the destination is : " + possible_ways(arr,3,3));
        
    }
    public static int possible_ways(int arr [][] , int n, int m){
        if(n == 1 || m==1){
            return 1;
        }
        return(possible_ways(arr, n-1, m) +  possible_ways(arr, n, m-1));
       
    }
}





