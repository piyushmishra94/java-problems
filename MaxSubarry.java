public class MaxSubarry {
    public static void main(String[] args) {
        int[] arr = {12, 5,31,9,21,8};
        int n = arr.length;
        System.out.println("The max sub array is :" + FindmaxSubarray(arr,n));
        System.out.println(" The Kadane max sub arry is : " + FindMaxKadane(arr,n));
        // System.out.println(" The contigious sum is : " + Findingthearry(arr,n));
        
    }
    public static int FindmaxSubarray(int a [] ,int n){
        //int ans = Integer.MIN_VALUE;
        int ans = 45;
        int x =0;
        int y=0;
        for(int i=0;i<n;i++){
            int temp =0;
        for(int j =i; j<n;j++){
            temp += a[j];
            
            if(temp == ans){
                ans =temp;
                x = i;
                y = j;
            }
        }
            
        }
        System.out.println("The value of i and j is " + x + y);
        return ans;
    }
    // Kadanes algorithm
   public static int FindMaxKadane(int [] a, int n){
        int max = Integer.MIN_VALUE;
        int temp =0;
        for(int i=0;i<n;i++){
            temp = temp+ a[i];
            if( max < temp){
                max =temp;
            }
            if(temp<0){
                temp =0;
            }
        }
        return max;
    }
    // public static int [] Findingthearry(int [] a, int n){

    // }
}
