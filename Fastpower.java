public class Fastpower {
    public static void main(String[] args) {
        System.out.println(" The value of fastpower is : " + Fastpower1(3, 5));
        
    }
    public static int Fastpower1(int a, int b){
        int res =1;
        while(b > 0){

            if((b&1) !=0){
                res = res *a;
            }

            a =a*a;
            b = b >> 1;
        }
        return res;
    }
    public static long Modulopower(long a , long b){
        long res =1;
        while(b > 0){
            if((b&1) !=0){
               
            }
        }

        return res;
    }
}
