import java.util.Arrays;

public class Coinchange {
    public static void main(String[] args) {
        int arr [] = {186,419,83,408};
        int[] dp = new int[arr.length+1];
        Arrays.fill(dp,-1);
        System.out.println(minCoins(arr,6249,dp));
    }
    public static int minCoins(int[] coins,int n ,int[] dp){
        if(n==0) return 0;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<coins.length;i++){
            if(n-coins[i]>=0){
            int subAns = 0;
            if(dp[n-coins[i]]!=-1){
                subAns=dp[n-coins[i]];
            }else{
                subAns = minCoins(coins,n-coins[i],dp);
            }
            if(subAns!=Integer.MAX_VALUE && subAns+1<ans){
                ans = subAns+1;
            }
          }
        }
        return dp[n] = ans;
    }
    public static int coinChange(int[] coins, int amount) {
        for(int i=0;i<coins.length;i++){
            for(int j=i;j<coins.length;j++){
                if(coins[i] > coins[j]){
                    int temp = coins[i];
                    coins[i] = coins[j];
                    coins[j] =temp;
                }
            }
        }
        // for(int i=0;i<coins.length;i++){
        //     System.out.println(coins[i]);
        // }
        int n = coins.length-1;
        int count =0;
        
        while(n >=0 && amount !=0){
            if((amount- coins[n] )>= 0){
                amount = amount- coins[n];
             //  System.out.println(" coins : " + coins[n]);
                count++;
            }
            else{
              //  System.out.println(" n : " +n);
                n--;
            }

        } 
        System.out.println(" Amount : " +amount + " " + count);
        if(amount == 0){
            return count;
        } 
        else{
            return -1;
        }  
    }
}
