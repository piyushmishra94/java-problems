public class Subsequencepalindrome {
    public static void main(String[] args) {
        String s1 = "abcab";
        String s2 = "aecb";
        FindLengthsubsequence(s1,s2);
    }
    public static void FindPartitionofPalindrome(String s1){
        int n = s1.length()+1;
        int [][] dp = new int [n][n];
        for(int gap=1 ; gap<n; gap++){
            for(int row =0,col =gap; row <n-gap; row++,col++){

            }
        }
    }
    public static void FindLengthsubsequence(String s1 , String s2){
        int m = s1.length()+1;
        int n = s2.length()+1;
        System.out.println(" The length of m is " + m);
        System.out.println(" The length if n is " + n);
        int [][] dp = new int [m][n];
        for(int i =1 ;i<m;i++){
            for(int j=1; j<n;j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        System.out.println("The Length of longest common subsequence is " + dp[m-1][n-1]);
    }
    
}
