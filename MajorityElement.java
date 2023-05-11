public class MajorityElement {
    public static void main(String[] args) {
        // count is greater than n/2
        int arr [] ={1,2,1,1,2,1,3,3,1,1,1,4,4};
        int n = arr.length;
        System.out.println("The majority element is : " + FindMajority(arr,n) );
    }
    public static int FindMajority(int arr[], int n){
        int count =1;
        int ansIndex =0;
        for(int i=1;i<n;i++){
            if(arr[ansIndex] == arr[i]){
                count++;
            }
            else{
                count--;
            }
            if(count ==0){
                ansIndex = i;
                count = 1;
              //  System.out.println(" The value of ansIndex is : " + ansIndex);
            }

        }
        System.out.println(" The ans is : " + ansIndex);
        count = 0;
        for(int i=0;i<n;i++){
            if(arr[ansIndex] == arr[i]){
                count++;
            }
        }
        if(count > n/2){
            return arr[ansIndex];
        }
        else{
            System.out.println(" There is no such element is present ");
            return 0;
        }
       

    }
}
