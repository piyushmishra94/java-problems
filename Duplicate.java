public class Duplicate {
    public static void main(String[] args) {
        int [] arr = {3,1,3,4,2};
        System.out.println(" The repeating elements is" + findDuplicate(arr));
    }
    
 public static int findDuplicate(int[] nums) {
    int slow = nums[0];
    int fast = nums[0];

    while(true) {
        slow = nums[slow];
        fast = nums[nums[fast]];

        if(slow == fast) {
            break;
        }
    }

    // fast = nums[0];
    // while(slow != fast) {
    //     slow = nums[slow];
    //     fast = nums[fast];
    // }

    return slow;
}
}
