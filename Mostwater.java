public class Mostwater {
    public static void main(String[] args) {
        int [] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(" The maximum value of water store is : " + maxArea(arr));
        System.out.println(" The optimize maxarea : " + maxAreaOptimize(arr));
    }
    public static int maxAreaOptimize(int[] height) {
        int max =0;
        int left =0;
        int right = height.length-1;
        while(left < right){
           int w    = right-left;
           int h    = Math.min(height[right] , height[left]);
           int Area = w*h;
        //    System.out.println(" The left and Right is : " + left + right);
        //    System.out.println("The Area is : " + Area);
           max = Math.max(Area,max);
           if(height[left] < height[right]){
             left++;
           }
           else if(height[right] < height[left]  ){
             System.out.println(" The value right and left is " + height[right] + " " + height[left]);
             right--;
           }
           else{
             left++;
             right--;
           }
           
        }
        return max;
    }
    public static int maxArea(int[] height) {
        int max =0;
        for(int i=0 ;i<height.length-1;i++){       
            for(int j=height.length-1 ; j>i;j--){              
                if(height[i] <= height[j]){
                    int tempmax = (j-i) * height[i];
                    max = Math.max(max,tempmax);
                }
                else{
                    int tempmax = (j-i) * height[j];
                    max = Math.max(max,tempmax);
                }
            }
        }
        return max;
    }
}
