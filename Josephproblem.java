public class Josephproblem {
    public static void main(String[] args) {
        System.out.println(" The remaining index is : " + Findtheremain(5,3) );
    }
    public static int Findtheremain(int n, int k){
 
        if(n == 1){
            return 0;
        }
        else{
         return (Findtheremain(n-1, k) + k ) %n;
        }
    }  
}
