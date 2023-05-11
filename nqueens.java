public class nqueens {
    public static void main(String[] args) {
        int [][] arr = new int [4][4];
        int row =1;
        nqueens(arr,row,4,4);
        
    }
    public static boolean nqueens(int [][]arr, int row,int n,int col){
        if(row == n){
            return true;
        }
        for(int i=0; i<n ;i++){
            if(isSafe(arr,row,col)){
                arr[row][i] =1;
                if(nqueens(arr, row+1, n, col))
                {
                    return true;
                }
                arr[row][i] =0;

            }
        }
        return true;
    }
    public static boolean isSafe(int [][] arr, int row, int col ){
        return true;
    }
    
}
