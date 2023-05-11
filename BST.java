import java.util.*;

public class BST {
    public static void main(String[] args) {
        int [] arr = new int [] {4,5,6,7,8,9,1,2,3};
        int n = arr.length-1;
       // int start = StartIndex(arr,4,0,n);
       // System.out.println(" The result is : " + Binary(arr, 1 , 0 ,n));
       int arr1 [] = new int [] {3,2,1,5,6,4} ;
        int f = findKthLargest(arr1,2);
        System.out.println(" The f is " + f);
    //    arr1 = searchRange();
    //    for(int i=0;i<2;i++){
    //     System.out.println(arr1[i]);
    //    }
    }
    public static int findKthLargest(int[] nums, int k) {
        Queue<Integer> que = new PriorityQueue<>( Collections.reverseOrder());
        for(int i=0; i<nums.length;i++){
            que.add(nums[i]);
        }    
        while( k>1){
            k--;
             que.poll();
        }
        return que.poll();
    }
    public static int [] searchRange() {
        int target =8;
        int nums [] = new int [] {5,7,7,8,8,10};
        int left = 0 ;
         int right = nums.length -1;
         int output [] = new int[2];
             while (left <= right){
                if (nums[left] == target){
                    output[0] = left;
                     while (left < right){
                         if (nums[right] == target ){
                             output[1] = right;
                            return output;
                         }else {
                             right = right - 1;
                         }
                     }
                     output[1] = left;
                    return output;
                }else if (nums[left] < target){
                    left = left + 1;
                }else if (nums[right] > target) {
                    right = right - 1;
                }
 
             }
 
 
        return new int[] {-1 , -1};
     }

    public static int StartIndex(int [] arr, int target , int low , int high){
        if(low == high){
            return low;
        }
        else{
            int mid = (low + high)/2;
            if(target < arr[mid]){
                return StartIndex(arr, target, mid+1, high);
            }
            else{
                return StartIndex(arr, target, low, mid);
            }
        }
    }
    public static int Binary(int [] arr, int target , int low , int high){
        if(low > high){
             return -1;
           }
       else{ 
            int mid = (low + high)/2;
             if(target == arr[mid]){
                return mid;
            }
            if(target < arr [mid]){
               return  Binary(arr, target, low, mid);
            }
            else{
               return Binary(arr, target, mid+1, high);
            }
        }
    }
}
