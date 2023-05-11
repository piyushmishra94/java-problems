public class Knapsack {
    static int [] val = {0,150,300,200};;
    static int [] wt = { 0,1,4,3 };
    public static void main(String[] args) {
       
        int max = Maxweight(3,4);
        System.out.println(" The maximum value is : " + max);
    }
    public static int Maxweight(int i, int c){
        if(i == 0 || c == 0 ){
           return 0;
        }
        if(wt[i] > c){
            return Maxweight(i-1, c);
        }
        int i_selected   = val[i] + Maxweight(i-1, c-wt[i]);
        int i_not_select = Maxweight(i-1, c);
        return Math.max(i_selected, i_not_select);
    }
}
